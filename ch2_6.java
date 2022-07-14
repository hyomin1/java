import java.util.Scanner;


public class ch2_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int x = scanner.nextInt();

        if (x==3||x==6||x==9)
         System.out.print("박수짝");   
        else if ((x/10==3&&x%10==3)||(x/10==3&&x%10==6)||(x/10==3&&x%10==9))
         System.out.print("박수짝짝");
        else if ((x/10==6&&x%10==3)||(x/10==6&&x%10==6)||(x/10==6&&x%10==9))
         System.out.print("박수짝짝");
        else if ((x/10==9&&x%10==3)||(x/10==9&&x%10==6)||(x/10==9&&x%10==9))
         System.out.print("박수짝짝");
        else if(x%10==3||x%10==6||x%10==9)
          System.out.print("박수짝");
        else
         System.out.print("369게임의 숫자가 아닙니다.");
        scanner.close(); 
    }

}