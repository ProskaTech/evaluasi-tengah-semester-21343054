/*
 * Nama : Maulana Hafizul Haq
 * Nim  : 21343054
 */
import javax.swing.JOptionPane;
public class Nomor3{
    public static void main(String[] args) {
        String Bilangan= "";
        Float a;

        Bilangan = JOptionPane.showInputDialog("Bilangan = ");
        a = Float.parseFloat(Bilangan);
        if (a > 0 ){
            JOptionPane.showMessageDialog(null, Bilangan+(" ")+ ("Positif") );
            System.out.println(Bilangan + "\sPositif");
        }
        else if(a==0) {
            JOptionPane.showMessageDialog(null, Bilangan+(" ")+ ("") );
            System.out.println(Bilangan);
            
        }
        else{
            JOptionPane.showMessageDialog(null, Bilangan+(" ")+ ("Negatif") );
            System.out.println(Bilangan + "\sNegatif");
        }    
    }
}       