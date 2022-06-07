import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Count down seconds:");
        int seconds = in.nextInt();
        int x = seconds % 60;
        int y = seconds / 60;
        int z = y % 60;
        y = y /60;
        System.out.println(x+":" +y+ ":" +z);
    }
}