package unit3;
import java.util.Scanner;
public class ch3_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int n = scan.nextInt();
		for(int i=0;i<5;i++) {
			for(int j=5-i;j>=1;j--)
				System.out.print("*");
			System.out.println();
		}

	}

}
