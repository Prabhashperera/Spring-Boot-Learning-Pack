package org.example.o11_back_end.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class JobDTO {
    private Integer id;
    @NotBlank(message = "Job Title not be null")
    private String jobTitle;
    @NotBlank(message = "Company null")
    private String company;
    @NotNull
    private String location;
    @NotNull
    private String type;
    @Size(min = 3, max = 255)
    private String jobDescription;
    @NotNull
    private String status;
}
