package com.roshik.JobApp.repo;

import com.roshik.JobApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {        //CLASS ra primaryKey


}



//private List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//        new JobPost(1, "Roshik", "siaiosdhisa", 2, Arrays.asList("Java", "Python")),
//        new JobPost(2, "Rik", "siisa", 1, Arrays.asList("JavaScript", "React")),
//        new JobPost(3, "Rosk", "siadhisa", 3, Arrays.asList("Java", "Django"))
//));
//public List<JobPost> getAllJobs(){
//    return jobs;
//}
//
//public void addJob(JobPost job){
//    jobs.add(job);
//    System.out.println(jobs);
//}
//
//public JobPost getJob(int postId) {
//    for(JobPost job:jobs){
//        if(job.getPostId()==postId){
//            return job;
//        }
//    }
//    return null;
//
//}
//
//public void updateJob(JobPost jobPost) {
//    for(JobPost jobPost1:jobs){
//        if(jobPost1.getPostId()==jobPost.getPostId()){
//            jobPost1.setPostProfile(jobPost.getPostProfile());
//            jobPost1.setPostDesc(jobPost.getPostDesc());
//            jobPost1.setReqExperience(jobPost.getReqExperience());
//            jobPost1.setPostTechStack(jobPost1.getPostTechStack());
//        }
//    }
//}
//
//public void deleteJob(int postId) {
//    for(JobPost jobPost:jobs){
//        if(jobPost.getPostId()==postId){
//            jobs.remove(jobPost);
//        }
//    }
//}