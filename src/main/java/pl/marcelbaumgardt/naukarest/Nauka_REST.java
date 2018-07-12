package pl.marcelbaumgardt.naukarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Nauka_REST {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Nauka_REST.class, args);
    }
}
