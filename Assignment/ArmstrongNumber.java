package Assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int remainder, calculated=153,original=0;
		int value=calculated;
		
		
		
		while (value > 0) {
			remainder = value % 10;
			original = original+ remainder*remainder*remainder;
			value = value / 10;	
		}
		if (original == calculated) {
			System.out.println(calculated+ " Number is an Armstrong number");
			
		} else {
			System.out.println(calculated+ "Number is not an Armstrong number");

		}
	
	}
	}


