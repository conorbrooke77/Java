package Lab13;

import java.awt.*;
import javax.swing.*;

public class ColorSelect extends JFrame{
    
    public ColorSelect() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(new Dimension(300, 140));
        setTitle("ColorSelect");

        dropDownMenu();
        checkBoxOptions();
        btns();

        setVisible(true);
    }

    public void dropDownMenu() {
        String[] colors = {"Red","Blue","Purple"};
        JComboBox<String> colorList = new JComboBox<>(colors);

        colorList.setBackground(Color.white);
        add(colorList, BorderLayout.NORTH);
    }

    public void checkBoxOptions() {
        JPanel checkBoxContainers = new JPanel();

        JCheckBox background = new JCheckBox("background");
        JCheckBox foreground = new JCheckBox("foreground");

        checkBoxContainers.add(background);
        checkBoxContainers.add(foreground);

        add(checkBoxContainers, BorderLayout.CENTER);
    }

    public void btns() {

        JPanel btnContainers = new JPanel();
        JButton okBtn = new JButton("Ok");
        JButton cancelBtn = new JButton("Cancel");

        btnContainers.add(okBtn);
        btnContainers.add(cancelBtn);

        add(btnContainers, BorderLayout.SOUTH);
    }
}
