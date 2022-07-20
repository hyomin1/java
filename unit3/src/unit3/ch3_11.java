package unit3;

public class ch3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum+=Integer.parseInt(args[i]);
		}
		try {
			
		    System.out.print(sum/args.length);
		    }
		catch (ArithmeticException e) {
			System.out.print("0으로 나눌수 없습니다.");
		}
		
		

	}

}
