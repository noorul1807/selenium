package week3.day1;

public class AxisBank extends Bankinfo{

	public void  AxisBankdeposit() 
	{
		System.out.println("Axis Bank deposit:");
	}

	public static void main(String[] args) {
		AxisBank in= new  AxisBank();
		in.AxisBankdeposit();
		in.saving();
		in.fixed();
		in.deposit();


	}

}
