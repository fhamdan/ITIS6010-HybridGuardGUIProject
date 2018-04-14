package pro.ITIS6010HybridGuardProject;
import javax.swing.*;
public class GUI3 {
    private JList list2;
    private JPanel Window3;
    private JButton back;
    private JButton finish;
    private JTextArea describewrx;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI3");
        frame.setContentPane(new GUI3().Window3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
