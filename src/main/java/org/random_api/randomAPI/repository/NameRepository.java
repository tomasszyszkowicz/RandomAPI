package org.random_api.randomAPI.repository;

import org.random_api.randomAPI.entity.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * The NameRepository interface is responsible for providing CRUD operations
 * for the Name entity.
 */
public interface NameRepository extends JpaRepository<Name, Long> {

    /**
     * Retrieves a random Name from the database.
     *
     * @return a random Name object
     */
    @Query(value = "SELECT * FROM names ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Name findRandomName();
}
