package cat.itacademy.barcelonactiva.pagnoncellidaiane.S05T02.repository;

import cat.itacademy.barcelonactiva.pagnoncellidaiane.S05T02.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    Optional<User> findByEmail(String email);
}


