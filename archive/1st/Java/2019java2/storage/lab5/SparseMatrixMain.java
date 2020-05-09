/**
 * 
 * @author KimJin
 *
 */
class Triple {
	int row;
	int col;
	int value;

	public Triple() { // default생성자
		row = 0;
		col = 0;
		value = 0;
	}

	public Triple(int r, int c, int v) { // 인자값3개인 생성자 r c v 로 초기화
		row = r;
		col = c;
		value = v;
	}
}

class SparseMatrix {
	int Nrows, Ncols, Nterms, idx;
	Triple[] a; // 희소행렬 구현 배열 선언

	public SparseMatrix(int rows, int cols, int terms) { // 희소행렬 크기 지정 메소드
		Nrows = rows;  //행의 개수
		Ncols = cols;   // 열의 개수
		Nterms = terms;  // 0이 아닌 원소의 개수
		idx = 0;
		a = new Triple[Nterms];
	}

	public void displayMatrix() { // 희소행렬 화면 출력 메소드
		System.out.println("rows : " + Nrows);
		System.out.println("cols : " + Ncols);
		System.out.println("terms : " + Nterms);
		for (int i = 0; i < Nterms; i++) {
			System.out.println("[" + i + "]" + "    " + a[i].row + "    " + a[i].col + "    " + a[i].value);
		}
	}

	public void storeTriple(int r, int c, int v) { // 희소행렬 저장메소드
		if (idx >= Nterms) { // 크기 초과 검사
			System.out.println("Error : too many terms.."); // 초과시 에러메세지 출력
			System.exit(-1);
		}
		a[idx++] = new Triple(r, c, v);
	}

	public SparseMatrix transpose() {

		int i, j;
		int[] RowTerms = new int[Ncols];
		int[] RowBegins = new int[Ncols];
		SparseMatrix b = new SparseMatrix(Ncols, Nrows, Nterms);
		if (Nterms > 0) {
			for (i = 0; i < Ncols; i++)
				RowTerms[i] = 0;  // 열의 개수 측정 방 초기화
			for (i = 0; i < Nterms; i++)
				RowTerms[a[i].col]++;   // 각 열에 해당되는 원소수의 계산
			RowBegins[0] = 0;  // 열 0의 출발은 0
			for (i = 1; i < Ncols; i++)
				RowBegins[i] = RowBegins[i - 1] + RowTerms[i - 1]; // 각 열의 출발점을 계산
			// 전위행렬생성
			for (i = 0; i < Nterms; i++) {
				j = RowBegins[a[i].col]++;  // 3원소쌍에 저장되어야 하는 인덱스값을 가져오고 하나 증가시킴
				b.a[j] = new Triple(a[i].col, a[i].row, a[i].value); // 3원소쌍을 j 에 저장 
			}
		}
		return b;

	}
}

public class SparseMatrixMain {
	public static void main(String[] args) {
		SparseMatrix a = new SparseMatrix(8, 6, 12); // 희소행렬a 생성
		SparseMatrix b;
		a.storeTriple(0,0,15);
		a.storeTriple(0,3,22);
		a.storeTriple(0,5,-15);
		a.storeTriple(1,1,11);
		a.storeTriple(1,2,3);
		a.storeTriple(2,3,-6);
		a.storeTriple(4,0,91);
		a.storeTriple(5,2,28);
		a.storeTriple(6,2,3);
		a.storeTriple(6,4,9);
		a.storeTriple(7,2,2);
		a.storeTriple(7,5,1);

		a.displayMatrix(); // 희소행렬a 출력
		b= a.transpose();
		b.displayMatrix();
	}
}