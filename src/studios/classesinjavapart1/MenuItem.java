package studios.classesinjavapart1;

import java.util.HashMap;

public class MenuItem {


    public static int menuSerialNumbers = 10000;
    public static HashMap<String, Integer> menuByItemNames = new HashMap<>();
    public static HashMap<Integer, String> menuBySerialNumbers = new HashMap<>();

    public static String[] menuItems = RawData.menuString.split(" ");


    public static void setMenuItems() {


        menuSerialNumbers += 1;
        RawData.menuItemByName.put(menuSerialNumbers, "BBQ Chicken Nachos");
        RawData.menuItemByCategory.put(menuSerialNumbers, "Appetizers");
        RawData.menuItemByPrice.put(menuSerialNumbers, 9.49);

        menuSerialNumbers += 1;
        RawData.menuItemByName.put(menuSerialNumbers, "Buffalo Chicken Wings");
        RawData.menuItemByCategory.put(menuSerialNumbers, "Appetizers");
        RawData.menuItemByPrice.put(menuSerialNumbers, 5.99);

        menuSerialNumbers += 1;
        RawData.menuItemByName.put(menuSerialNumbers, "Potato Skins");
        RawData.menuItemByCategory.put(menuSerialNumbers, "Appetizers");
        RawData.menuItemByPrice.put(menuSerialNumbers, 5.99);

        menuSerialNumbers += 1;
        RawData.menuItemByName.put(menuSerialNumbers, "Beef Brisket Dinner");
        RawData.menuItemByCategory.put(menuSerialNumbers, "Dinner");
        RawData.menuItemByPrice.put(menuSerialNumbers, 12.99);

        menuSerialNumbers += 1;
        RawData.menuItemByName.put(menuSerialNumbers, "Half Rack of Ribs");
        RawData.menuItemByCategory.put(menuSerialNumbers, "Dinner");
        RawData.menuItemByPrice.put(menuSerialNumbers, 16.99);

        menuSerialNumbers += 1;
        RawData.menuItemByName.put(menuSerialNumbers, "Pork Steak");
        RawData.menuItemByCategory.put(menuSerialNumbers, "Dinner");
        RawData.menuItemByPrice.put(menuSerialNumbers, 13.99);

        menuSerialNumbers += 1;
        RawData.menuItemByName.put(menuSerialNumbers, "Rustic Apple Tart");
        RawData.menuItemByCategory.put(menuSerialNumbers, "Dessert");
        RawData.menuItemByPrice.put(menuSerialNumbers, 6.99);

        System.out.println("\n");

        Integer index = 10001;

        for (int i = 0; i < RawData.menuItemByName.size(); i++) {
            System.out.println(" (" + index + ") " + RawData.menuItemByCategory.get(index) + "  " + RawData.menuItemByName.get(index) + "  " + RawData.menuItemByPrice.get(index));
            index++;
        }
    }

}
