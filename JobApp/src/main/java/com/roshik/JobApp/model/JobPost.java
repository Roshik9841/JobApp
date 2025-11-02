package com.roshik.JobApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.*;

@Data  //getter setter haru garirakhnu pardiana kesaiko lagi
@NoArgsConstructor    //constructor banaidinxa class ko tara kunai parameter hudaina
@AllArgsConstructor   //consturctor banaidinxa tara sabai field hunxa yesma chahi
@Component
@Entity
public class JobPost {
    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;


}
