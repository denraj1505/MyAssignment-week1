package Assignment;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=123, n, sum = 0;
		System.out.println("Sum: ");
        
      
        while(number > 0)
        {
        	n = number % 10;
            sum = sum + n;
          number = number / 10;
          System.out.println(sum);
        }
        System.out.println("Sum of Digits:"+sum);
    
		
	}

}
