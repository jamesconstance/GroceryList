import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GroceryList myGroceries = new GroceryList();

        addGroceryItem(myGroceries);
        addGroceryItem(myGroceries);
        addGroceryItem(myGroceries);

        myGroceries.printList();

        replaceGroceryItem(myGroceries);

        myGroceries.printList();

        removeGroceryItem(myGroceries);

        myGroceries.printList();

        containsItem(myGroceries);
    }

    public static void addGroceryItem(GroceryList groceryList) {
        System.out.print("Enter new grocery item: ");
        String item = scanner.nextLine();
        groceryList.addItem(item);
        System.out.println("Added " + item + " to the list.");
    }

    public static void removeGroceryItem(GroceryList groceryList) {
        System.out.print("Enter new grocery item: ");
        String item = scanner.nextLine();
        if (groceryList.removeItem(item)) {
            System.out.println("Removed " + item + " from the list.");
        } else {
            System.out.println("List does not contain item.");
        }
    }

    public static void replaceGroceryItem(GroceryList groceryList) {
        System.out.print("Please enter item to update: ");
        String item = scanner.nextLine();
        if (!groceryList.containsItem(item)) {
            System.out.println("List does not contain item.");
        }
        System.out.print("Please enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.replaceItem(item, newItem);
        System.out.println("Replacing " + item + " for " + newItem + ".");
    }

    public static void containsItem(GroceryList groceryList) {
        System.out.print("Please enter search item: ");
        String item = scanner.nextLine();
        if (groceryList.containsItem(item)) {
            System.out.println("Grocery list contains " + item + ".");
        } else {
            System.out.println("Grocery list does not contain " + item + ".");
        }
    }
}
