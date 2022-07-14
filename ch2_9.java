import java.util.Scanner;
public class ch2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 중심과 반지름 입력>>");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double r = scanner.nextDouble();
        System.out.print("점 입력");
        double x1 = scanner.nextDouble();
        double y1= scanner.nextDouble();
        if (Math.sqrt(((x-x1)*(x-x1))+((y-y1)*(y-y1)))<=r)
         System.out.print("점 ("+x1+", "+y1+")는 원 안에 있다.");
        else
         System.out.print("점 ("+x1+", "+y1+")는 원 안에 없다.");
        scanner.close();
        

    }
    
}
