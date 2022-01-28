package exercises.technology;

public class Program {
    public static void main(String[] args) {

        Computer.Desktop.setMicroprocessor("QualComm-SnapDragon-860");
        Computer.Desktop.setRam(16);
        Computer.Desktop.setWifi("802.11abgn");
        LapTop.Surface.setMicroprocessor("QualComm-SnapDragon-860");
        LapTop.Surface.setWifi("802.11abgn");
        LapTop.Surface.setGraphicsCard("nvidiaGeforce");
        SmartPhone.Galaxy.setCodec("GSM-CDMA 5G-LTE");
    }
}
