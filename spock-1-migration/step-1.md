## Сборка приложения

### Кратко

Убедимся, что приложение работает в базовом варианте

### Детализация задания

1. Посмотрим сервис, реализующий функционал калькулятора в `service.CalculatorService`
  `src/main/java/spock/course/migration/calc/service/CalculatorService.java`{{open}}
2. Посмотрим написанные тесты на Junit-5 в `service.CalculatorServiceTest`
  `src/test/java/spock/course/migration/calc/CalculatorServiceTest.java`{{open}}
3. Затем добавим в `service.CalculatorService` новый метод divide()
4. Добавим зависимости Spock Framework в `pom.xml`
   `pom.xml`{{open}}
4. Затем новый метод divide() покроем тестом уже на Spock Framework
5. И убедимся, что приложение собирается без ошибок

Итак, проверим, что приложение собирается

```
mvn verify
```{{execute}}
