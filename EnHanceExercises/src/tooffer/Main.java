package tooffer;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String line = sc.nextLine();
			line= line.replaceAll("( )+","%20");
			System.out.println(line);	
		}
	}

}
