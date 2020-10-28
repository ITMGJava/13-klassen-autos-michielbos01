public class Auto2 {
    public static void main (String[] args){
        private int snelheid = 0;
       private String merk = "Toyota";
    private int kilometerstand = 23000;


        public void stop();
        public void start();
        public void rijdt();

        Auto auto1 = new Auto();
        Auto auto2 = new Auto(BMW);

        System.out.println(auto1.getSnelheid);
        System.out.println(auto1.getmerk);
        System.out.println(auto1.getKilometerstand);

        System.out.println(auto2.getSnelheid);
        System.out.println(auto2.getmerk);
        System.out.println(auto2.getKilometerstand);
    }
}
