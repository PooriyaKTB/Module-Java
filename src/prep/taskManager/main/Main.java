package src.prep.taskManager.main;

import src.prep.taskManager.management.TaskManager;
import src.prep.taskManager.tasks.PrioritisedTask;
import src.prep.taskManager.tasks.ScheduledTask;
import src.prep.taskManager.tasks.Task;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----------------*** First manager instance ***-----------------");

        TaskManager manager = new TaskManager(5);
        manager.createTask(new PrioritisedTask("task 1", "Sprint 1-prep", "Urgent"));
        manager.createTask(new ScheduledTask("task 2", "Sprint 1-backlog", "By end of week"));
        manager.createTask(new Task("task 3", "Open PR"));
        manager.createTask(new PrioritisedTask("task 4", "Sprint 2-prep", "Urgent"));
        manager.createTask(new ScheduledTask("task 5", "Sprint 2-backlog", "By end of week"));
        manager.createTask(new Task("task 6", "Open PR"));
        manager.createTask(new Task("task 7", "Review PR"));

        System.out.println("---------------------------------------");

        manager.markTaskCompleteById(0);
        manager.markTaskCompleteById(1);
//        manager.markTaskCompleteById(2);

        System.out.println("------------** COMPLETED **------------");
        manager.getTasksByStatus(true);
        System.out.println("------------** INCOMPLETE **------------");
        manager.getTasksByStatus(false);

        System.out.println("---------------------------------------");

        manager.getCompletedTasks();
        System.out.println("COMPLETED ONLY:");
        manager.printOnlyCompletedTasks();

        System.out.println("-----------------*** Second manager instance ***-----------------");

        TaskManager manager2 = new TaskManager(10);
        manager2.createTask(new PrioritisedTask("task 1", "Sprint 2-prep", "Urgent"));
        manager2.createTask(new ScheduledTask("task 2", "Sprint 2-backlog", "By end of week"));
        manager2.createTask(new Task("task 2", "Open PR"));
        manager2.createTask(new Task("task 2", "Open PR"));

        manager2.markTaskCompleteById(1);
        manager2.markTaskCompleteById(2);
        manager2.markTaskCompleteById(8);

        System.out.println("------------** COMPLETED-2 **------------");
        manager2.getTasksByStatus(true);
        System.out.println("------------** INCOMPLETE-2 **------------");
        manager2.getTasksByStatus(false);
    }
}


// Where did polymorphism remove the need for conditional logic?
// In the "TaskManager". When looping on the "tasksArray" to print tasks or complete them there is no need to write if/else statements to check if a task was a "ScheduledTask" or "PrioritisedTask". Java automatically calls the correct overridden toString() or getTaskType() method based on the object's actual type.

// Which responsibilities are shared across all tasks, and which are specific?
// Shared: Every task needs an ID, name, description, completion status and the logic to mark it as complete which handled in the Task superclass.
// Specific: Subclasses only handle their own unique state. "ScheduledTask" only manages the "deadline" and "PrioritisedTask" only manages the "priority" level.

// Where did encapsulation prevent misuse of an object?
// Encapsulation prevented other classes from modifying a task's internal state directly. Like by making "isCompleted" private other classes must call the completeTask() method instead of changing the variable directly. It prevents a completed task accidentally being change back to "false" and breaking the state. Also, making "taskId" private and final ensures the ID can never be overwritten.

// If a new task type were added, how much existing code would need to change?
// Almost none! We would only need to create the new subclass. The "Task" superclass and the "TaskManager" wouldn't need a single line of code changed, because the manager is designed to work with any "Task" object. The new subclass could override methods such as "getTaskType" or "toString" and automatically work with the existing "TaskManager".