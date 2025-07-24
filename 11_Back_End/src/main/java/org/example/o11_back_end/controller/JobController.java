package org.example.o11_back_end.controller;

import lombok.RequiredArgsConstructor;
import org.example.o11_back_end.dto.JobDTO;
import org.example.o11_back_end.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/job")
@RequiredArgsConstructor //contructor through injection automatically from lombok
@CrossOrigin
public class JobController {
    private final JobService jobService;

    @PostMapping("create")
    public void createJob(@RequestBody JobDTO jobDTO) {
        jobService.saveJob(jobDTO);
    }

    @PutMapping("update")
    public void updateJob(@RequestBody JobDTO jobDTO) {
        jobService.updateJob(jobDTO);
    }

    @GetMapping("getAll")
    public List<JobDTO> getAllJobs(@RequestParam(name = "offset", defaultValue = "0") int offset) {
        return jobService.getAllJobs(offset);
    }

    @PatchMapping("status/{id}")
    public void changeStatus(@PathVariable String id) {
        jobService.changeJobStatus(id);
    }


}
