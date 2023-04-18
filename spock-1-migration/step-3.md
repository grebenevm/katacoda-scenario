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
<![CDATA[
<dependency>
    <groupId>org.spockframework</groupId>
    <artifactId>spock-core\</artifactId>
    <scope>test</scope>
</dependency>
]]>
</pre>