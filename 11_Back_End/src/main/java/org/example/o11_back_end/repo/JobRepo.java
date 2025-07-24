package org.example.o11_back_end.repo;

import jakarta.transaction.Transactional;
import org.example.o11_back_end.entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobEntity, Integer> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE Job_entity SET status = 'Deactivated' WHERE id = ?1", nativeQuery = true)
    void changeJobStatus(String id);

    @Transactional
    @Query(value = "SELECT * FROM job_entity LIMIT 10 OFFSET ?1" , nativeQuery = true)
    List<JobEntity> loadJobData(int offset);
}
