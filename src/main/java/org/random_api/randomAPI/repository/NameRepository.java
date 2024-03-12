package org.random_api.randomAPI.repository;
import org.random_api.randomAPI.entity.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NameRepository extends JpaRepository<Name, Long> {
    
    @Query(value = "SELECT * FROM names ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Name findRandomName();
}
