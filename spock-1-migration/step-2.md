## Кратко
Добавим метод деления чисел divide(int x, int y) в `CalculatorService.java`
____
## Детализация шага
____
Откроем сервис, `CalculatorService.java`
    `src/main/java/spock/course/migration/calc/service/CalculatorService.java`{{open}}
____
Реализуем метод `public long divide(int x, int y)`

<pre class="file" data-filename="./src/main/java/spock/course/migration/calc/service/CalculatorService.java" data-target="insert" data-marker="    //------------->">
    public long divide(int x, int y) {
        return x / y;
    }
</pre>

----
Соберём приложение.

Для этого выполним команду:
`mvn clean test verify`{{execute}}

## Проверка

Убедимся, что в консоли получили ошибку при сборке:

**_BUILD FAILED_**

Также в логах увидим сообщения:
```
[WARNING] Rule violated for class spock.course.migration.calc.service.CalculatorService: lines covered ratio is 0.87, but expected minimum is 0.90

Coverage checks have not been met. See log for details.
```

Это говорит о том, что после добавления метода, процент покрытия кода тестами меньше указанных 90%. Поэтому сборка падает.

----
Перейдём на следующий шаг для доработки тестов под новый метод `divide(int x, int y)`
