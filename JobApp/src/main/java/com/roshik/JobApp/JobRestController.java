package com.roshik.JobApp;


import com.roshik.JobApp.model.JobPost;
import com.roshik.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class JobRestController {
    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    @ResponseBody         //for REST
    @CrossOrigin(origins = "http://localhost:3000")   //yo rakhyo bhane react le access garna milxa
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    @ResponseBody     //when you want to return data
    public JobPost getJob(@PathVariable("postId") int postId){  //PathVariable le chahi kun variable bata access garni bhaenra
        return service.getJob(postId);
    }

    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost jobPost){      //when you want to send data using requestBody
        service.addJob(jobPost);
    }
}


//@Autowired
//private JobService service;
//
//@RequestMapping({"/home","/"})
//public String home(){
//    return "home";
//}
//
//@GetMapping("/addjob")  //get mapping for getting values
//public String addjob(){
//    return "addjob";
//}
//
//
//@GetMapping("/viewalljobs")
//
//public String viewalljob(Model m){
//
//    List<JobPost> jobs = service.getAllJobs();
//    m.addAttribute("jobPosts",jobs);
//    return "viewalljobs";
//}
//
//@PostMapping("/handleForm")
//public String handleForm(JobPost jobPost, Model model) {
//    model.addAttribute("jobPost", jobPost);
//    service.addJob(jobPost);
//    return "success"; // must match your Thymeleaf template name
//}
//
