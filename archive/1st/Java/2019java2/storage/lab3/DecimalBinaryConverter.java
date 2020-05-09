import java.util.Scanner;

public class DecimalBinaryConverter {
	//decimal to binary converting function
	static void decToBin(int num, int base) {			//if non-static, error; why static?
		if (num>0) {
			decToBin(num/base, base);
			System.out.print(num%base);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int deciValue;

		//decimal value input
		System.out.print("Enter a decimal value that would be converted to binary: ");
		deciValue = scan.nextInt();
		System.out.println();

		//converted binary output
		System.out.println("Decimal Number \"" + deciValue + "\" is converted to Binary Number.");
		decToBin(deciValue, 2);
		System.out.println();
	}
}
