// import class yang dibutuhkan 
import java.io.*;


public class reader {

    public static void main(String[] args) {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        

        try {
            System.out.println("Silahkan Masukan Data: ");
            name = dataIn.readLine(); // membaca input dan menyimpan data sebagai variabel name
            System.out.println("Data yang dimasukan : " + name);
        } catch (IOException e ) {
            System.out.println("Error !");
        } 
    }
}