package pro.ITIS6010HybridGuardProject;

import javax.swing.*;

public class GUI2 {
    private JList list1;
    private JPanel Window2;
    private JButton Back;
    private JButton nextButton;
    private JTextArea explainResourcesHereTextArea;

    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame("GUI2");
        frame.setContentPane(new GUI2().Window2);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

