package revise;


public class Division {
	//data members
	int num1, num2;
	 int result=0;
	
 
	//Parameterized constructor
	public Division(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
 
	//division method
	public int division() throws ArithmeticException{
		return num1/num2;
	}

	

	 void printResult() {
		
		// TODO Auto-generated method stub
		System.out.println("Result = " +result);
		while(true);
	}
}