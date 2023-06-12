package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskLists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListsDaoTestSuite {

    @Autowired
    private TaskListDao taskListsDao;
    private static final String LAST_NAME = "Smith";
    private static final String DESCRIPTION = "Example description";

    @Test
    void testFindByListName() {
        //Given
        TaskLists taskLists = new TaskLists(LAST_NAME, DESCRIPTION);

        //When
        taskListsDao.save(taskLists);
        List<TaskLists> readTaskLists = taskListsDao.findByListName(LAST_NAME);

        //Then
        assertEquals(1, readTaskLists.size());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListsDao.deleteById(id);
    }
}
