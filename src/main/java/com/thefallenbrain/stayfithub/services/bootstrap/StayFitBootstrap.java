package com.thefallenbrain.stayfithub.services.bootstrap;

import com.thefallenbrain.stayfithub.services.domain.*;
import com.thefallenbrain.stayfithub.services.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class StayFitBootstrap implements ApplicationListener<ContextRefreshedEvent>{


    @Autowired
    private WorkoutRepository workoutRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Autowired
    private GoalRepository goalRepository;

    @Autowired
    private FitnessCenterRepository fitnessCenterRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Goal weightLoss = new Goal();
        weightLoss.setGoalType("Weight Loss");

        Goal weightGain = new Goal();
        weightGain.setGoalType("Weight Gain");

        Goal maintenance = new Goal();
        maintenance.setGoalType("Stay Healthy");

        goalRepository.save(weightGain);
        goalRepository.save(weightLoss);
        goalRepository.save(maintenance);

        FitnessCenter frazerTown = new FitnessCenter();
        frazerTown.setName("Frazer Town");
        frazerTown.setAddress("243, Frazer Town, Outer Ring Road.");
        frazerTown.setLocation("Bangalore");
        fitnessCenterRepository.save(frazerTown);

        FitnessCenter indranagar = new FitnessCenter();
        indranagar.setName("Indranagar");
        indranagar.setAddress("100 Feet Road, Indranaga");
        indranagar.setLocation("Bangalore");
        fitnessCenterRepository.save(indranagar);

        HeadTrainer guru = new HeadTrainer();
        guru.setName("Guru");
        guru.setDob(new Date());
        guru.setFitnessCenter(frazerTown);
        userRepository.save(guru);

        Trainer alan = new Trainer();
        alan.setName("Alan");
        alan.setDob(new Date());
        alan.setDoj(new Date());
        alan.setFitnessCenter(frazerTown);
        alan.setHeadTrainer(guru);

        userRepository.save(alan);

        Trainer rahul = new Trainer();
        rahul.setName("Rahul");
        rahul.setDob(new Date());
        rahul.setDoj(new Date());
        rahul.setFitnessCenter(frazerTown);
        rahul.setHeadTrainer(guru);
        userRepository.save(rahul);

        Member arjun = new Member();
        arjun.setName("Arjun");
        arjun.setDob(new Date());
        arjun.setGoal(weightGain);
        arjun.setFitnessCenter(frazerTown);
        arjun.setTrainer(alan);

        Member ved = new Member();
        ved.setName("Ved");
        ved.setDob(new Date());
        ved.setGoal(weightLoss);
        ved.setFitnessCenter(frazerTown);
        ved.setTrainer(alan);

        userRepository.save(ved);
        userRepository.save(arjun);

        Exercise exercise = new Exercise();
        exercise.setName("Biceps Curl");
        exercise.setCaloriesBurn(22);

        exerciseRepository.save(exercise);

        Workout workout = new Workout();
        workout.setAssignedByUser(ved);
        workout.setAssignedForUser(arjun);
        List<Exercise> exerciseList = new ArrayList<>();
        exerciseList.add(exercise);
        workout.setExercises(exerciseList);
        workoutRepository.save(workout);
    }
}
