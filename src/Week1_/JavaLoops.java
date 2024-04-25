package Week1_;
import java.util.Scanner;
public class JavaLoops {
    public static void main(String[] args) {
        int a ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        a = inp.nextInt();

        for (int i= 0 ; i <= a ; i++) {
            if(i%4==0 && i%3==0) {
                System.out.println(i);
            }
        }
    }
}
