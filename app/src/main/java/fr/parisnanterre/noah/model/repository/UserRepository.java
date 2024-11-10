package fr.parisnanterre.noah.repository;

import fr.parisnanterre.noah.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Vous pouvez ajouter des méthodes de requêtes personnalisées ici si nécessaire.
}
