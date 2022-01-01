package week1and2lock;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class mainPanel extends JPanel {

    private LockGUIPanel p1;
    private LockGUIPanel p2;
    private LockGUIPanel p3;

    private JLabel label;
    private JButton master;


    public mainPanel() {


        setLayout(new GridLayout(5, 1));

        label = new JLabel("Show master code: ");
        p1 = new LockGUIPanel();
        p2 = new LockGUIPanel();
        p3 = new LockGUIPanel();

        master = new JButton("Master Not functioning yet!");

        add(p1);
        add(p2);
        add(p3);
        add(master);
        add(label);

        master.addActionListener(new ButtonListener());
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            //          		System.out.println("I am happy");

            if (event.getSource() == master)
                label.setText("MasterKeySelected");

        }
    }
}
