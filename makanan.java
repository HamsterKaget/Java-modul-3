// Import Java Class Yang dibutuhkan
import javax.swing.*;

// Code by Radja Aulia Al Ramdani X RPL 2 / @hamsterkaget 


public class makanan {
    
    public static void main(String[] args) {
        String menu = JOptionPane.showInputDialog("Pilih Menu Makanan di Bawah ini :\n" +
        " 1. Sate Rp.10.000 \n 2. Soto Rp.20.000 \n 3.Tahu campur Rp.15.000 \n 4. Rendang Rp.20.000");

        int a=Integer.parseInt(menu);

        // Code di bawah di abaikan saja , hanya untuk cek input di terminal
        System.out.println(a);

        // Switch Statement 
        switch(a) {
            case 1: //  Kondisi Output jika inputan menunjukan angka 1
            JOptionPane.showMessageDialog(null, "Anda Memilih Sate Seharga Rp.10.000");
            break; 
            case 2: //  Kondisi Output jika inputan menunjukan angka 2
            JOptionPane.showMessageDialog(null, "Anda Memilih Soto Seharga Rp.20.000");
            break;
            case 3: //  Kondisi Output jika inputan menunjukan angka 3
            JOptionPane.showMessageDialog(null, "Anda Memilih Tahu campur Seharga Rp.15.000");
            break;
            case 4: //  Kondisi Output jika inputan menunjukan angka 4
            JOptionPane.showMessageDialog(null, "Anda Memilih Rendang Seharga Rp.20.000");
            break;
            default: //  Kondisi Output jika inputan menunjukan angka yang belum ada di menu
            JOptionPane.showMessageDialog(null, "Makanan yang anda pilih belum ada di menu kami");
        }
        
    }
}
