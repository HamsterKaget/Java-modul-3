// import java class yang dibutuhkan 
import java.io.*;


public class angka {
    
    public static void main(String[] args) {
        BufferedReader angka = new BufferedReader(new InputStreamReader(System.in));
        
        //  Deklarasi variabel angka , disini saya akan menambahkan 3 variabel dengan int
        int angka_a;
        int angka_b;
        int angka_c;

        try{
            System.out.println("* Input Angka *");
            System.out.println("A : ");
            angka_a = Integer.parseInt(angka.readLine());
            System.out.println("B : ");
            angka_b = Integer.parseInt(angka.readLine());
            System.out.println("C : ");
            angka_c = Integer.parseInt(angka.readLine());

            int hasil = angka_a + angka_b + angka_c;

            System.out.println("Nilai Penjumlahan : " + angka_a + " + " + angka_b + " + " + angka_c + " = " + hasil );
        } catch ( IOException e ) {
            System.out.println("Error !");
        }

    }
}
