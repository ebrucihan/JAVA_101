
package Week1_;
import java.util.Scanner;
public class VucutKitleEndeksHesaplama {
  public static void main(String[] args) {
      double kg;
      double boy;

      Scanner girdi = new Scanner(System.in);
      System.out.print("Lütfen kilonuzu giriniz: ");
      kg = girdi.nextDouble();
      System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:" );
      boy = girdi.nextDouble();

      double indeks = kg / (boy * boy);
      System.out.println("Vücut Kitle Endeksiniz: " + indeks);



  }
}
