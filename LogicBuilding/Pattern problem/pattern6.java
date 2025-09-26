package pattern_problem;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		101010
//		101010
//		101010
//		101010
//		101010
		
		int num ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		    num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(j%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
				
			}
			System.out.println();
			
		}
		sc.close();

	}

}
