package com.emil.demo.controller;

import com.emil.demo.constant.ApiUrl;
import com.emil.demo.dto.response.CommonResponse;
import com.emil.demo.entity.Songs;
import com.emil.demo.service.SongsService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(ApiUrl.SONGS)
@AllArgsConstructor
public class SongsController {
    private final SongsService songsService;

    @GetMapping
    public ResponseEntity<CommonResponse<List<Songs>>> getAllSongs() {
        List<Songs> all = songsService.getAll();

        CommonResponse<List<Songs>> build = CommonResponse.<List<Songs>>builder()
                .status("success")
                .message("Successfully retrieved songs")
                .data(all).build();

        return ResponseEntity.ok(build);
    }

    @GetMapping(path = "/{slug}")
    public ResponseEntity<CommonResponse<?>> getSong(@PathVariable String slug) {
        Optional<Songs> bySlug = songsService.getBySlug(slug);

        CommonResponse<Object> build = CommonResponse.builder()
                .status("success")
                .message("Song retrieved successfully")
                .data(bySlug).build();

        return ResponseEntity.ok(build);
    }

    @PostMapping
    public  ResponseEntity<Songs> create(@Valid @RequestBody Songs songs) {
        Songs createdSong = songsService.create(songs);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSong);
    }
}
