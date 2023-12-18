package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class drive {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		
		String line=scanner.nextLine();
		
		ArrayList<String>arrays=new ArrayList<String>();
	while (!(line.equals("exit"))) {
			
			arrays.add(line);
			
			
		}
		
		Iterator<String>iterator=arrays.iterator();
				
		while (iterator.hasNext()) {
			
		String next=iterator.next();
			System.out.println(next);
			
			
		}
	}
}
