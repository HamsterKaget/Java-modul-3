// Import Java class yang dibutuhkan 
import javax.swing.*;
import java.io.*;


public class nilai {
    
    public static void main(String[] args) {
        String nim_alpha =JOptionPane.showInputDialog("* Masukkan NIM *");
        int nim = Integer.parseInt(nim_alpha);
        System.out.println(nim);



        JOptionPane.showMessageDialog(null,"NIM KAMU ADALAH : " + nim);

        // Variabel 
        nim = nim % 2;

        switch(nim){
            case 0:
            JOptionPane.showMessageDialog(null,"Nim Kamu termasuk genap , silahkan masukan data nilai menggunakan console ");
            System.out.println("Nim genap");

            // Mengambil Input Nilai
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String nilaigenap_alpha = "";

                try {
                    System.out.println("===================");
                    System.out.println("* Masukan Nilai *");
                    System.out.println("===================");
                    nilaigenap_alpha = br.readLine();
                    int nilai = Integer.parseInt(nilaigenap_alpha);
                    System.out.println("===================");
                    System.out.println("Data Nilai Yang Dimasukan Adalah = " + nilai);
                    System.out.println("===================");
                    
                    System.out.println("===");
                    System.out.println("======");
                    System.out.println("=========");
                    if ( nilai > 90 ) {
                        System.out.println("Excelent !");
                    } else if ( nilai >= 80 && nilai <= 90 ) {
                        System.out.println("Good Job !");
                    } else if ( nilai >= 60 && nilai < 80 ) {
                        System.out.println("Belajar Lagi");
                    } else if ( nilai < 60 ) {
                        System.out.println("Anda Tidak Lulus");
                    } else {
                        System.out.println("Nilai Error !");
                    }
                } catch (IOException e) {
                    System.out.println("Error !");
                }
                System.out.println("=========");
                System.out.println("======");
                System.out.println("===");
                break;
                
            
            case 1:
            JOptionPane.showMessageDialog(null,"Nim Kamu termasuk ganjil ,silahkan masukan data menggunakan panel selanjutnya ");
            String nilaiganjil_alpha = JOptionPane.showInputDialog("* Masukkan Nilai *");
            int nilai = Integer.parseInt(nilaiganjil_alpha);

            if ( nilai > 90 ) {
                JOptionPane.showMessageDialog(null,"Excelent !");
            } else if ( nilai >= 80 && nilai <= 90 ) {
                JOptionPane.showMessageDialog(null,"Good Jobs !");
            } else if ( nilai >= 60 && nilai < 80 ) {
                JOptionPane.showMessageDialog(null, "Belajar Lagi");
            } else if ( nilai < 60 ) {
                JOptionPane.showMessageDialog(null, "Anda tidak lulus");
            } else {
                JOptionPane.showMessageDialog(null, "Nilai Error !");
            }
            break;
        }
    }
}
