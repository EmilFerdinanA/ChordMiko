package com.emil.demo.service.implementation;

import com.emil.demo.entity.Songs;
import com.emil.demo.repository.SongsRepository;
import com.emil.demo.service.SongsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SongsServiceImpl implements SongsService {
    private final SongsRepository songsRepository;

    @Override
    public List<Songs> getAll() {
        return songsRepository.findAll();
    }

    @Override
    public Optional<Songs> getBySlug(String slug) {
        return songsRepository.findBySlug(slug);
    }

    @Override
    public Songs create(Songs songs) {
        return songsRepository.save(songs);
    }
}
