import java.util.Scanner;

public class ooo {

    public static void main (String[] args) {
        System.out.println("Добро пожаловать!");
        System.out.println("Это программа для решения задач(бета версия)");
        System.out.println("Нужно найти h, то есть высоту");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные p1: ");
        int firstValue = scanner.nextInt();
        System.out.println("Введите данные p2: ");
        int secondValue = scanner.nextInt();
        System.out.println("Памятка: формула: (p1 - p2) * 12/1");
        int result1 = firstValue - secondValue;
        int result2 = result1 * 12;
        int result3 = result2 / 1;
        System.out.println("Ответ: h = " + result3 + " метров");
        System.out.println("Спасибо за использование данной программы :)");
        System.out.println("Пожалуйста поставьте нам оценку: ");
        int estimation = scanner.nextInt();
        if (estimation == 10) {
            System.out.println("Спасибо, ждем вас снова :)");
        } else if(estimation >10) {
          System.out.println("Сожалеем что вам не понравилось, можите написать об улучшениях на 'viktorkoer@gmail.com'");
        } else  if(estimation >=3) {
            System.out.println("Что прям настолько плохо? До свидания.");
        } else if(estimation >=1) {
            System.out.println("Сожалеем что данная программа для вас настолько ужасна, надеемся что следующие программы от нашей компании вам понравятся, до свидания");
        }

    }
}




