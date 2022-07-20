package unit3;

public class ch3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum+=Integer.parseInt(args[i]);
		
		try {
			System.out.print(sum);
		}
		catch(NumberFormatException e) {
			System.out.print("정수가 아닙니다.");
			i--;
			continue;
			//수정 필요
		}
		}

	}

}
