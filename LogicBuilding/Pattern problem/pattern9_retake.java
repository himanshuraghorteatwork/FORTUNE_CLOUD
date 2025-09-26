package pattern_problem;

public class pattern9_retake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == 1 || i == 4 || j == 1 || j == 4) {
					if (i % 2 == 0) {
						System.out.print("0");
					} else {
						System.out.print("1");
					}

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
