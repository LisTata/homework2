import java.util.Scanner;
public class Chess {
    public static void main(String[] args) {
//Две клетки на шахматной доске определены своими координатами (x1,y1) и (x2,y2).
        //Может ли король переместиться с первой на вторую клетку?
        Scanner sc= new Scanner(System.in);//Требуется ввести в консоли 4 целых числа
        //int x1=1, y1= 5, x2=3, y2=6;

        int x1=sc.nextInt(), y1= sc.nextInt(), x2=sc.nextInt(), y2=sc.nextInt();
        if((Math.abs(x2-x1)==1 ) && (Math.abs(y2-y1)==1 )){
            System.out.println("YES");
        }else{
            System.out.println("NO");}
        
//Может ли конь переместиться с первой на вторую клетку?

        if (((Math.abs(x2-x1)==1)  && (Math.abs(y2-y1)==2 )) ||((Math.abs(x2-x1)==2) && (Math.abs(y2-y1)==1 ))) {
            System.out.println("YES");}
        else{
            System.out.println("NO");
        }
    }
}

