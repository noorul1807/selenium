package week3.day1;

import java.util.Scanner;

public class MissingNumber {

	public MissingNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the n value: ");
	      int n = sc.nextInt();
	      int inpuArray[] = new int[n];
	      System.out.println("Enter (n-1) numbers: ");
	      for(int i=0; i<=n-2; i++) {
	         inpuArray[i] = sc.nextInt();
	      }
	      //Finding the missing number
	      int xorArray = inpuArray[0];
	      //XOR of elements of the array
	      for(int i=1; i<=n-1; i++) {
	         xorArray = xorArray ^ i;
	      }
	      int xorAll = inpuArray[1];
	      //XOR of elements of the array
	      for(int i=1; i<=n-1; i++) {
	         xorAll = xorAll ^ i;
	      }
	      int missingNumber = xorArray ^ xorAll;
	      System.out.println("Missing number is: "+missingNumber);
	   }
	}


