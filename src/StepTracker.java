public class StepTracker {
    int[][] month = new int[12][30];
    Converter converter = new Converter();
    int goalPerDay = 10000;

    //Метод записыващий кол-во шагов за определенный день месяца
    void stepsInDay(int monthP, int daysP, int stepsPerDayP) {

        month[monthP - 1][daysP - 1] = stepsPerDayP;
        System.out.println("Данные успешно занесены!");

    }

    /* Данный метод реализует сразу несколько действий:
    1)Взамодействую с классом Converter
    2)Вывод кол-во дней за опр. месяц.
    3)Выводит общее кол-во шагов за месяц.
    4)Выводит день с максимальным кол-вом шагов за весь месяц.
    5)Выводит среднее кол-во шагов за весь месяц.
    6)Выводит пройденную дистанцию в км.
    7)Выводит кол-во сожженых килокалорий.
    8)Подсчитывает сколько раз за месяц, число пройденных шагов, было больше минимального.
     */
    void statisticsSteps(int mounthDays) {
        int stepsPerDay = 0;
        int maxStaps = 0;
        int avearageSteps = 0;
        int bestSeries = 0;

        for (int i = 0; i < month.length; i = 12) {
            for (int j = 0; j < month[0].length; j++) {
                System.out.println((j + 1) + " день: " + month[mounthDays - 1][j]);
                if (goalPerDay < month[mounthDays - 1][j]) {
                    bestSeries++;
                }
                if (maxStaps < month[mounthDays - 1][j]) {
                    maxStaps = month[mounthDays - 1][j];
                }
                stepsPerDay = stepsPerDay + month[mounthDays - 1][j];
            }
            avearageSteps = (int) Math.round(stepsPerDay / month[0].length);
            System.out.println("Общее количество шагов за месяц: " + stepsPerDay + "!");
            System.out.println("Максимальное количество шагов за месяц: " + maxStaps + "!");
            System.out.println("Среднее шагов за месяц: " + avearageSteps + "!");
            System.out.println("Пройденная дистанция: " + converter.distanceTraveled(stepsPerDay) + " км!");
            System.out.println("Количество сожженых килокалорий: " + converter.calculatorCal(stepsPerDay) + ".");
            System.out.println("Лучшая серия, когда кол-во шагов было большего целевого: " + bestSeries + ".");


        }
    }

    void setGoalPerDay(int desired) {
        goalPerDay = desired;
        System.out.println("Теперь минимальное количество шагов в день: " + goalPerDay);
    }


}
