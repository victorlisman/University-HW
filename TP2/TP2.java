import javax.swing.JOptionPane;

public class TP2
{
public static void main(String[] args)
    {
        String mot1 = JOptionPane.showInputDialog("Insert premier mot: ");
        String mot2 = JOptionPane.showInputDialog("Insert deuxieme mot: ");
        
        JOptionPane.showMessageDialog(null, mot1.toUpperCase() + mot2.toLowerCase());
    }

}