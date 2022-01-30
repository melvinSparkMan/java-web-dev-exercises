package exercises.technology;

public class Program {
    public static void main (String[] args) {

        Computer Desktop = new Computer( "QualComm-SnapDragon-860", 16.0, "802.11abgn");
        Computer Surface = new Computer( "QualComm-SnapDragon-860", 16.0, "802.11abgn");



        Desktop.setMicroprocessor("QualComm-SnapDragon-860");
        Desktop.setRam(16.0);
        Desktop.setWifi("802.11abgn");
        Surface.setMicroprocessor("QualComm-SnapDragon-860");
        Surface.setWifi("802.11abgn");
//        Surface.setGraphicsCard("nvidiaGeforce");
//        SmartPhone.Galaxy.setCodec("GSM-CDMA 5G-LTE");
    }
}
