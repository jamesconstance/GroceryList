import java.util.ArrayList;

public class GroceryList {
    private final ArrayList<String> groceryList;

    public GroceryList() {
        this.groceryList = new ArrayList<String>();
    }

    public void addItem(String item) {
        groceryList.add(item);
    }

    public boolean removeItem(String item) {
        int position = groceryList.indexOf(item);
        if (position >= 0) {
            groceryList.remove(position);
            return true;
        }
        return false;
    }

    public boolean replaceItem(String item, String newItem) {
        int position = getItemPosition(item);
        if (position >= 0) {
            groceryList.set(position, newItem);
            return true;
        }
        return false;
    }

    public boolean containsItem(String item) {
        return groceryList.contains(item);
    }

    public void printList() {
        for (String item : groceryList) {
            System.out.println(groceryList.indexOf(item) + 1 + ". " + item);
        }
    }

    private int getItemPosition(String item) {
        return groceryList.indexOf(item);
    }


}
