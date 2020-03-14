import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Алина", "2020"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Привет! Меня зовут " + assistantName + ".");
        System.out.println("Я была создана " + birthYear + ".");
        System.out.println("Пожалуйста, назовите свое имя.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("Какое замечательное у вас имя, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Позволь мне угадать твой возраст.");
        System.out.println("Скажи мне остаток от деление твоего возраста, разделить свой возраст на 3, 5 и 7.");
        int num1 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int num7 = scanner.nextInt();
        int age = (num1 * 70 + num5 * 21 + num7 * 15) % 105;
        System.out.println("Вам " + age + ", чудесно!!");
    }

    static void count() {
        System.out.println("Теперь я докажу вам, что могу считать любое число, которое вы захотите.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Давайте проверим ваши знания в области программирования.");
        System.out.println("Почему мы используем методы?");
        System.out.println("1. Повторить заявление несколько раз.");
        System.out.println("2. Разложить программу на несколько небольших подпрограмм.");
        System.out.println("3. Определить время выполнения программы.");
        System.out.println("4. Чтобы прервать выполнение программы.");
        int answerNumber;
        boolean ok = true;
        do {
            answerNumber = scanner.nextInt();
            if (answerNumber == 2) {
                ok = false;
                break;
            } else {
                System.out.println("Пожалуйста, повторите попытку");
            }
        } while (ok);
    }

    static void end() {
        System.out.println("Поздравляю, хорошего вам дня!!!");
    }
}
