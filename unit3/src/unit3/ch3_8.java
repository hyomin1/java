package unit3;
import java.util.Scanner;
public class ch3_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = scan.nextInt();
		int number[] = new int[n];
		for(int i=0;i<n;i++) {
			number[i] = (int)(Math.random()*100+1);
			if(i%10==0&&i!=0)
				System.out.println();
			System.out.print(number[i]+ " ");
			
			
		}
		

	}

}
