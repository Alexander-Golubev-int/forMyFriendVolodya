public class Converter {

    double distance = 0.00075; //перевел в километры

    //Метод подсчитывающий пройденную дистанцию в км.
    double distanceTraveled(double i) {
        return distance * i;
    }

    //Метод подсчтывающий кол-во сожженых килокалорий
    double calculatorCal(double steps) {

        return steps * 0.05;
    }
}
