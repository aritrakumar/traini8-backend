package com.traini8.controller;

import com.traini8.dto.TrainingCenterRequestDTO;
import com.traini8.dto.TrainingCenterResponseDTO;
import com.traini8.service.TrainingCenterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
@RequiredArgsConstructor
public class TrainingCenterController {
  private final TrainingCenterService service;

  @PostMapping
  public ResponseEntity<TrainingCenterResponseDTO> create(@Valid @RequestBody TrainingCenterRequestDTO dto) {
    return ResponseEntity.ok(service.createTrainingCenter(dto));
  }

  @GetMapping
  public ResponseEntity<List<TrainingCenterResponseDTO>> getAll() {
    return ResponseEntity.ok(service.getAllTrainingCenters());
  }
}
