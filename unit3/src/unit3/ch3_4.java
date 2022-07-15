package unit3;
import java.util.Scanner;
public class ch3_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scan.next();
		char word = s.charAt(0);
		for(char c= word;c>='a';c--) {
			for(char d = 'a';d<=c;d++) 
				System.out.print(d);
			System.out.println();
		}
		

	}

}
