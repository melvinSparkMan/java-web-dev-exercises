package studios.classesinjavapart1;

import java.util.HashMap;

public class MenuItem {


    public static int menuSerialNumbers = 10000;
    public static HashMap<String, Integer> menuByItemNames = new HashMap<>();
    public static HashMap<Integer, String> menuBySerialNumbers = new HashMap<>();

    public static String[] menuItems = RawData.menuString.split(" ");


    public static void setMenuItems() {
        int index = 0;
        for (String i : menuItems) {
            menuSerialNumbers += 1;
                menuItems[index] = menuItems[index].replace("-", " ");
                    menuByItemNames.put(menuItems[index], menuSerialNumbers);
                        menuBySerialNumbers.put(menuSerialNumbers, menuItems[index]);
                            System.out.println(menuByItemNames.get(menuItems[index]) + "  " + menuBySerialNumbers.get(menuSerialNumbers));
            index++;
        }
    }

}
