package exercises.technology;

public class SmartPhone {
    public class Galaxy extends Desktop {
        public String getCodec() {
            return codec;
        }

        public void setCodec(String codec) {
            this.codec = codec;
        }

        Galaxy.setCodec("GSM.CDMA");
    }
}
