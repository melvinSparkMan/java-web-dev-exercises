package exercises.technology;

public class LapTop {

    Computer LapTop = new Computer( "QualComm-SnapDragon-860", 16.0, "802.11abgn");
//    LapTop.Surface.setGraphicsCard("NvidiaGeForce");





    public class Surface extends LapTop {

        String graphicsCard;

        public void setGraphicsCard(String aGraphicsCard) {
            this.graphicsCard = aGraphicsCard;
        }
        public void setMicroprocessor(String aMicroprocessor) {
            LapTop.microprocessor = aMicroprocessor;
        }
        public void setWifi(String wifi) {
            LapTop.wifi = wifi;
        }

    }

}
