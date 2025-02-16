package com.traini8.dto;

import com.traini8.model.Address;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainingCenterRequestDTO {
  @NotBlank
  @Size(max = 40)
  private String centerName;

  @NotBlank
  @Size(min = 12, max = 12)
  @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "CenterCode must be exactly 12 alphanumeric characters")
  private String centerCode;

  @NotNull
  private Address address;

  private Integer studentCapacity;

  private List<String> coursesOffered;

  @Email
  private String contactEmail;

  @NotBlank
  @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
  private String contactPhone;
}
