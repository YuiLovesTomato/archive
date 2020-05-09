package pk0605;

public class Ex2 {
		int sum=0;
	public void prttxt(String[] a) {
		System.out.print("[" + a[0] + "]님의 성적은 ");
	}
	public void process(String[] a) {
		for (int i=1; i<4; i++) {
			System.out.print("[" + a[i] + "] ");
			sum += Integer.parseInt(a[i]);
		}
	}
	public void prtsum() {
		System.out.print("이고, 총점 [" + sum + "] 입니다.");
	}
	public static void main(String[] args) {
		Ex2 obj = new Ex2();

		obj.prttxt(args);
		obj.process(args);
		obj.prtsum();

	}

}
