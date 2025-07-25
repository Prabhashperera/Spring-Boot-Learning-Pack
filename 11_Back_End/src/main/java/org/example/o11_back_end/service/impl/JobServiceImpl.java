package org.example.o11_back_end.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.o11_back_end.dto.JobDTO;
import org.example.o11_back_end.entity.JobEntity;
import org.example.o11_back_end.exeption.DataAlreadyExistsException;
import org.example.o11_back_end.exeption.ResourceNotFoundException;
import org.example.o11_back_end.repo.JobRepo;
import org.example.o11_back_end.service.JobService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {

    private final JobRepo jobRepo;
    private final ModelMapper modelMapper;

    @Override
    public void saveJob(JobDTO jobDTO) {
        if(jobDTO.getId() != null && jobRepo.existsById(jobDTO.getId())) {
            System.out.println("awaaa");
            throw new DataAlreadyExistsException(jobDTO.getJobTitle() + " already exists");
        }
        System.out.println("eliye");
        jobRepo.save(modelMapper.map(jobDTO, JobEntity.class));
    }

    @Override
    public void updateJob(JobDTO jobDTO) {
        if (!jobRepo.existsById(jobDTO.getId())) {
            throw new ResourceNotFoundException(jobDTO.getJobTitle() + " not found");
        }
        jobRepo.save(modelMapper.map(jobDTO, JobEntity.class));
    }

    @Override
    public List<JobDTO> getAllJobs(int offset) {
        List<JobEntity> allJobs = jobRepo.loadJobData(offset);
        return modelMapper.map(allJobs, new TypeToken<List<JobDTO>>() {}.getType());
    }

    @Override
    public void changeJobStatus(String id) {
        jobRepo.changeJobStatus(id);
    }

}
