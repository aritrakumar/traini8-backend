package com.traini8.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TrainingCenter {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Size(max = 40)
  private String centerName;

  @NotBlank
  @Size(min = 12, max = 12)
  @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "CenterCode must be exactly 12 alphanumeric characters")
  private String centerCode;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "address_id", referencedColumnName = "id")
  private Address address;

  private Integer studentCapacity;

  @ElementCollection
  private List<String> coursesOffered;

  private Instant createdOn;

  @Email
  private String contactEmail;

  @NotBlank
  @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
  private String contactPhone;

  @PrePersist
  protected void onCreate() {
    createdOn = Instant.now();
  }
}
