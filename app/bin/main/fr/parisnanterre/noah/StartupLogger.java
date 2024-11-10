package fr.parisnanterre.noah;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupLogger implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(StartupLogger.class);

    @Override
    public void run(String... args) {
        try {
            // Si l'application démarre correctement
            logger.debug("Application démarrée avec succès !");
            System.out.println("Application démarrée avec succès !");
        } catch (Exception e) {
            // Si une exception se produit, on capture l'erreur
            logger.error("Une erreur est survenue au démarrage de l'application", e);
            System.out.println("Une erreur est survenue au démarrage de l'application : " + e.getMessage());
        }
    }
}
