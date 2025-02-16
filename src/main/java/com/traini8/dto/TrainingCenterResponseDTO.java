package com.traini8.dto;

import com.traini8.model.Address;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainingCenterResponseDTO {
  private String centerName;
  private String centerCode;
  private Address address;
  private Integer studentCapacity;
  private List<String> coursesOffered;
  private String contactEmail;
  private String contactPhone;
  private Instant createdOn;
}
