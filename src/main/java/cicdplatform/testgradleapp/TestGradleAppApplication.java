package cicdplatform.testgradleapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestGradleAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TestGradleAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        GreetingClass greetingClass = new GreetingClass();
        System.out.println(greetingClass.greet("From this app"));
    }
}
