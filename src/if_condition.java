import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class if_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the valus");
        int age = sc.nextInt();

        if(age > 18)
        {
            System.out.println(" ALLOWED TO VOTE");
        }
    }
}
