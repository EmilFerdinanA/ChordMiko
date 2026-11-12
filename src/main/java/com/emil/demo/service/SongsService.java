package com.emil.demo.service;

import com.emil.demo.entity.Songs;

import java.util.List;

public interface SongsService {
    List<Songs> getAll();
    Songs create(Songs songs);
}
