import javax.swing.JOptionPane;

public class Punto10 {

	
	public static void main(String[] args) {
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Especifica la cantidad de elementos para el primer conjunto de datos"));
        int numero1[] = new int[x];
        int numero2[] = new int[x];
        int resultado[] = new int[x];
        
        for (int i = 0; i < numero1.length; i++) {
            numero1[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor en la posición " + i + " del primer conjunto"));
            System.out.print(numero1[i] + "|");
        }
        System.out.println("");
        
        for (int i = 0; i < numero2.length; i++) {
            numero2[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor en la posición " + i + " del segundo conjunto"));
            System.out.print(numero2[i] + "|");
        }
        System.out.println("");
        
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = numero1[i] + numero2[i];
            System.out.print(resultado[i] + "|");
        }
        System.out.println("");

       
        int n = Integer.parseInt(JOptionPane.showInputDialog("Especifica la cantidad de elementos para el segundo cálculo"));
        int numero1_0[] = new int[n];
        int numero2_0[] = new int[n];
        int resultado_0[] = new int[n];
        
        for (int i = 0; i < numero1_0.length; i++) {
            numero1_0[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor en la posición " + i + " del primer conjunto para el segundo cálculo"));
            System.out.print(numero1_0[i] + "|");
        }
        System.out.println("");
        
        for (int i = 0; i < numero2_0.length; i++) {
            numero2_0[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor en la posición " + i + " del segundo conjunto para el segundo cálculo"));
            System.out.print(numero2_0[i] + "|");
        }
        System.out.println("");
        
        for (int i = 0; i < resultado_0.length; i++) {
            resultado_0[i] = numero2_0[i] - numero1_0[i];
            System.out.print(resultado_0[i] + "|");
        }
        System.out.println("");

     
        int y = Integer.parseInt(JOptionPane.showInputDialog("Especifica la cantidad de elementos para el tercer conjunto de datos"));
        int numero3[] = new int[y];
        int numero4[] = new int[y];
        int resultado_extra[] = new int[y];
        
        for (int i = 0; i < numero3.length; i++) {
            numero3[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor en la posición " + i + " del tercer conjunto"));
            System.out.print(numero3[i] + "|");
        }
        System.out.println("");
        
        for (int i = 0; i < numero4.length; i++) {
            numero4[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor en la posición " + i + " del cuarto conjunto"));
            System.out.print(numero4[i] + "|");
        }
        System.out.println("");
        
        for (int i = 0; i < resultado_extra.length; i++) {
            resultado_extra[i] = numero3[i] + numero4[i];
            System.out.print(resultado_extra[i] + "|");
        }
        System.out.println("");
    }
}
