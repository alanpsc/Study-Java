import java.util.Scanner;

public class Multiply {

     public static void main(String []args){
        Scanner in = new Scanner (System.in);
        int x, y;
        System.out.print ("Enter an integer, x: ");
        x = in.nextInt ();
        System.out.print ("Enter an integer, y: ");
        y = in.nextInt ();
        System.out.println ("Answer = " + x * y);
     }
}
