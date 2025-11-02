package com.roshik.JobApp.service;

import com.roshik.JobApp.model.JobPost;
import com.roshik.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {


    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.save(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    public JobPost getJob(int postId){
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {

        repo.deleteById(postId);
    }

    public void load() {
         List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Roshik", "siaiosdhisa", 2, Arrays.asList("Java", "Python")),
                new JobPost(2, "Rik", "siisa", 1, Arrays.asList("JavaScript", "React")),
                new JobPost(3, "Rosk", "siadhisa", 3, Arrays.asList("Java", "Django"))
        ));

         repo.saveAll(jobs);
    }
}
