package common;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class JavaTest {

    final List<String> list = Arrays.asList("Dima", "Ivan", "Petr", "Alex", "Ivan", "Misha", "Bee",
            "Bear", "Car", "Spring", "Java", "Dima", "SPRING", "ALEX", "Alex", "alex");

    @Test
    @DisplayName("Проверка уникальных значений")
    void findUniqueElementsInList() {
//        Assertions.assertThat()
//                .containsOnlyOnceElementsOf(List.of("Dima", "Alex","Spring"));
    }

}
