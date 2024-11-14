package guru.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    @DisplayName("Первый простой тест")
    void simpleTest(){
        System.out.println("Hello");
    }
}