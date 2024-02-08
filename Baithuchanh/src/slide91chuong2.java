import java.util.Scanner;
public class slide90chuong2 {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi bat ky: ");
        chuoi = scanner.nextLine();
        System.out.println("Cac ky tu co trong chuoi la: ");
        for (int i = 0; i < chuoi.length(); i++){
            kytu = chuoi.charAt(i);
            System.out.println(kytu);
        }
    }
}