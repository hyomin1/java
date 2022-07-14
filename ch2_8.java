import java.util.Scanner;
public class ch2_8 {
    public static boolean inRect(int x, int y, int rectx1, int recty1,int rectx2,int recty2) {
        if ((x>=rectx1&&x<=rectx2)&&(y>=recty1&&y<=recty2))
         return true;
        else
         return false;
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("점 (x,y)의 좌표를 입력하시오>>>");
        int x= scanner.nextInt();
        int y = scanner.nextInt();
        if (inRect(x,y,100,100,200,200))
         System.out.print("충돌한다.");
        else
        
         System.out.print("충돌하지 않는다.");
        scanner.close();
        //다시해야함

    }
}
