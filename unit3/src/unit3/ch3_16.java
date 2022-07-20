package unit3;
import java.util.Scanner;
public class ch3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String str[] = {"가위","바위","보"};
		while(true) {
			System.out.print("가위 바위 보!>>");
			String s = scan.next();
			if(s.equals("그만")) {
				System.out.print("게임을 종료합니다...");
				break;}
			int n = (int)(Math.random()*3);
			System.out.print("사용자 = "+s+" , 컴퓨터 = "+str[n]+" ");
			if(str[n].equals("바위")) {
				if(s.equals("가위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else if (s.equals("바위"))
					System.out.println("비겼습니다.");
				else if (s.equals("보"))
					System.out.println("사용자가 이겼습니다.");
			}
			else if(str[n].equals("보")) {
				if(s.equals("가위"))
					System.out.println("사용자가 이겼습니다.");
				else if(s.equals("바위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else if (s.equals("보"))
					System.out.println("비겼습니다.");	
			}
			else if (str[n].equals("가위")) {
				if(s.equals("가위"))
					System.out.println("비겼습니다.");
				else if(s.equals("바위"))
					System.out.println("사용자가 이겼습니다.");
				else if(s.equals("보")) 
					System.out.println("컴퓨터가 이겼습니다.");
			}
			
		}

	}

}
