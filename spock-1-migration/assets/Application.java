package spock.course.migration.calc;

import spock.course.migration.calc.service.CalculatorService;

public class Application {

    public static void main(String[] args) {
        var service = new CalculatorService();
        System.out.println("example: 5 + 5 = " + service.plus(5,5));
        System.out.println("Application finished");
    }

}
