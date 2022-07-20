package unit4;
import java.util.Scanner;

class Circle1 {
	double x,y;
	int radius;
	public Circle1(double x, double y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	
}

public class ch4_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Circle1 c [] = new Circle1[3];
		for(int i=0;i<c.length;i++) {
			System.out.print("x, y, radius >>");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int radius = scan.nextInt();
			c[i] = new Circle1(x,y,radius);
		}
		
		double max = c[0].radius;
		for(int i=0;i<c.length;i++) {
			if(c[i].radius>max)
				System.out.print("가장 면적이 큰 원은 ("+c[i].x+","+c[i].y+")"+c[i].radius);
		}
		
		
		
		scan.close();

	}

}
