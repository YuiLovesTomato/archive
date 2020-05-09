package pk0605;

interface Inter {
	void prttxt(String[] a);
	void process(String[] a);
	void prtsum();
}

public class Ex3 implements Inter {
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
		Ex3 obj = new Ex3();

		obj.prttxt(args);
		obj.process(args);
		obj.prtsum();

	}

}
