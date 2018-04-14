package pro.ITIS6010HybridGuardProject;
import javax.swing.*;
import com.intellij.openapi.ui.*;
public class WelcomeWindow extends JDialog{
    private JButton next;
    private JTextArea introtext;
    private JPanel Welcome;

    public static void main(String[] args) {
        JFrame frame = new JFrame("WelcomeWindow");
        frame.setContentPane(new WelcomeWindow().Welcome);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
