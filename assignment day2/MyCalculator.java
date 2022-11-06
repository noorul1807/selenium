package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator result= new Calculator();
		int addition=result.add(2, 6, 1);
		int subtraction=result.sub(3, 1);
		double multiplication=result.mult(223,22);
		float division=result.div(12.25f, 1.15f);
				
System.out.println(addition);
System.out.println(subtraction);
System.out.println(multiplication);
System.out.println(division);

	}

}
