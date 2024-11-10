package fr.parisnanterre.noah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CarryConnectApplication {

    private static final Logger logger = LoggerFactory.getLogger(CarryConnectApplication.class);

    public static void main(String[] args) {
        logger.debug("Lancement de l'application...");
        SpringApplication.run(CarryConnectApplication.class, args);
    }
}
