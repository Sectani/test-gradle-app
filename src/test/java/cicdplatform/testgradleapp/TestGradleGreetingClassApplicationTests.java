package cicdplatform.testgradleapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestGradleGreetingClassApplicationTests {


    @Test
    public void testGreet() {
        GreetingClass greetingClass = new GreetingClass();
        String result = greetingClass.greet("World");
        assertEquals("Hello, World!", result);
    }

}
