package unit3;

public class ch3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=99;i++) {
			int a = i/10;
			int b = i%10;
			if((a==3||a==6||a==9)&&(b==3||b==6||b==9)) {
				System.out.print(i+" 박수 짝짝");
				System.out.println();
			}
			else if((a!=3||a!=6||a!=9)&&(b==3||b==6||b==9)) {
				System.out.print(i+" 박수 짝");
				System.out.println();
				}
			
			else if((a==3||a==6||a==9)&&(b!=3||b!=6||b!=9)) {
				System.out.print(i+" 박수 짝");
				System.out.println();
			}
			
			
			
		}

	}

}
