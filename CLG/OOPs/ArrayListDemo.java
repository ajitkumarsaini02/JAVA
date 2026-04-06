import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add some names to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // addAll() method to add multiple elements at once
        ArrayList<String> moreNames = new ArrayList<>();
        moreNames.add("David");
        moreNames.add("Eve");
        names.addAll(moreNames);

        //size() method to get the number of elements in the ArrayList
        int size = names.size();
        System.out.println("Size of the ArrayList: " + size);

        // remove() method to remove an element by value
        names.remove("Alice");
        names.remove(1); // Remove the element at index 1 (Bob)

        //clear() method to remove all elements from the ArrayList
        // names.clear();
        
        // Print the ArrayList
        System.out.println("Names: " + names);

        // Access an element by index
        String firstName = names.get(0);
        System.out.println("First name: " + firstName);

        // Remove an element
        names.remove("Bob");
        System.out.println("Names after removal: " + names);

        // Check if the ArrayList contains a specific name
        boolean hasCharlie = names.contains("Charlie");
        System.out.println("Contains Charlie: " + hasCharlie);

        //clone() method to create a copy of the ArrayList
        @SuppressWarnings("unchecked")
        ArrayList<String> clonedNames = (ArrayList<String>) names.clone();
        System.out.println("Cloned Names: " + clonedNames);

        // Common shallow-copy approaches for ArrayList
        ArrayList<String> copyUsingConstructor = new ArrayList<>(names);
        ArrayList<String> copyUsingAddAll = new ArrayList<>();
        copyUsingAddAll.addAll(names);

        System.out.println("Shallow copy using constructor: " + copyUsingConstructor);
        System.out.println("Shallow copy using addAll: " + copyUsingAddAll);

        //contains() method to check if an element exists in the ArrayList
        boolean hasEve = names.contains("Eve");
        System.out.println("Contains Eve: " + hasEve);

        //indexOf() method to find the index of an element
        int indexOfCharlie = names.indexOf("Charlie");
        System.out.println("Index of Charlie: " + indexOfCharlie);

        //lastIndexOf() method to find the last index of an element
        names.add("Charlie"); // Adding another "Charlie" to demonstrate lastIndexOf
        int lastIndexOfCharlie = names.lastIndexOf("Charlie");
        System.out.println("Last index of Charlie: " + lastIndexOfCharlie);

        //removeAll() method to remove all elements that are in another collection
        ArrayList<String> namesToRemove = new ArrayList<>();
        namesToRemove.add("Charlie");

        //removeRange() method to remove a range of elements
        // names.removeRange(0, 2); // This method is protected and cannot be called directly
        names.removeAll(namesToRemove);
    }
}
