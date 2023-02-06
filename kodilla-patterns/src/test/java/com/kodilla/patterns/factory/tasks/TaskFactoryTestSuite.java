package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);

        //Then
        assertEquals("ShoppingTask", shoppingTask.getTaskName());
        assertEquals("Buy a car", shoppingTask.executeTask());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);

        //Then
        assertEquals("PaintingTask", paintingTask.getTaskName());
        assertEquals("Black", paintingTask.executeTask());
        assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);

        //Then
        assertEquals("DrivingTask", drivingTask.getTaskName());
        assertEquals("Warsaw", drivingTask.executeTask());
        assertEquals(true, drivingTask.isTaskExecuted());
    }
}
