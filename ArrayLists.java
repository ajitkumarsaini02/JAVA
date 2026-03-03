// Importing required classes
import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
   public static void main(String args[]) {

       // Creating ArrayLists of different data types
       ArrayList<Integer> list = new ArrayList<Integer>();   // Integer type list
       ArrayList<String> list2 = new ArrayList<String>();    // String type list
       ArrayList<Boolean> list3 = new ArrayList<Boolean>();  // Boolean type list
      
       // Add elements
       list.add(1);
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.println(list);  // Print list

       // Get an element
       int element = list.get(0); // 0 is the index
       System.out.println(element);

       // Add element in between
       list.add(1,2); // 1 is index, 2 is element to be added
       System.out.println(list);

       // Set element (replace value)
       list.set(0,0); // Replace element at index 0 with 0
       System.out.println(list);

       // Delete element
       list.remove(0); // Remove element at index 0
       System.out.println(list);

       // Size of list
       int size = list.size(); // Returns number of elements
       System.out.println(size);

       // Loop on list
       for(int i=0; i<list.size(); i++) {
           System.out.print(list.get(i) + " ");
       }
       System.out.println();

       // Sorting the list
       list.add(0);            // Add element
       Collections.sort(list); // Sort in ascending order
       System.out.println(list);
   }
}