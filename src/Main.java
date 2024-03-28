import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать! Это программа для нахождения стороны АВ");
        System.out.println("Треугольник АВС! <A неизвестен.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные <C: ");
        int firstVariable = scanner.nextInt();
        System.out.println("Введите данные <В: ");
        int secondVariable = scanner.nextInt();
        System.out.println("Время найти сторону АВ!");
        System.out.println("Введите длинну стороны СВ: ");
        int thirdVariable = scanner.nextInt();
        int result1 = 90 - secondVariable;
        System.out.println("Угл А равен: " + result1);
        int result2 = thirdVariable * 2;
        System.out.println("Сторона АВ равна: " + result2);



    }
}