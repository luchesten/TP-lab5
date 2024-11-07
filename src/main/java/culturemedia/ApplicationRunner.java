package culturemedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class ApplicationRunner {
    protected static final Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {
        SpringApplication.run( ApplicationRunner.class,args);
    }
}