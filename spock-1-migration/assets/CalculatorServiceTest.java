package spock.course.migration.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spock.course.migration.calc.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service;

    @BeforeEach
    public void initEach(){
        service = new CalculatorService();
    }

    @Test
    void plus() {
        assertEquals(5L, service.plus(2, 3));
    }

    @Test
    void minus() {
        assertEquals(6L, service.minus(9, 3));
    }

    @Test
    void pow() {
        assertEquals(16L, service.pow(2, 4));
    }
}
