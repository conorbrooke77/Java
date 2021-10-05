package Lab1;

// Student Name 	: Conor Brooke
// Student Id Number: 
// Date 			: Oct-2021
// Purpose 			: My first class implementation

public class lab1q1
{	
    public static void main(String args[]) 
	{

        double tempb = 0;

		Thermometer thermA = new Thermometer();	// Create an instance of our Thermometer class
        Thermometer thermB = new Thermometer(10.0);

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );

		tempb = thermB.getCelsius();
        System.out.println("Temp. of Thermometer B is " + tempb);
	}
}