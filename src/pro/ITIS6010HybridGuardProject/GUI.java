package pro.ITIS6010HybridGuardProject;

import javax.swing.*;

public class GUI {
    private JPanel Window1;
    private JButton Next;
    private JList list1;
    private JTextArea explainPrincipalsHereTextArea;

    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame("GUI");
        frame.setContentPane(new GUI().Window1);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

