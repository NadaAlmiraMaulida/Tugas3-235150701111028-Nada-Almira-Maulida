package tugas2;

public class Main {

    public static void main(String[] args) {

            PegawaiTetap pT1 = new PegawaiTetap("NADA", "3506233443876521373782", 8000000);
            PegawaiTetap pT2 = new PegawaiTetap("ALMIRA", "3506233443876521373738", 5500000);
            PegawaiTetap pT3 = new PegawaiTetap("MAULIDA", "3506233443876521373725", 9000000);
            System.out.println(pT1.toString());
            System.out.println(pT2.toString());
            System.out.println(pT3.toString());

            PegawaiHarian pH1 = new PegawaiHarian("JONO", "3506233456823695373763", 6000, 35);
            PegawaiHarian pH2 = new PegawaiHarian("RAFI", "3506233456823695373725", 4500, 40);
            PegawaiHarian pH3 = new PegawaiHarian("TATA", "3506233456823695373747", 5000, 45);
            System.out.println(pH1.toString());
            System.out.println(pH2.toString());
            System.out.println(pH3.toString());

            Sales sL1 = new
                    Sales("LALA", "3503233443876521387658", 30, 50000);
            Sales sL2 = new
                    Sales("JOKO", "3503233443876521387637", 55, 55000);
            Sales sL3 = new
                    Sales("DIDIN", "3503233443876521387654", 70, 45000);
            System.out.println(sL1.toString());
            System.out.println(sL2.toString());
            System.out.println(sL3.toString());
        }
    }
