import java.util.Scanner;

public class TimeConversion {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int time;
        time = in.nextInt ();
        time -= 800;
        time = time >= 0 ? time : time + 2400;
        if (time < 10) {
            System.out.println ("0" + time);
        }
        else {
            System.out.println (time);
        }
    }
}
