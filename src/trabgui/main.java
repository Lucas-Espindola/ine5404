package trabgui;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Lucas
 * O arquivo será escrito no diretório do projeto
 */
public class main {
    public static void main (String [] args){
 
        JFrame frame = new JFrame("Trabalho 2");
        frame.setSize(740,340);
        JPanel panel = new NewJPanel();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
            
}
