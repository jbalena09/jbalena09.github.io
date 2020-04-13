
/* Programmer: Julius
 * Date: 09/27/18
 */


 import javax.swing.*; // this code imports all java.swing objects from java library which is used in the JOptionPane.

public class Calculator3 // this line is the name of the class and when changed the code will execute with an error.
{
	public static void main(String[] args) throws Exception
		{
			int x, y, sum, diff, pro;
			x = Integer.parseInt(JOptionPane.showInputDialog("Enter first no: ")); // this line creates a dialog that is called from the java library where the user can input their desired value then stores it at x. the code parseInt makes the value that is inserted by the user to be converted into an integer because this object saves it as a String.
			y = Integer.parseInt(JOptionPane.showInputDialog("Enter second no: "));
			sum = x + y;
			diff = x - y;
			pro = x * y;
			float quo = (float) x / y;
			JOptionPane.showMessageDialog(null,"The sum of " + x + " and " + y +" is = " + sum + "\n" +
			"The difference of " + x + " and " + y +" is = " + diff + "\n" +
			"The product of " + x + " and " + y +" is = " + pro + "\n" +
			String.format("The qoutient of %d and %d is = %.2f", x, y, quo));
		}
}