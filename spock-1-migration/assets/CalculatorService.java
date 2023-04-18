package spock.course.migration.calc.service;

public class CalculatorService {

    public long plus(int x, int y) {
        return (long)x + y;
    }

    public long minus(int x, int y) {
        return (long)x - y;
    }

    public long pow(int x, int y) {
        long result = x;
        while(y-- > 1) {
            result *= x;
        }
        return result;
    }

    //
}
