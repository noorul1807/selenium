package week3.day1;

import java.util.List;
import java.util.ArrayList;

public class RemovewithSpace {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] newText = text.split(" ");
		String[] depText = text.split(" ");

		List li = new ArrayList<String>();

		int count = 0;
		String s;
		for (int i = 0; i < newText.length; i++) {
			count = 0;
			for (int j = 0; j < newText.length; j++) {

				if (depText[j].equals(depText[i])) {

					count++;

				}
			}
			if (count > 1) {
				newText[i] = " ";
			}

			li.add(newText[i]);

		}

		String string = li.toString();
		String replace = string.replace("[", "").replace("]", "").replace(",", "").replace("   ", " ");
		System.out.println(replace);
	}
}
	

