// import Java class yang dibutuhkan 
import java.io.*;
import javax.swing.*;


public class tokobuku {
    
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        String a="";
        String b="";
        String c="";
         double pensil = 0,pulpen = 0,buku = 0; int jml_item_brg=0;
        
        // List Harga Toko Buku
        System.out.println("* Data Barang Dagangan *");
        System.out.println("1. Pensil 2B = @Rp. 12.000");
        System.out.println("2. Pulpen = @Rp. 15.000");
        System.out.println("3. Buku Tulis = @Rp. 25.000");
        System.out.println("Silahkan Pesan");


        try{
        // Code untuk membeli pensil
        System.out.println("Beli Pensil 2B ? Y atau N");
        a = dataIn.readLine();

        if(a.equals("Y")) {
        System.out.print("Jumlahnya :");
        a = dataIn.readLine();
        pensil=Double.parseDouble(a)*12000;
        jml_item_brg++;
        }else { System.out.print("Tidak Beli Pensil 2B"); }

        System.out.println("=========================");
        System.out.print("Beli Pensil 2B : "+a+" \nBuah Harga : "+pensil);
        System.out.println("\n =========================");
        
        // Code untuk membeli pulpen
        System.out.println("\n Beli Pulpen ? Y atau N");
        b = dataIn.readLine();
        
        if(b.equals("Y")) {
            System.out.print("Jumlahnya :");
            b = dataIn.readLine();
            pulpen=Double.parseDouble(b)*15000;
            jml_item_brg++;
        }else { System.out.print("Tidak Beli Pulpen"); }
        
        System.out.println("=========================");
        System.out.print("Beli Pulpen : "+b+" \n Buah Harga : "+pulpen);
        System.out.println("\n =========================");
        
        // Code untuk membeli buku
        System.out.println("\n Beli Buku ? Y atau N");
        c = dataIn.readLine();
        
        if(c.equals("Y")) {
            System.out.print("Jumlahnya :");
            c = dataIn.readLine();
            buku=Double.parseDouble(c)*25000;
            double jumlah_buku = Double.parseDouble(c);
            jml_item_brg++;
        }else { System.out.print("Tidak Beli Buku"); }
        
        System.out.println("=========================");
        System.out.print("Beli Buku : "+c+" \n Buah Harga : "+buku);
        double total_harga=pensil+pulpen+buku;
        System.out.println("\n =========================");

        
        
        
        // Perhitungan Diskon Jumlah Item Barang
        double jumlah_buku = buku / 25000;
        int jumlah_itung = jml_item_brg / 3;


        if (total_harga > 1000000) {
            double discount = total_harga*1/100;
            total_harga = total_harga - discount;
        }

        if ( jumlah_buku > 3*12 ) {
            double discountBuku = buku*2/100;
            total_harga = total_harga - discountBuku; 
        }

        if ( jumlah_itung > 0 ) {
            double discountItem = jumlah_itung*500;
            total_harga = total_harga - discountItem; 
        }


        // Perhitungan Diskon Total Harga Disini
        System.out.print("Total Harga Barang Dibeli "+total_harga);
        }catch( IOException e ){
        System.out.println("Error!");
        }
    }
}
