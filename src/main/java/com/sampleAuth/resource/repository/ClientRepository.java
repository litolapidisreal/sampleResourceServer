package com.sampleAuth.resource.repository;

import com.sampleAuth.resource.models.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<CustomClient, Long> {
    Optional<CustomClient> findByClientId(String email);
}
