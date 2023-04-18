## Кратко
Убедимся, что приложение работает в базовом варианте. Для этого соберём приложение.
____
## Детализация шага
____
Посмотрим сервис, реализующий функционал калькулятора
    `src/main/java/spock/course/migration/calc/service/CalculatorService.java`{{open}}
____
Посмотрим написанные тесты на Junit-5
    `src/test/java/spock/course/migration/calc/CalculatorServiceTest.java`{{open}}
____
Посмотрим файл `pom.xml`.

В нём настроен плагин **maven-surefire-plugin** для запуска тестов и генерации отчетности по тестам.

А также настроен плагин **jacoco-maven-plugin** для анализа и генерации отчета по покрытию тестами java-кода проекта.

Дополнительно, в учебных целях, в **jacoco-maven-plugin** настроена проверка **check-test**, что не менее 90% кода java-сервисов покрыты тестами. 
    `pom.xml`{{open}}
____
Теперь убедимся, что приложение в базовом функционале собирается без ошибок.

Выполним команду:
`mvn clean test verify`{{execute}}

## Проверка

Убедимся, что в консоли получили:

**_BUILD SUCCESS_**

И выше в логах:

**_Tests run: 3, Failures: 0, Errors: 0, Skipped: 0_**
____
Посмотрим на csv-отчёт плагина **jacoco-maven-plugin** в файле `./target/site/jacoco/jacoco.csv`
Увидим, что все строки кода покрыты тестами: столбец `LINE_MISSED` = 0.
Просмотр отчёта: клавиши "влево", "право". Выход - клавиша "Q".

    `column -s, -t < ./target/site/jacoco/jacoco.csv | less -#2 -N -S`{{execute}}
____
С приложением разобрались. Переходим к доработкам.
