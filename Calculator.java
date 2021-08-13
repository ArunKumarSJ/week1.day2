package week1.day2;

public class Calculator {
	public int add(int num1,int num2,int num3) {
		int A= num1+num2+num3;
		System.out.println("The sum of three numbers:"+ A);
		return A;
	}
	public int sub(int num1,int num2) {
		int S= num1-num2;
		System.out.println("The sub of two numbers:"+ S);
		return S;
	}
	public double Mul(int num1, int num2) {
		double M= num1*num2;
		System.out.println("The Multipilcation of two numbers:"+ M);
		return M;
	}

	public float div(float num1,float num2) {
		float D= num1/num2;
		System.out.println("The division of two numbers:"+ D);
		return D;
	}
	
}
