<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>netology</groupId>
    <artifactId>grisha</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>
    <dependencies>

    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.8.1</version>
        <scope>test</scope>
    </dependency>
    </dependencies>
    <build>
          <plugins>
              <plugin>
                  <groupId></groupId>
                  <artifactId>maven-surefire-plugin</artifactId>
                  <version>2.12.4</version>
              </plugin>

          </plugins>
    </build>
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BonusServiceUnregisteredTest {

    @Test
    void calculate() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 10_000;
        boolean registered = false;
        long expected = 1;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void Bonuscalculate() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 100;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
