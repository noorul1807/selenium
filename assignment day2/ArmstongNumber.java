package week1.day2;

public class ArmstongNumber {

	public static void main(String[] args) {
		int num=153;
		int sum=0;
		int input =num;
		while (input>0){
int rem=input%10;
sum=sum+(rem*rem*rem);
input=input/10;
		}
System.out.println(sum);
if (num==sum)
	System.out.println("it is armstrong number");
else
	System.out.println("it is not armstrong number");
	}

}
