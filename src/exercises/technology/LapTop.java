package exercises.technology;

public class LapTop {

    public LapTop(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    String graphicsCard;

    public class Surface extends Computer {



        public void setGraphicsCard(String aGraphicsCard) {
            Computer.graphicsCard = aGraphicsCard;
        }
        public void setMicroprocessor(String aMicroprocessor) {
            this.microprocessor = aMicroprocessor;
        }
        public void setWifi(String wifi) {
            this.wifi = wifi;
        }

    }

}
