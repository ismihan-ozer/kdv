import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double tutar, kdv, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz: ");
        tutar = input.nextDouble();


        boolean kdvOrani = (0 < tutar) && (tutar < 1000);
        kdv = kdvOrani ? 0.18 : 0.08 ;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar *kdvTutar;

        System.out.println("KDV'siz Tutar :* " + tutar);
        System.out.println("KDV Oranı  : " + kdvOran);
        System.out.println("KDV Tutarı :* " + kdvTutar);
        System.out.println("KDV'siz Tutar :* " + kdvliTutar);


    }
}