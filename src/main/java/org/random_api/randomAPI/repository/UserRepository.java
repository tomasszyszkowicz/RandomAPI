package org.random_api.randomAPI.repository;
import org.random_api.randomAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
