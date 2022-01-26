package exercises.technology;

public class LapTop {
    public class Surface extends Desktop {
        public String getGraphicsCard() {
            return graphicsCard;
        }

        public void setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
        }

        String graphicsCard;
    }
    Surface.setMicroprocessor("QualComm");
    Surface.setWifi("802.11bgn");
    Surface.setGraphicsCard("nvidiaGeforce";)
}
