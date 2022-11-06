package week1.day2;

public class FibonacciSeries {
public static void main(String[] args) {
	int number=5;
	int firstnumber=0;
	int secondnumber=1;
	int sum;
		System.out.println(firstnumber);
		for (int i= 0;i<=number;i++) {
			sum= firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=sum;
			System.out.println(sum);
			
		}

	}

}
