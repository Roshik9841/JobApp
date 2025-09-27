package com.roshik.JobApp;


import com.roshik.JobApp.model.JobPost;
import com.roshik.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService service;

    @RequestMapping({"/home","/"})
        public String home(){
        return "home";
    }

    @GetMapping("/addjob")  //get mapping for getting values
        public String addjob(){
        return "addjob";
    }


    @GetMapping("/viewalljobs")

        public String viewalljob(Model m){

        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost, Model model) {
        model.addAttribute("jobPost", jobPost);
        service.addJob(jobPost);
        return "success"; // must match your Thymeleaf template name
    }


}
