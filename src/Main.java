import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parallelepiped parallelepiped = null;
        try {
            System.out.println("длина:");
            int length = scanner.nextInt();
            System.out.println(" ширина:");
            int width = scanner.nextInt();
            System.out.println("высота:");
            int height = scanner.nextInt();


            parallelepiped = new Parallelepiped(length, width, height);
            if (parallelepiped.getLength() > 20 || parallelepiped.getWidth() > 20 || parallelepiped.getHeight() > 20) {
                System.out.println("заданное число не должно быть больше 20!!!");
            } else if (parallelepiped.getLength() < 0 || parallelepiped.getWidth() < 0 || parallelepiped.getHeight() < 0) {
                System.out.println("не может быть отрицательным числом!!!");

            }
        } catch (InputMismatchException a) {
            System.out.println("не должно быть буквой!!!");
        }
        System.out.println(parallelepiped.getSquare());
        System.out.println(parallelepiped.getVolume());
    }
}







