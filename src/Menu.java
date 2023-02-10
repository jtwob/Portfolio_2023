import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private int selection;
    private Scanner sc;
    private String[] menuItems = {
            "1: View all items",
            "2: Add a new item",
            "3: Edit an existing item",
            "4: Search for an item",
            "9: Delete an existing item",
            "0: Exit"
    };

    enum itemTypes {
        POSITION, PROJECT, SKILL
    };

    public Menu() {
        this.selection = -1;
        sc = new Scanner(System.in);
    }

    public void printMenu() {
        System.out.println("Menu");
        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("   " + this.menuItems[i]);
        }
    }

    public int inputValidation(int input) {
        int output = input;
        while (output != 1 && output != 2 && output != 3 && output != 4 && output != 9 && output != 0) {
            System.out.println("Invalid selection. Enter a valid selection:");
            printMenu();
            output = sc.nextInt();
        }
        return output;
    }

    public void runMenu() {
        while (this.selection != 0) {
            printMenu();
            this.selection = inputValidation(sc.nextInt());
            switch (this.selection) {
                case 0:
                    System.out.println("Exiting...");
                    continue;
                case 1:
                    // viewAll();
                    // break;
                case 2:
                    // int type = sc.nextInt();

                    // addItem()
            }
        }
    }

    // public Item[] viewAll() {
    // Item[] items = new Item[100];
    // Arrays.fill(items, null);
    // return items;
    // }
}
