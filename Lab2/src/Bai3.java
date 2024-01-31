import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        int tuoi , nam ;
        String ten , nhomTuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten: "); 
        ten = sc.nextLine();
         System.out.print("Nhap vao nam sinh: ");
        nam = sc.nextInt();
        tuoi = 2024 - nam;
        if( tuoi < 16){
            nhomTuoi = "o do tuoi vi thanh nien.";
            } else if (tuoi >= 16 || tuoi < 18) {
                nhomTuoi = "tuoi truong thanh." ;
             if (tuoi >= 18) {
                nhomTuoi = "gia roi!";
             }
            System.out.println("Ban " + ten + " thuoc nhom " +  nhomTuoi);
        }
    }
}
