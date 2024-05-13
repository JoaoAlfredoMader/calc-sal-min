import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int salMin;
        double salario, resultado;

        salMin = 1412;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Escreva seu salario"));

        resultado = salario / salMin;

        JOptionPane.showMessageDialog(null, "voce recebe "+ resultado + " salarios minimos");
    }
}