package javaex100;

import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
//		33
		Scanner scan = new Scanner(System.in);
		int wd = scan.nextInt();
		switch(wd) {
		case 12:
		case 1:
		case 2:
			System.out.println("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("fail");
			break;
		default:
			break;	
		}
	}

}
