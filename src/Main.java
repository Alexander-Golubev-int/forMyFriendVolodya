import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StepTracker s = new StepTracker();
        Scanner scan = new Scanner(System.in);

        while (true) {
            mainMenu();
            int command = scan.nextInt();

            if (command == 1) {
                System.out.println("1. Введите месяц от 1(янв.) - 12(дек.).");
                int month = scan.nextInt();
                while (truthCheckMonth(month)) {
                    month = scan.nextInt();
                }
                System.out.println("2. Введите день от 1 - 30.");
                int day = scan.nextInt();
                while (truthCheckDay(day)) {
                    day = scan.nextInt();
                }
                System.out.println("3. Введите количество шагов.");
                int step = scan.nextInt();
                while (truthCheck(step)) {
                    step = scan.nextInt();
                }
                s.stepsInDay(month, day, step);
            } else if (command == 2) {
                System.out.println("Выберите месяц за какой вы хотите получить статистику от 1 - 12.");
                int month = scan.nextInt();
                while (truthCheckMonth(month)) {
                    month = scan.nextInt();
                }
                s.statisticsSteps(month);

            } else if (command == 3) {
                System.out.println("Введите число, на которое вы хотите поменять минимальное количество шагов в день.");
                int step = scan.nextInt();
                while (truthCheck(step)) {
                    step = scan.nextInt();
                }
                s.setGoalPerDay(step);
            } else if (command == 4) {
                System.out.println("Выход из приложения.");
                break;
            } else {
                System.out.println("Такой команды еще нет!");
            }

        }

    }

    //Метод выводит главное меню
    public static void mainMenu() {

        System.out.println("1. Ввести количество шагов за определённый день. "); //реализовать входящее кол-во шагов не в минус
        System.out.println("2. Напечатать статистику за определённый месяц.");
        System.out.println("3. Изменить цель по количеству шагов в день. ");
        System.out.println("4. Выйти из приложения. ");

    }

    //Проверка на отрицательное входящее число на шаги
    public static boolean truthCheck(int i) {
        if (i < 0) {
            System.out.println("Введённое значение не должно быть отрицательным.");
            return true;
        }
        return false;
    }

    //Проверка на отрицательное входящее число на месяц
    public static boolean truthCheckMonth(int i) {
        if (i < 1) {
            System.out.println("Введённое значение не должно быть меньше 1! И не больше 12!.");
            return true;
        }
        if (i > 12) {
            System.out.println("Введённое значение не должно быть меньше 1! И не больше 12!.");
            return true;
        }
        return false;
    }

    //Проверка на отрицательное входящее число на день
    public static boolean truthCheckDay(int i) {
        if (i < 1) {
            System.out.println("Введённое значение не должно быть меньше 1! И не больше 30!.");
            return true;
        }
        if (i > 30) {
            System.out.println("Введённое значение не должно быть меньше 1! И не больше 30!.");
            return true;
        }
        return false;
    }
}