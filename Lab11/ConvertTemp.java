//Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertTemp extends JFrame {
	
	private JTextField fahrenField = new JTextField();
	private JTextField celsiusField = new JTextField();
    private float degreesInFahrenheit;
    private float degreesInCelsius;
	
	// Constructor
	public ConvertTemp(String title)	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridLayout(2, 2));

		// Add Fahrenheit label and text field to frame
		add(new JLabel("Fahrenheit"));
		add(fahrenField);
		// Attach listener to text field
        fahrenField.addActionListener(new fahrenheitListener());

		// Add Celsius label and text field to frame
		add(new JLabel("Celsius"));
		add(celsiusField);
		// Attach listener to text field
        celsiusField.addActionListener(new celsiusListener());

		// Attach window listener
		addWindowListener(new WindowCloser());
	}//end costructor

    public float fahrenheitToCelsius() {
        float degreesInCelsius = (degreesInFahrenheit - 32) * 5/9;
        return degreesInCelsius;
    }

    public float celsiusToFahrenheit() {
        float degreesInFahrenheit = (degreesInCelsius * 9/5) + 32;
        return degreesInFahrenheit;
    }

	// Listener for window
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}

    class fahrenheitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            degreesInFahrenheit = Integer.parseInt(fahrenField.getText());
            celsiusField.setText(Float.toString(fahrenheitToCelsius()));
        }

    }

    class celsiusListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            degreesInCelsius = Integer.parseInt(celsiusField.getText());
            fahrenField.setText(Float.toString(celsiusToFahrenheit()));
        }

    }
}