//  Import Java class yang dibutuhkan
import java.io.*;
import java.text.BreakIterator;

public class console {
    
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nim;
        char gender;
        String name,alamat;

        try{
            System.out.println("* Input Biodata Diri *");
            System.out.println("Masukan Nim : ");
            nim = dataIn.readLine();
            System.out.println("Masukan Nama : ");
            name = dataIn.readLine();
            System.out.println("Masukan Gender : ");
            gender = dataIn.readLine().charAt(0);;
            System.out.println("Masukan alamat : ");
            alamat = dataIn.readLine();


            System.out.println("===========================");
            System.out.println("Data Yang dimasukan adalah ");
            System.out.println("===========================");
            System.out.println("Nim : " + nim);
            System.out.println("Nama : " + name);
            System.out.println("Gender : " + gender);
            System.out.println("Alamat : " + alamat);
        } catch ( IOException e ) {
            System.out.println("Error !");
        } 

        
    }
}
