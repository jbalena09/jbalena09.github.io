	
/* Programmer: Julius
 * Date: 10/08/18
 */


// Salary Program using nested if/if-else */
	import javax.swing.*;
	import java.io.*;
	public class SalaryProgram{
		public static void main(String[] args){
			int eType=0;
			double gIncome=0, hRate=0, hWorked=0;
			double rPay=0, otHours=0, otRate=0, otPay=0;
			int day=0, sTime=0, duration=0;
            String in;

			try{
			// input employee type
				in = JOptionPane.showInputDialog("Employee is [1]Part-time [2] Full-time");
                eType = Integer.parseInt(in);
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Error!");
			}
			if(eType == 1){ // part-time
			try{
			// input hourly rate and hours worked
				in = JOptionPane.showInputDialog("Input hourly rate:");
                                hRate = Double.parseDouble(in);
				in = JOptionPane.showInputDialog("Input number of hours worked:");
				hWorked = Double.parseDouble(in);
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Error!");
			}
				gIncome = hRate * hWorked;
			}else{ // employee_type == 2
			try{
				/* input regular pay and overtime hours and overtime rate */
				in = JOptionPane.showInputDialog("Input regular pay:");
				rPay = Double.parseDouble(in);
				in = JOptionPane.showInputDialog("Input number of overtime hours:");
				otHours = Double.parseDouble(in);
				in = JOptionPane.showInputDialog("Input overtime rate:");
				otRate = Double.parseDouble(in);
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Error!");
			}
				if(otHours > 0.0)
				otPay = otRate * otHours;
			else
				otPay = 0.0;
				gIncome = rPay + otPay;
			}
			JOptionPane.showMessageDialog(null,"Gross income= " + gIncome);
		}
	}