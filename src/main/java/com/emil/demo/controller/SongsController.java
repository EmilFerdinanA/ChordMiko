package com.emil.demo.controller;

import com.emil.demo.entity.Songs;
import com.emil.demo.service.SongsService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/songs")
@AllArgsConstructor
public class SongsController {
    private final SongsService songsService;

    @GetMapping
    public  ResponseEntity<List<Songs>> getAll() {
        List<Songs> all = songsService.getAll();
        return ResponseEntity.ok().body(all);
    }

    @PostMapping
    public  ResponseEntity<Songs> create(@Valid @RequestBody Songs songs) {
        Songs createdSong = songsService.create(songs);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSong);
    }
}
