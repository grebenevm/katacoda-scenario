## Кратко

Для разработки теста на Spock, добавим следующие Spock-зависимости в `pom.xml`:
* для тестов - org.spockframework:spock-core
* для мокирования - net.bytebuddy:byte-buddy
* для прогона тестов - org.codehaus.gmavenplus:gmavenplus-plugin
____
## Детализация шага
____
Откроем `pom.xml`
    `pom.xml`{{open}}
____
Добавим зависимость org.spockframework:spock-core в `pom.xml`

<pre class="file" data-filename="./pom.xml" data-target="insert" data-marker="        <!--d1-->">
<dependency>
            <groupId>org.spockframework</groupId>
            <artifactId>spock-core</artifactId>
            <version>2.3-groovy-4.0</version>
            <scope>test</scope>
        </dependency>
</pre>
____
Добавим зависимость net.bytebuddy:byte-buddy в `pom.xml`

<pre class="file" data-filename="./pom.xml" data-target="insert" data-marker="        <!--d2-->">
    <dependency> <!-- enables mocking of classes (in addition to interfaces) -->
        <groupId>net.bytebuddy</groupId>
        <artifactId>byte-buddy</artifactId>
        <version>1.14.4</version>
        <scope>test</scope>
    </dependency>
</pre>
____
Добавим зависимость org.codehaus.gmavenplus:gmavenplus-plugin в `pom.xml`

<pre class="file" data-filename="./pom.xml" data-target="insert" data-marker="            <!--p1-->">
            <plugin>
                <groupId>org.codehaus.gmavenplus</groupId>
                <artifactId>gmavenplus-plugin</artifactId>
                <version>2.1.0</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>compile</goal>
                            <goal>compileTests</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
</pre>
---
Теперь добавим spock-тест `spock.course.migration.calc.CalculatorServiceSpockSpec` в директорию `src/test/groovy`
`mkdir -p src/test/groovy/spock/course/migration/calc && && echo "-" > src/test/groovy/spock/course/migration/calc/CalculatorServiceSpockSpec.groovy`{{execute}}

и создадим тест

<pre class="file" data-filename="./pom.xml" data-target="insert" data-marker="-">
package spock.course.migration.calc

import spock.course.migration.calc.service.CalculatorService
import spock.lang.Specification

class CalculatorServiceSpockSpec extends Specification {

    CalculatorService service

    def setup() {
        service = new CalculatorService()
    }

    def "Divide"() {
        expect: 12L == service.divide(24, 2)
    }

}
</pre>
---
Еще нужно добавить в настройки плагина `maven-surefire-plugin` фильтр для `*Spec`-тестов.
Сделаем это:

<pre class="file" data-filename="./pom.xml" data-target="insert" data-marker="<!--filter-->">
<include>**/*Spec</include>
</pre>
---
Теперь убедимся, что приложение собирается без ошибок.

Выполним команду:
`mvn clean test verify`{{execute}}
