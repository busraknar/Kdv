import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz:");
        tutar = input.nextDouble();
        if(tutar>=1 && tutar<1000){
            double kdvOran=0.18;
            double kdvTutar = tutar* kdvOran;
            double kdvLitutar= tutar + kdvTutar;
            System.out.println("Kdv oranı:" +kdvOran);
            System.out.println("Kdvli tutarınız: "+kdvLitutar);}
        else {
            double kdvOran=0.08;
            double kdvTutar = tutar* kdvOran;
            double kdvLitutar= tutar + kdvTutar;
            System.out.println("Kdv oranı:" +kdvOran);
            System.out.println("Kdvli tutarınız: "+kdvLitutar);}

    }

}
