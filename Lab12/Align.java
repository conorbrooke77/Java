package Lab12;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Align extends JFrame {
    
    public Align() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(new Dimension(400, 180));
        setTitle("Align");
        ((JComponent) getContentPane()).setBorder(new EmptyBorder(5, 33, 5, 33));

        alignContent();
        btnContent();
        setVisible(true);
    }

    public void alignContent() {

        JPanel grid = new  JPanel(new BorderLayout());
        grid.setBorder(new EmptyBorder(40,0,40,0));

        JPanel firstGrid = new JPanel(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(0, 15, 0, 0);

        JCheckBox check1 = new JCheckBox("Snap to Grid");
        JLabel x = new JLabel("X:");
        JTextField num = new JTextField("8", 3);

        gc.gridx = 0;
        gc.gridy = 0;
        firstGrid.add(check1,gc);
        gc.gridx = 1;
        firstGrid.add(x,gc);
        gc.gridx = 2;
        firstGrid.add(num,gc);

        JPanel secondGrid = new JPanel(new GridBagLayout());

        JCheckBox check2 = new JCheckBox("Show Grid"); 
        JLabel y = new JLabel("Y:");
        JTextField num1 = new JTextField("8", 3);

        gc.gridx = 0;
        secondGrid.add(check2,gc);
        gc.gridx = 1;
        secondGrid.add(y,gc);
        gc.gridx = 2;
        secondGrid.add(num1,gc);

        grid.add(firstGrid, BorderLayout.NORTH);
        grid.add(secondGrid, BorderLayout.SOUTH);

        add(grid, BorderLayout.CENTER);
    }

    public void btnContent() {
        JPanel btns = new JPanel(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.insets = new Insets(10,0,0,0); 

        btns.setPreferredSize(new Dimension(90, 160));
        
        JButton okBtn = new JButton("Ok");
        gc.gridx = 0;
        gc.gridy = 0;
        okBtn.setBackground(Color.white);
        btns.add(okBtn, gc);
        JButton cancelBtn = new JButton("Cancel");
        gc.gridy = 1;
        cancelBtn.setBackground(Color.white);
        btns.add(cancelBtn, gc);
        JButton helpBtn = new JButton("Help");
        gc.gridy = 2;
        helpBtn.setBackground(Color.white);
        btns.add(helpBtn, gc);

        add(btns, BorderLayout.EAST);
    }
}
