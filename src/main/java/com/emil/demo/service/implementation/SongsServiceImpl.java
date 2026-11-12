package com.emil.demo.service.implementation;

import com.emil.demo.entity.Songs;
import com.emil.demo.repository.SongsRepository;
import com.emil.demo.service.SongsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SongsServiceImpl implements SongsService {
    private final SongsRepository songsRepository;

    @Override
    public List<Songs> getAll() {
        return songsRepository.findAll();
    }

    @Override
    public Songs create(Songs songs) {
        return songsRepository.save(songs);
    }
}
