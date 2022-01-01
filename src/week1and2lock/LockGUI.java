package week1and2lock;

import javax.swing.JFrame;

public class LockGUI
{
    public static void main (String[] args)
    {
        JFrame frame = new JFrame ("Lock example");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        mainPanel panel = new mainPanel();
        //LockGUIPanel panel = new LockGUIPanel();

        frame.getContentPane().add(panel);
        frame.setSize (400,400);
        //frame.pack();
        frame.setVisible(true);
    }
}
