import java.util.Scanner;

public class JavaStdinandStdoutII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        double d = 0;
        String s = "";

        while(scan.hasNext()){
            s += scan.next() + " ";
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

