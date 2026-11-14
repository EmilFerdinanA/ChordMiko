package com.emil.demo.repository;

import com.emil.demo.entity.Songs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SongsRepository extends JpaRepository<Songs, UUID> {
    Optional<Songs> findBySlug(String slug);
}
