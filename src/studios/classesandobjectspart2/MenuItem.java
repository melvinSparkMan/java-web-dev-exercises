package studios.classesandobjectspart2;

import java.util.Date;

public class MenuItem {



    public static class MenuOffering {

        public static String description;
        public static String category;
        public static Double price;
        public static Date date;

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

        public Date setDate(Date aDate) {
            this.date = aDate;
            return date;
        }

//        public Date setDate() {
//            Date getDate = new Date();
//            SimpleDateFormat dateformat = new SimpleDateFormat("dd-M-yyyy");
//            Date date = dateformat.parse(getDate.toString());
//            return date;
//        }
    }

}
