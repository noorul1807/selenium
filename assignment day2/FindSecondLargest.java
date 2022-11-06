package week1.day2;
import java.util.Arrays;
public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data= {8,9,6,4,7};
		Arrays.sort(data);
		System.out.println("sorted array is");
		for (int i=0 ;i<=data.length;i++) {
			System.out.println(data[i]);
		}
System.err.println("second largest number");
	}

}
