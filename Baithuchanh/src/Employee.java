import java.util.Scanner;
public class Employee {
    public static void main(String[] args){}
        public String name;
        public int age;
        public float luong, trocap;

    public void NhapThongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten cua nguoi cong nhan: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi cua nguoi cong nhan: ");
        age = sc.nextInt();
        System.out.print("Nhap luong cua nguoi cong nhan: ");
        luong = sc.nextFloat();
        System.out.print("Nhap tien tro cap cua nguoi cong nhan: ");
        trocap = sc.nextFloat();
    }
    public void Xuatthongtin(){
        System.out.println("Ho va ten " +name);
        System.out.println("Tuoi " +age);
    }
    public void tinhluong(){
        float tinhluong = luong + trocap;
        System.out.println("Luong cua cong nhan =" +tinhluong);
    }
}
