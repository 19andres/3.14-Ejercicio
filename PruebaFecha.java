import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class PruebaFecha {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el mes:");
        int mes = sc.nextInt();
        System.out.println("Ingrese el dia:");
        int dia = Integer.parseInt(br.readLine());
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));
        Fecha fecha = new Fecha(mes, dia, anio);
        JOptionPane.showMessageDialog(null, "La fecha es: " + fecha.mostrarFecha());
        sc.close();
    }
}
