import java.util.Random;
import java.util.Scanner;

public class JustePrix {
    public static void main(String[] args) {
        Random r = new Random();
        int essai = 0;
        int JustePrix = r.nextInt(100);
        int prix = 0;

        while(JustePrix != prix){
            System.out.println("taper un nombre entre 0 et 100");
            Scanner scan = new Scanner(System.in);
            prix = scan.nextInt();
            essai++;
            
            if(prix < JustePrix){
                System.out.println("c'est plus");
            }else if(prix > JustePrix){
                System.out.println("c'est moins");
            }else{
                System.out.println("Felicitation le juste prix est " + JustePrix + " en " + essai + " essai");
            }
        }
    }
    
}
