package org.random_api.randomAPI.repository;
import org.random_api.randomAPI.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
