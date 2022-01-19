package studios.classesandobjectspart2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {

     MenuOffering bbqWings = new MenuOffering();

//     bbqWings.setDescription("BBQ Chicken Wings");
//     bbqWings.setCategory("Appetizers");
//     bbqWings.setPrice(7.99);
//     bbqWings.setDate("31-01-2022");

    public class MenuOffering {

        public String description;
        public String category;
        public Double price;
        public Date date;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Date getDate() {
            return date;
        }

        public Date setDate() {
            Date getDate = new Date();
            SimpleDateFormat dateformat = new SimpleDateFormat("dd-M-yyyy");
//            Date date = dateformat.parse(getDate.toString());
            return date;
        }
    }

}
