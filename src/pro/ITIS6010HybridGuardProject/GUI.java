package pro.ITIS6010HybridGuardProject;

import javax.swing.*;

public class GUI {
    private JPanel Window1;
    private JButton Next;
    private JTextArea explainPrincipalsHereTextArea;
    private JTable table1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().Window1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

