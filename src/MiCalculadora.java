import java.util.Scanner;



import javax.swing.JOptionPane;



public class MiCalculadora {



public static void main(String[]arg) {



int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero1"));
int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero2"));






JOptionPane.showMessageDialog(null, "El resultado de la suma es: " +(numero1+numero2));

JOptionPane.showMessageDialog(null, "El resultado de la division es: " +(numero1/numero2));
JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " +(numero1*numero2));




}
}