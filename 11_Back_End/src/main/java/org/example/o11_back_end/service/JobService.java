package org.example.o11_back_end.service;

import org.example.o11_back_end.dto.JobDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.beans.JavaBean;
import java.util.List;

@Service
public interface JobService {
     void saveJob(JobDTO jobDTO);
     void updateJob(JobDTO jobDTO);
     List<JobDTO> getAllJobs(int offset);
     void changeJobStatus(String id);
}
