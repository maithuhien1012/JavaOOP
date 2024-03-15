import java.util.Scanner;
public class Student {
    public static void main(String[] args){}
        public String name,mssv;
        public float diemmonToan;
        public float diemmonAnh;
        public float diemmonVan;

    public void NhapThongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten sinh vien: ");
        name = sc.nextLine();
        System.out.print("Nhap ma so sinh vien: ");
        mssv = sc.nextLine();
        System.out.print("Nhap diem mon Toan: ");
        diemmonToan = sc.nextFloat();
        System.out.print("Nhap diem mon Anh: P");
        diemmonAnh = sc.nextFloat();
        System.out.print("Nhap diem mon Van: ");
        diemmonVan = sc.nextFloat();
        

    }
    void Xuatthongtin(){
        System.out.println("Ho va ten "+name);
        System.out.println("Ma so sinh vien "+mssv);
    }
    public void diemtongket(){
        float diemtongket = (diemmonToan+diemmonAnh+diemmonVan)/3;
        System.out.println("Diem tong ket mon = "+diemtongket);
    }

    
}
