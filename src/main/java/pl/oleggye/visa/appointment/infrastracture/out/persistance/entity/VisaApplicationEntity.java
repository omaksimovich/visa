package pl.oleggye.visa.appointment.infrastracture.out.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.oleggye.visa.appointment.domain.model.ApplicationStatus;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
@Table(name = "visa_application", indexes = {@Index(columnList = "applicationStatus")})
public class VisaApplicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String applicantName;
    private LocalDateTime requestedDateTime;
    private String timeslot;

    @Column(name = "application_status")
    @Enumerated(EnumType.STRING)
    private ApplicationStatus applicationStatus;
}
