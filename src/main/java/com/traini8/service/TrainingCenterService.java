package com.traini8.service;

import com.traini8.dto.TrainingCenterRequestDTO;
import com.traini8.dto.TrainingCenterResponseDTO;
import com.traini8.model.TrainingCenter;
import com.traini8.repository.TrainingCenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TrainingCenterService {
  private final TrainingCenterRepository repository;

  public TrainingCenterResponseDTO createTrainingCenter(TrainingCenterRequestDTO dto) {
    TrainingCenter trainingCenter = new TrainingCenter();
    trainingCenter.setCenterName(dto.getCenterName());
    trainingCenter.setCenterCode(dto.getCenterCode());
    trainingCenter.setAddress(dto.getAddress());
    trainingCenter.setStudentCapacity(dto.getStudentCapacity());
    trainingCenter.setCoursesOffered(dto.getCoursesOffered());
    trainingCenter.setContactEmail(dto.getContactEmail());
    trainingCenter.setContactPhone(dto.getContactPhone());

    TrainingCenter saved = repository.save(trainingCenter);

    return mapToResponseDTO(saved);
  }

  public List<TrainingCenterResponseDTO> getAllTrainingCenters() {
    return repository.findAll().stream()
        .map(this::mapToResponseDTO)
        .collect(Collectors.toList());
  }

  private TrainingCenterResponseDTO mapToResponseDTO(TrainingCenter trainingCenter) {
    return new TrainingCenterResponseDTO(
        trainingCenter.getCenterName(),
        trainingCenter.getCenterCode(),
        trainingCenter.getAddress(),
        trainingCenter.getStudentCapacity(),
        trainingCenter.getCoursesOffered(),
        trainingCenter.getContactEmail(),
        trainingCenter.getContactPhone(),
        trainingCenter.getCreatedOn());
  }
}
