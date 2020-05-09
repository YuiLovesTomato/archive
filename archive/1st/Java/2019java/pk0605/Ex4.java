package pk0605;

interface Inter1 {
	void prttxt(String[] a);
	void process(String[] a);
	void prtsum();
}

abstract class ExAbs{
	abstract void prttxt(String[] a);
	abstract void process(String[] a);
	abstract void prtsum();
}

public class Ex4 extends ExAbs implements Inter1 {
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
		Ex4 obj = new Ex4();

		obj.prttxt(args);
		obj.process(args);
		obj.prtsum();

	}

}