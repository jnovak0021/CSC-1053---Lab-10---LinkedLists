public class IntLinkedList
{
   private IntNode head;
   
   //add to front method
   public void addToFront(int i)
   {
      //construct IntNode object with paramter i
      IntNode theNode = new IntNode(i);
      //set the node that head points to as next
      theNode.setNext(head);
      //set head to point to new node theNode
      head = theNode;
      
   }
   
   //method to print out linked list while current node is not null
   public void print()
   {
      IntNode current = head;
      
      while(current != null)
      {
         //print the node and traverse
         System.out.println(current.getData());
         current = current.getNext();
      }
   }
   
   //recursively print linked list, call printRecPrivate with IntNode parameter
   public void printRec()
   {
      printRecPrivate(head);
   }
   
   
   //private recursive print method with IntNode paramenter
   private void printRecPrivate(IntNode current)
   {
      //if node is not null, print and recursively call printRecPrivate with next node
      if(current!= null)
      {
         System.out.println(current.getData());
         printRecPrivate(current.getNext());
      }
   }
   
   
   //returns if delete was successful
   public boolean deleteAt(int i)
   {
      //if linked list is empty, return false
      if(head == null)
         return false;  
      
      //if i == 0, set head to index 1   
      if(i == 0)
      {
         head = head.getNext(); 
         System.out.println("Deleting at place 0!");
         return true;
      }
      
      int counter = 1;
      IntNode current = head.getNext();
      IntNode prev = head;
      
      //run while loop till counter is equal to i, and current isn't null
      while(counter != i && current != null)
      {
         //update values to next in linked list
         prev = current;
         current = current.getNext();
         counter++;
      }
      
      //return false if no value at current
      if(current == null)
         return false;
         
      //if current is not null, then have previous node skip current and point to next
      prev.setNext(current.getNext());
      System.out.println("Deleting at place " + counter + "!");
      return true;
   }
   
   
   //length method which takes in IntNode
   public int length()
   {
      //set current to head
      IntNode current = head;
      
      //call private length recursion method and return length
      return privateLength(current);
   }
   
   
   //private length recursion method that takes in an IntNode and calculates the length
   private int privateLength(IntNode current)
   {
       //if linked list is empty, return length as 0
      if(current == null)
      {
         return 0;
      }
      //if linked list is not empty, call length at next node and return +1
      else
      {
         return privateLength(current.getNext()) +1;
      }   
   }


   //method to insert a number using iteration at a specific index
   public boolean iterativeInsert(int index, int num)
   {
      //IntNode current
      IntNode current = head;
      //newNode to add
      IntNode newNode = new IntNode(num);
      int i =0;
      
      //if index is longer than the length of the linked list, add to end
      if(index >= length())
      {
         //traverse while next node is not null
         while(current.getNext() != null)
         {
            current = current.getNext();
         }
         //set next value to newNode;
         current.setNext(newNode);
         System.out.println("Inserting " + num + " at place " + index + "!");
         return true;
      }
      //if index is less than length of linked list, add to beggining
      if(index < 0)
      {
         addToFront(num);
         System.out.println("Inserting " + num + " at place " + index + "!");
         return true;
      }
      
      //run loop while i != index
      //traverse to spot before where we want to add
      while(i < index-1)
      {
         //set current equal to next value in loop
         current = current.getNext();
         i++;
      }
      newNode.setNext(current.getNext());
      current.setNext(newNode);
      System.out.println("Inserting " + num + " at place " + index + "!");
      return true;
   }
   
   
   //method delete specific data at first occurance in linked list
   public boolean deleteData(int data)
   {
      //IntNode object to keep track of previous value
      IntNode previous = head;
      //loop to make to make sure previous +1 is not null
      //check to see if head is desired data, if so point head to next value
      if(head.getData()==data)
      {
         head = head.getNext();
         System.out.println("Deleting " + data);
         return true;
      }
      
      while(previous.getNext() != null)
      {
         //if the data at previous.getNext() equals the desired data, skip over previous.getNext()
         if(previous.getNext().getData() == data)
         {
            previous.setNext(previous.getNext().getNext());
            System.out.println("Deleting " + data);
            return true;
         }
         else
         {
            previous = previous.getNext();
         }
      }
      return false;
   }
   

   //toString method
   //Create a toString to print out the list in the format below.
   public String toString()
   {
      //IntNode current to keep track of linked list
      IntNode current = head;
      String linkedListString = "";
      linkedListString += "printing the list: ";
      
      //traverse list till current is null
      while(current != null)
      {
         linkedListString += current.getData() + " ";
         //update value of current to next node
         current = current.getNext();
      }
      return linkedListString;
   }
  
  
   //recursive insert method at index
   public boolean recInsert(int index, int num)
   {
      //create current and set equal to head
      IntNode current;
      current = head;
      //check list to see if it is null
      if(current == null)
         return false;
         
   
      //if index is less than or equal to zero, add ot front
      if(index <= 0)
      {
         addToFront(num);
         System.out.println("inserting (rec) " + num + " at place " + index + "!");
         return true;
      }
      else
      {  
         //recursively call privateRecInsert
         return privateRecInsert(current,index,num);
      }
   }
   
   
   //private print recursive method to tracerse Linked List until desired index is reached
   private boolean privateRecInsert(IntNode node, int index, int num)
   {
      //if node.getNext() == null, add to end)
      if(node.getNext() == null)
      {
         //create new IntNode to add to end
         IntNode newNode = new IntNode(num);
         //connect newNode to end of linked list
         node.setNext(newNode);
         System.out.println("Inserting (rec) " +num + " at place " + (length()) + "!");
         return true;
      }
      //check to see if next node has desired index
      if(index <= 1)
      {
         //create new IntNode to add
         IntNode newNode =  new IntNode(num);
         //set newNode to point to next value
         newNode.setNext(node.getNext());
         //set node to point to next value
         node.setNext(newNode);
         
         return true;
      }
      else
      {
         //check to see if node.getNext is null
         if(node.getNext() == null)
         {
            return false;
         }
         else
         {
            //recursive call privateRecInsert traversing linked list
            return privateRecInsert(node.getNext(), index-1, num);
         }
      }
   }
    
    
    //PART TWO
    
    
    //method to delete all particular instances of value in linked list
    public boolean deleteAll(int data)
    {
      //IntNode object to keep track of previous value
      IntNode previous = head;
      
      //boolean delete to keep track is a value was deleted to return to user
      boolean delete = false;
      //check to see if head is desired data, if so point head to next value
      if(head.getData()==data)
      {
         head = head.getNext();  
         delete = true;
      }
      //traverse linked list
      while(previous.getNext() != null)
      {
         
         //if the data at previous.getNext() equals the desired data, skip over previous.getNext()
         if(previous.getNext().getData() == data)
         {
            previous.setNext(previous.getNext().getNext());
            delete = true;      
         }
         else
         {
            previous = previous.getNext();
         }
      }
      //return if a value(s) was deleted
      System.out.println("Deleting all " + data + "s");
      return delete;
   }
   
   
   //public recursive method findLastValue to find the last instance of a value in a linked list
   //call privatefindLastValue 
   //takes in parameter data 
   public int findLastValue(int data)
   {
      //create node to pass into recursive method -- set equal to head
      IntNode node = head;
      int count = 0;
      if(node.getData() == data)
         return privateFindLastValue(node,data,count,0);
      else
         return privateFindLastValue(node,data,count,-1);
   }
   
   
   //recursive method privateFindLastValue which takes in parameter data, how many times the method has been run (count), and the index at which the value was last found (found)
   private int privateFindLastValue(IntNode node, int data,int count, int found)
   {
      //intFound to store where the value was last found
      int intFound = found;
      
      //if next value is null, return intFound
      if(node.getNext() == null)
      {
         return intFound;
      }
      else
      {
         //if next nodes data matches desired data, store the index
         if(node.getNext().getData() == data)
         {
             intFound = count+1;
            
          }
         //increase count, traverse linked list, recursively call privateFindLastValue
         count++;
         node = node.getNext();
         return privateFindLastValue(node,data,count,intFound);

      }
    }
}

