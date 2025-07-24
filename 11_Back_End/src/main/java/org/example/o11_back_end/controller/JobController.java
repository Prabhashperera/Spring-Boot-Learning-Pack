package org.example.o11_back_end.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.o11_back_end.dto.JobDTO;
import org.example.o11_back_end.service.JobService;
import org.example.o11_back_end.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/v1/job")
@RequiredArgsConstructor //contructor through injection automatically from lombok
@CrossOrigin
@Slf4j
public class JobController {
    private final JobService jobService;

    @PostMapping("create")
    public ResponseEntity<ApiResponse> createJob(@Valid @RequestBody JobDTO jobDTO) {
        log.info("Creating job: " + jobDTO);
            jobService.saveJob(jobDTO);
            return ResponseEntity.ok(
                    new ApiResponse(
                            200,
                            "Success",
                            "Job created"
                    )
            );
    }

    @PutMapping("update")
    public ResponseEntity<ApiResponse> updateJob(@Valid @RequestBody JobDTO jobDTO) {
        jobService.updateJob(jobDTO);
        return new ResponseEntity(new ApiResponse(200, "Success", "Updated"), HttpStatus.OK);
    }

    @GetMapping("getAll")
    public ResponseEntity<ApiResponse> getAllJobs(@RequestParam(name = "offset", defaultValue = "0") int offset) {
        List<JobDTO> jobList = jobService.getAllJobs(offset);
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "Success",
                        jobList
                )
        );
    }

    @PatchMapping("status/{id}")
    public void changeStatus(@PathVariable String id) {
        jobService.changeJobStatus(id);
    }


}
