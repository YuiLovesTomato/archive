package pk0605;

public class Ex1 {
	public static void main(String[] args) {
		int sum=0;

		System.out.print("[" + args[0] + "]���� ������ ");
		for (int i=1; i<4; i++) {
			System.out.print("[" + args[i] + "] ");
			sum += Integer.parseInt(args[i]);
		}
		System.out.print("�̰�, ���� [" + sum + "] �Դϴ�.");
	}

}
