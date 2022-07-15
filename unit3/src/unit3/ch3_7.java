package unit3;

public class ch3_7 {

	public static void main(String[] args) {
		int n[] = new int[10];
		int sum=0;
		System.out.print("랜덤한 정수들 : ");
		for(int i=0;i<n.length;i++) {
			n[i] = (int)(Math.random()*10 +1);
			System.out.print(n[i]+" ");
			sum+=n[i];
			
			}
		System.out.println();
		System.out.print("평균은 "+(double)sum/n.length);
		
		

	}

}
