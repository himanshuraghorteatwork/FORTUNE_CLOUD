package pattern_problem;

import java.util.Scanner;

public class pattern2 {
	
//	enter the number : 
//		4
	
//		4 4 4 4 
//		3 3 3 3 
//		2 2 2 2 
//		1 1 1 1 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= num; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
