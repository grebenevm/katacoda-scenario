package spock.course.migration.calc

import spock.course.migration.calc.service.CalculatorService
import spock.lang.Specification

class CalculatorServiceSpockTest extends Specification {

    CalculatorService service

    def setup() {
        service = new CalculatorService()
    }

    def "Plus"() {
        expect: 5L == service.plus(2, 3)
    }

    def "Minus"() {
        expect: 6L == service.minus(9, 3)
    }

    def "Divide"() {
        expect: 12L == service.divide(24, 2)
    }

    def "Pow"() {
        expect: 16L == service.pow(2, 4)
    }
}
