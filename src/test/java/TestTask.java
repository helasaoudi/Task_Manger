import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import Classes.Task;

public class TestTask {
    
    private Task task;

    @Before
    public void setUp() {
        task = new Task(1, "Task 1", new Date(), 25.50);
    }

    @Test
    public void testGetId() {
        assertEquals("L'ID de la tâche doit être 1", 1, task.getId());
    }


    @Test
    public void testGetLibelle() {
        assertEquals("Task 1", task.getLibelle(), "Le libellé de la tâche doit être 'Task 1'");
    }

    
}
