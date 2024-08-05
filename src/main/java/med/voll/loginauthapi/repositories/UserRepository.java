package med.voll.loginauthapi.repositories;

import med.voll.loginauthapi.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID>{

    Optional<User> findByEmail(String email);
}