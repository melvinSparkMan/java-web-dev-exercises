package exercises.technology;

public class Program {
    public static void main(String[] args) {

        Computer.Desktop.setMicroprocessor("QualComm");
        Computer.Desktop.setRam(16);
        Computer.Desktop.setWifi("802.11bgn");
        LapTop.Surface.setMicroprocessor("QualComm");
        LapTop.Surface.setWifi("802.11bgn");
        LapTop.Surface.setGraphicsCard("nvidiaGeforce");
        SmartPhone.Galaxy.setCodec("GSM-CDMA");
    }
}
