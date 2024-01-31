import java.util.Scanner;
public class slide35chuong2 {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
    Scanner sc =new Scanner(System.in);
      System.out.print("Nhap vao so thu nhat: ");
         firstNumber = sc.nextInt ();
     System.out.print("Nhap vao so thu hai: ");
       secondNumber = sc.nextInt ();
       int minNumber = firstNumber;
     if ( firstNumber > secondNumber )
      minNumber = secondNumber ;
    System.out.println(" So nho nhat trong hai so "  +  firstNumber   + " va " + secondNumber + " la " + minNumber);
    } 
}
