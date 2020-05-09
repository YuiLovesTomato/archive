public class StudentScore {

	public static void main(String[] args) {

		String[] name = {"Kim Jin", "Hong Gil Dong", "Kim Kim", "Lee Lee", "Park Park", "Jung Jung", "Sim Sim", "Hwang Hwang", "Ryu Ryu", "Han Han"};
		int score[][] = new int[11][4];

		score[0][0] = 30;
		score[0][1] = 60;
		score[0][2] = 90;
		score[1][0] = 10;
		score[1][1] = 40;
		score[1][2] = 40;
		score[2][0] = 20;
		score[2][1] = 10;
		score[2][2] = 10;
		score[3][0] = 50;
		score[3][1] = 30;
		score[3][2] = 20;
		score[4][0] = 40;
		score[4][1] = 20;
		score[4][2] = 80;
		score[5][0] = 60;
		score[5][1] = 80;
		score[5][2] = 70;
		score[6][0] = 80;
		score[6][1] = 70;
		score[6][2] = 30;
		score[7][0] = 70;
		score[7][1] = 50;
		score[7][2] = 100;
		score[8][0] = 90;
		score[8][1] = 100;
		score[8][2] = 60;
		score[9][0] = 100;
		score[9][1] = 90;
		score[9][2] = 50;
		score[10][0] = 0;
		score[10][1] = 0;
		score[10][2] = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				score[i][3] += score[i][j];
				score[10][j] += score[i][j];
			}
			score[i][3] = score[i][3] / 3;
			System.out.println((i + 1) + " student's final score is: " + score[i][3]);
		}

		System.out.println();

		for (int j = 0; j < 3; j++) {
			score[10][j] = score[10][j] / 10;
			System.out.println((1 + j) + " test's average score is: " + score[10][j]);
		}

		System.out.println();

		//fail print
		for (int i = 0; i < score[0].length; i++) {
			if (score[i][3] < 60) {
				System.out.println(String.format("%s has failed the exam. score: %d", name[i], score[i][3]));
			}
		}
	}
}
