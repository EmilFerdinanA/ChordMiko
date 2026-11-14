package com.emil.demo.service;

import com.emil.demo.entity.Songs;

import java.util.List;
import java.util.Optional;

public interface SongsService {
    List<Songs> getAll();
    Optional<Songs> getBySlug(String slug);
    Songs create(Songs songs);
}
