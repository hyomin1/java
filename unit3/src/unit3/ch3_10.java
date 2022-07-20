package unit3;

public class ch3_10 {

   public static void main(String[] args) {
      int n[][] = new int[4][4];
      int x,y;
      
      for(int k=0;k<10;k++) {
         x = (int)(Math.random()*4);
         y = (int)(Math.random()*4); 
         if(n[x][y]==0) {
             n[x][y]=(int)(Math.random()*10+1);
             }
         else {
        	 k--;
         }
         }
      for(int i=0;i<4;i++) {
         for(int j=0;j<n[i].length;j++) {
            if(j%4==0&&i!=0)
               System.out.println();
            System.out.print(n[i][j]+"   ");}
      }
   }

}