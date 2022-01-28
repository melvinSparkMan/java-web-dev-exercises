package exercises.technology;


    public class Computer {
        String microprocessor;
        Double ram;
        String wifi;

        public Computer(String microprocessor, Double ram, String wifi) {
            this.microprocessor = microprocessor;
            this.ram = ram;
            this.wifi = wifi;
        }

        public String getMicroprocessor(String aMicroprocessor) {
            microprocessor = aMicroprocessor;
            return microprocessor;
        }

        public void setMicroprocessor(String aMicroprocessor) {
            this.microprocessor = aMicroprocessor;
        }

        public Double getRam(Double memoryInGigaBytes) {
            ram = memoryInGigaBytes;
            return ram;
        }

        public void setRam(Double ram) {
            this.ram = ram;
        }

        public String getWifi() {
            return wifi;
        }

        public void setWifi(String wifi) {
            this.wifi = wifi;
        }
    }

