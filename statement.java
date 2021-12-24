// Import class yang dibutuhkan 
import javax.swing.*;


public class statement {
    
    public static void main(String[] args) {
        String a=JOptionPane.showInputDialog("Masukan Informasi");
        System.out.println("Data yang dimasukan " + a);
        int jawab = JOptionPane.showConfirmDialog(null, "Apakah anda yakin?");
    
        // 0 : yes
        // 1 : no
        // 2 : cancel
    
        // Swicth Case Statement 
        switch(jawab){
            case JOptionPane.YES_OPTION: 
                JOptionPane.showMessageDialog(null, "Kamu menjawab ya");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Kamu menjawab tidak");
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null, "Kamu mejawab batal");
        }

        // if , else statement 
        if(jawab == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,"Data yang dimasukan adalah : " + a); 
        } else {
            JOptionPane.showMessageDialog(null, "Kamu Membatalkan input data");
        }

        
    }
}
