import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Radius = sc.nextFloat();
        System.out.println("The area of the circle is " + Math.PI*Radius*Radius);
    }
}
