## Сборка приложения

### Кратко
Добавим метод деления чисел divide(int x, int y) в `CalculatorService.java`
____
### Детализация задания
____
Откроем сервис, `CalculatorService.java`
    `src/main/java/spock/course/migration/calc/service/CalculatorService.java`{{open}}
____
Реализуем метод `public long divide(int x, int y)`

<pre class="file" data-filename="./src/main/java/spock/course/migration/calc/service/CalculatorService.java" data-target="insert" data-marker="//------------->">
public long divide(int x, int y) {
    return x / y;
}
</pre>

----
Соберём приложение.

Для этого выполним команду:
`mvn clean test verify`{{execute}}

### Проверка

Убедимся, что в консоли получили ошибку при сборке:

**_BUILD FAILED_**

----
Перейдём на следующий шаг для доработки тестов под новый метод
`divide(int x, int y)`
