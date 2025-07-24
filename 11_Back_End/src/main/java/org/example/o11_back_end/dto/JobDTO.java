package org.example.o11_back_end.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class JobDTO {
    private Integer id;
    private String jobTitle;
    private String company;
    private String location;
    private String type;
    private String jobDescription;
    private String status;
}
