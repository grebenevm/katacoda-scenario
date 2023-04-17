## Сборка приложения

### Кратко
Убедимся, что приложение работает в базовом варианте
____
### Детализация задания
____
Посмотрим сервис, реализующий функционал калькулятора в `service.CalculatorService`
    `src/main/java/spock/course/migration/calc/service/CalculatorService.java`{{open}}
____
Посмотрим написанные тесты на Junit-5 в `service.CalculatorServiceTest`
    `src/test/java/spock/course/migration/calc/CalculatorServiceTest.java`{{open}}
____
Посмотрим файл `pom.xml`
В нём настроен плагин **maven-surefire-plugin** для запуска тестов и генерации отчетности по тестам.

А также настроен **jacoco-maven-plugin** для анализа и генерации отчета по покрытию тестами java-кода проекта.

Дополнительно, в учебных целях, в **jacoco-maven-plugin** настроена проверка **check-test**, что не менее 90% кода java-сервисов покрыты тестами. 
    `pom.xml`{{open}}
____
Теперь убедимся, что приложение в базовом функционале собирается без ошибок.

```
mvn clean test verify
```{{execute}}
