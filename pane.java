// Import Java class yang dibutuhkan
import javax.swing.*;

public class pane {
    
    public static void main(String[] args) {
        String a=JOptionPane.showInputDialog("Masukkan Informasi");
        System.out.println("Data yang dimasukkan "+a);
        JOptionPane.showMessageDialog(null,"Data Yang Anda Masukkan Adalah : "+a);
    }
}
