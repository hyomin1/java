package unit3;
import java.util.Scanner;
public class ch3_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number[] = new int[10];
		System.out.print("양의 정수 10개를 입력하시오>>");
		for(int i=0;i<number.length;i++) {
			number[i]=scan.nextInt();}
		System.out.print("3의 배수는 ");
		for(int i=0;i<number.length;i++)
			if(number[i]%3==0)
				System.out.print(number[i]+" ");
		scan.close();
			
		

	

}
}
