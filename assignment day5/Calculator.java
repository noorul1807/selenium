package week3.day1;

public class Calculator {


	public void addOperation(int a, int b) {
		System.out.println(a+b);
	}
	public void addOperation (int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void subOperation(double a, double b)
	{
		System.out.println(a-b);
	}
	public void mulOperation(int a , double b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.addOperation(10, 10);
		cal.addOperation(2, 3, 6);
		cal.subOperation(20, 30);
		cal.mulOperation(2, 10);
		

	}

}
