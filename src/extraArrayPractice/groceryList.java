package extraArrayPractice;
import shapes.Rectangle;

import java.util.Scanner;
public class groceryList {
    protected static String name;
    protected static int quantity;
    protected static String category;

    public groceryList(String name, int quantity, String category) {
        groceryList.name = name;
        groceryList.quantity = quantity;
        groceryList.category = category;
    }

    public static void main(String[] args) {
        Scanner items = new Scanner(System.in);
        System.out.println("How many items will be entered?");
    }

    public String toString() {
        return "Item{" + "item=" + name +
                ", quantity=" + quantity +
                ", category='" + category +
                '\'' +
                '}';
    }

}
