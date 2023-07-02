package oceanOfCode;

public class FactorialOfANumberUsingRecursion {

	static int factorial(int num) {
		
		if (num < 0) {
			// throw new Exception("Invalid Num");
		}
		
		if (num == 0) {
			return 1;
		}
		// num! = (num-1)! * num
		return factorial(num - 1) * num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		System.out.println(factorial(num));
	}

}
