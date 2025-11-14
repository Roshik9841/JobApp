package com.roshik.JobApp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //before chahi method call hunu aagadi call hunxa
    //return type, class name-method name(arguments)
    @Before("execution(* com.roshik.JobApp.service.JobService.getJob(..)) || execution(* com.roshik.JobApp.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint jp){

        LOGGER.info("Method Called"+ jp.getSignature().getName());
    }


    //yo chahi method call bhaye call hunxa yesma error aayeni naayeni call hunxa yo
    @After("execution(* com.roshik.JobApp.service.JobService.getJob(..)) || execution(* com.roshik.JobApp.service.JobService.updateJob(..))")
    public void logMethodExecuted(JoinPoint jp){

        LOGGER.info("Method Executed"+ jp.getSignature().getName());
    }

    //yo error aayo bhane call hunxa
    @AfterThrowing("execution(* com.roshik.JobApp.service.JobService.getJob(..)) || execution(* com.roshik.JobApp.service.JobService.updateJob(..))")
    public void logMethodCrash(JoinPoint jp){

        LOGGER.info("Method has some issue"+ jp.getSignature().getName());
    }
    //yo method execute bhayesi mtra call hunxa
    @AfterReturning("execution(* com.roshik.JobApp.service.JobService.getJob(..)) || execution(* com.roshik.JobApp.service.JobService.updateJob(..))")
    public void logMethodExecutedSuccess(JoinPoint jp){

        LOGGER.info("Method executed succesfully"+ jp.getSignature().getName());
    }
}
