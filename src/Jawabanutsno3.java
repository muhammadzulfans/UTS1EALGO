import java.util.Scanner;
public class Jawabanutsno3 {
    public static void main(String[] args) {
        String[]InfoBus=new String[]{"01-TopLevel","02-MiddleLevel","03-RegularStaff","04-Staff"};
        int i;

        System.out.println("======================================");
        System.out.println(" Kamir From Cinde ");

        System.out.println("1. Bus Top Level untuk C ");
        System.out.println("2. Bus Middle Level untuk M ");
        System.out.println("3. Bus Regullar Staff untuk N ");
        System.out.println("4. Bus Staff untuk P ");
        System.out.println();
        System.out.println("Masukan No Nik Karyawan");
        Scanner karyawan = new Scanner(System.in);
        i = karyawan.nextInt();

        System.out.println("Anda Di Tempatkan Pada Bus Ke" + i);
        System.out.println();
        System.out.println("======================================");
        System.out.println("Jumlah Bus Top Level " + i  );
        System.out.println("Jumlah Bus Middle Level " + i);
        System.out.println("Jumlah Bus Regullar Staff " + i);
        System.out.println("Jumlah Bus Staff " + i);
        System.out.println("======================================");




    }

}
