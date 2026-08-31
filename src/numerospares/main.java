package numerospares;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Números pares de 211 a 250:\n\n");
        
        for (int i = 212; i <= 250; i += 2) {
            resultado.append(i).append("\n");
        }
        
        JOptionPane.showMessageDialog(
            null, 
            resultado.toString(), 
            "Resultado", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }

}
