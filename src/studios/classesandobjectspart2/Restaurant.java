package studios.classesandobjectspart2;

public class Restaurant {
    public static void main(String[] args) {


        MenuItem.MenuOffering bbqWings = new MenuItem.MenuOffering();

        bbqWings.setDescription("BBQ Chicken Wings");
        bbqWings.setCategory("Appetizers");
        bbqWings.setPrice(5.99);
//        bbqWings.setDate(31-01-2022);

        MenuItem.MenuOffering bbqNachos = new MenuItem.MenuOffering();

        bbqNachos.setDescription("BBQ Chicken Nachos");
        bbqNachos.setCategory("Appetizers");
        bbqNachos.setPrice(9.49);
//        bbqNachos.setDate(31-01-2022);

        MenuItem.MenuOffering potatoSkins = new MenuItem.MenuOffering();

        potatoSkins.setDescription("Potato Skins");
        potatoSkins.setCategory("Appetizers");
        potatoSkins.setPrice(7.99);
//        potatoSkins.setDate(31-01-2022);

        MenuItem.MenuOffering beefBrisket = new MenuItem.MenuOffering();

        beefBrisket.setDescription("Beef Brisket Dinner");
        beefBrisket.setCategory("Dinner");
        beefBrisket.setPrice(14.99);
//        beefBrisket.setDate(31-01-2022);

        MenuItem.MenuOffering halfRibRack = new MenuItem.MenuOffering();

        halfRibRack.setDescription("Half Rack of Ribs");
        halfRibRack.setCategory("Dinner");
        halfRibRack.setPrice(16.99);
//        halfRibRack.setDate(31-01-2022);

        MenuItem.MenuOffering porkSteak = new MenuItem.MenuOffering();

        porkSteak.setDescription("Pork Steak Dinner");
        porkSteak.setCategory("Dinner");
        porkSteak.setPrice(13.99);
//        porkSteak.setDate(31-01-2022);


        MenuItem.MenuOffering appleTart = new MenuItem.MenuOffering();

        appleTart.setDescription("Rustic Apple Tart");
        appleTart.setCategory("Desserts");
        appleTart.setPrice(6.99);
//        appleTart.setDate(31-01-2022);


        System.out.println(bbqWings.getDescription() + " - " + bbqWings.getCategory() + " - $" + bbqWings.getPrice());
        System.out.println(beefBrisket.getDescription() + " - " + beefBrisket.getCategory() + " - $" + beefBrisket.getPrice());
        System.out.println(appleTart.getDescription() + " - " + appleTart.getCategory() + " - $" + appleTart.getPrice());
    }
}
