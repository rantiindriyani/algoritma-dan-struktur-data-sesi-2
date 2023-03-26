import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        java.util.Scanner input = new java.util.Scanner (System.in);

        String NAMA;
        String NIM;
        String JURUSAN;

        System.out.println("INPUT NAMA = ");
        NAMA=input.nextLine();
        System.out.println("INPUT NIM = ");
        NIM=input.nextLine();
        System.out.println("INPUT JURUSAN = ");
        JURUSAN=input.nextLine();

        System.out.println("++++++++++++++");
        System.out.println("NAMA SAYA = " + NAMA);
        System.out.println("NIM SAYA = " + NIM);
        System.out.println("JURUSAN SAYA = " + JURUSAN);

    }
}

    
