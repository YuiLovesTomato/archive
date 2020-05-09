/**
 * 
 * @author KimJin
 *
 */
class Triple {
	int row;
	int col;
	int value;

	public Triple() { // default������
		row = 0;
		col = 0;
		value = 0;
	}

	public Triple(int r, int c, int v) { // ���ڰ�3���� ������ r c v �� �ʱ�ȭ
		row = r;
		col = c;
		value = v;
	}
}

class SparseMatrix {
	int Nrows, Ncols, Nterms, idx;
	Triple[] a; // ������ ���� �迭 ����

	public SparseMatrix(int rows, int cols, int terms) { // ������ ũ�� ���� �޼ҵ�
		Nrows = rows;  //���� ����
		Ncols = cols;   // ���� ����
		Nterms = terms;  // 0�� �ƴ� ������ ����
		idx = 0;
		a = new Triple[Nterms];
	}

	public void displayMatrix() { // ������ ȭ�� ��� �޼ҵ�
		System.out.println("rows : " + Nrows);
		System.out.println("cols : " + Ncols);
		System.out.println("terms : " + Nterms);
		for (int i = 0; i < Nterms; i++) {
			System.out.println("[" + i + "]" + "    " + a[i].row + "    " + a[i].col + "    " + a[i].value);
		}
	}

	public void storeTriple(int r, int c, int v) { // ������ ����޼ҵ�
		if (idx >= Nterms) { // ũ�� �ʰ� �˻�
			System.out.println("Error : too many terms.."); // �ʰ��� �����޼��� ���
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
				RowTerms[i] = 0;  // ���� ���� ���� �� �ʱ�ȭ
			for (i = 0; i < Nterms; i++)
				RowTerms[a[i].col]++;   // �� ���� �ش�Ǵ� ���Ҽ��� ���
			RowBegins[0] = 0;  // �� 0�� ����� 0
			for (i = 1; i < Ncols; i++)
				RowBegins[i] = RowBegins[i - 1] + RowTerms[i - 1]; // �� ���� ������� ���
			// ������Ļ���
			for (i = 0; i < Nterms; i++) {
				j = RowBegins[a[i].col]++;  // 3���ҽֿ� ����Ǿ�� �ϴ� �ε������� �������� �ϳ� ������Ŵ
				b.a[j] = new Triple(a[i].col, a[i].row, a[i].value); // 3���ҽ��� j �� ���� 
			}
		}
		return b;

	}
}

public class SparseMatrixMain {
	public static void main(String[] args) {
		SparseMatrix a = new SparseMatrix(8, 6, 12); // ������a ����
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

		a.displayMatrix(); // ������a ���
		b= a.transpose();
		b.displayMatrix();
	}
}