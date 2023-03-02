import java.util.Scanner;

public class pecahan { 
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            //nominal uang
            int nominalUang, sisaUang;
            int[] Uang = {50000, 20000, 10000, 5000, 2000, 1000, 500};

            //input uang 
            System.out.println("masukan nominal uang : ");
            nominalUang = input.nextInt();
            sisaUang = nominalUang;

            //operasi hitung lembar uang
            for(int i=0; i<Uang.length; i++) {
                int lembar = sisaUang / Uang[i];
                if(lembar > 0) {
                    System.out.println(lembar + "lembar" + Uang[i] + "ribuan");
                    sisaUang = sisaUang % Uang[i];
                }
            }
        }
    } 
}
