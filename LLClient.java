public class LLClient
{
   public static void main(String [] args)
   {
      //create IntLinkedList object
      IntLinkedList ill = new IntLinkedList();
      
      //print out the length of the list using head reference .length()
      System.out.println("Length of list: " + ill.length());
      
      //insert 5 to front of list
      ill.addToFront(5);
      System.out.println("Inserting " + 5);
      System.out.println(ill);
      //insert to front of list 4,3,2,1,5,4,3,2,1 and print out list after each insert
      ill.addToFront(4);
      System.out.println("Inserting " + 4);
      System.out.println(ill);
      ill.addToFront(3);
      System.out.println("Inserting " + 3);
      System.out.println(ill);
      ill.addToFront(2);
      System.out.println("Inserting " + 2);
      System.out.println(ill);
      ill.addToFront(1);
      System.out.println("Inserting " + 1);
      System.out.println(ill);
      ill.addToFront(5);
      System.out.println("Inserting " + 5);
      System.out.println(ill);
      ill.addToFront(4);
      System.out.println("Inserting " + 4);
      System.out.println(ill);
      ill.addToFront(3);
      System.out.println("Inserting " + 3);
      System.out.println(ill);
      ill.addToFront(2);
      System.out.println("Inserting " + 2);
      System.out.println(ill);
      ill.addToFront(1);
      System.out.println("Inserting " + 1);
      System.out.println(ill);
      
      //delete first 1 in the list
      ill.deleteData(1);
      System.out.println(ill);
      
      //delete first 1 in the list
      ill.deleteData(1);
      System.out.println(ill);      

      //insert 10 at position 3
      ill.iterativeInsert(3,10);
      System.out.println(ill);
      
      //insert 10 at position -1
      ill.iterativeInsert(-1,10);
      System.out.println(ill);
      
      //delete at position 3
      ill.deleteAt(3);
      System.out.println(ill);
      
      //Delete at position 0
      ill.deleteAt(0);
      System.out.println(ill);
      
      //Delete at position 7
      ill.deleteAt(7);
      System.out.println(ill);
      
      //recusivley insert 11 at -1
      ill.recInsert(-1,11);
      System.out.println(ill);
      
      //recusively insert 10 at 0
      ill.recInsert(0,10);
      System.out.println(ill);
      
      //recusively insert 10 at place 10
      ill.recInsert(10,10);
      System.out.println(ill);

      //recursively insert 12 at 5
      ill.recInsert(5,12);
      System.out.println("Inserting (rec) " +12+ " at place 5!");
      System.out.println(ill);
      
      //delete at place 8
      ill.deleteAt(8);
      
      //print out length of list
      System.out.println("Length of list: " + ill.length());
      
      
      //PART 2 
      System.out.println("");
      
      //insert 2 to front of list
      ill.addToFront(2);
      System.out.println("Inserting 2");
      System.out.println(ill);
      
      //delete all 2's in the linked list
      ill.deleteAll(2);
      System.out.println(ill);
      
      //find the last instance of value 4
      System.out.println("Finding the last index of 4: " + ill.findLastValue(4));
      
      //delete all 4's in the linked list
      ill.deleteAll(4);
      System.out.println(ill);   

      //insert 5 to front of list
      ill.addToFront(5);
      System.out.println("Inserting a 5");      
      System.out.println(ill);
      
      //delete all 5's in the linked list
      ill.deleteAll(5);
      System.out.println(ill);    
      
      //find the last instance of value 10
      System.out.println("Finding the last index of 10: " + ill.findLastValue(10));      
      
      //find the last instance of value 1
      System.out.println("Finding the last index of 1: " + ill.findLastValue(1));      
      
      //insert 6 to front of list
      ill.addToFront(6);
      System.out.println("Inserting a 6");      
      System.out.println(ill);           
           
      //find the last instance of value 6
      System.out.println("Finding the last index of 6: " + ill.findLastValue(6)); 
      System.out.println(ill);
      
      //print out the length of the list using head reference .length()
      System.out.println("Length of list: " + ill.length());
   }  
}
