package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Mentor mentor1 = new Mentor("Piotr Kowalski");
        Mentor mentor2 = new Mentor("Robert Szczurek");

        TaskQueue bratPitt = new TaskQueue("Brat Pitt");
        TaskQueue robertLewandowski = new TaskQueue("Robert Lewandowski");
        TaskQueue blakeGriffin = new TaskQueue("Blake Griffin");
        TaskQueue nikolaJokic = new TaskQueue("Nikola Jokić");
        TaskQueue walterWhite = new TaskQueue("Walter White");

        bratPitt.registerObserver(mentor1);
        robertLewandowski.registerObserver(mentor2);
        blakeGriffin.registerObserver(mentor1);
        nikolaJokic.registerObserver(mentor2);
        walterWhite.registerObserver(mentor1);

        //When
        bratPitt.sendTaskToCheck("Task 1.0");
        bratPitt.sendTaskToCheck("Task 2.1");
        bratPitt.sendTaskToCheck("Task 4.3");
        robertLewandowski.sendTaskToCheck("Task 10.1");
        robertLewandowski.sendTaskToCheck("Task 10.2");
        robertLewandowski.sendTaskToCheck("Task 10.3");
        blakeGriffin.sendTaskToCheck("Task 1.1");
        blakeGriffin.sendTaskToCheck("Task 1.2");
        nikolaJokic.sendTaskToCheck("Task 11.0");
        nikolaJokic.sendTaskToCheck("Task 11.6");
        walterWhite.sendTaskToCheck("Task 21.1");

        //Then
        assertEquals(7, mentor1.getUpdateCounter());
        assertEquals(4, mentor2.getUpdateCounter());
    }
}