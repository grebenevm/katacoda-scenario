## Сборка приложения

### Кратко
Убедимся, что приложение работает в базовом варианте
____
### Детализация
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

### Проверка

Убедимся, что в консоли получили:

**_BUILD SUCCESS_**

И выше в логах:

**_Tests run: 3, Failures: 0, Errors: 0, Skipped: 0_**
____
Посмотрим на html-отчёт **jacoco-maven-plugin** в файле `jacoco.index.html`
    `./target/site/jacoco/index.html`{{open}}
____
С приложением разобрались. Переходим к доработкам...
