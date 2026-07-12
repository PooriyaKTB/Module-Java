package src.prep.taskManager.management;

import src.prep.taskManager.tasks.Task;

import java.util.Arrays;

/**
 * Manages a collection of {@link Task} objects using a fixed-size array.
 * Provides functionality to add new tasks, complete them by their unique ID,
 * and retrieve tasks based on their completion status.
 */
public class TaskManager {

    private final Task[] tasksArray;
    private int taskCount;

    /**
     * Initializes the TaskManager with a specific capacity.
     *
     * @param managerCapacity The maximum number of tasks this manager can hold.
     */
    public TaskManager(int managerCapacity) {
        this.tasksArray = new Task[managerCapacity];
        taskCount = 0;
    }

    /**
     * Adds a new task to the manager.
     * Prints an error message to the console if the manager is at full capacity.
     *
     * @param task The Task object (or subclass) to be added.
     */
    public void createTask(Task task) {
        if (taskCount < tasksArray.length) {
            tasksArray[taskCount] = task;
            taskCount++;
        } else {
            System.out.println("Task manager is full");
        }
    }

    /**
     * Searches for a task by its unique ID and marks it as completed.
     *
     * @param id The unique integer ID of the task to complete.
     */
    public void markTaskCompleteById(int id) {
        boolean found = false;
        for (int i = 0; i < taskCount; i++) {
            if (tasksArray[i].getTaskId() == id) {
                tasksArray[i].completeTask();
                return;
            }
        }
        if (!found) System.out.printf("No task with ID %d was found.\n", id);
    }


    /**
     * Filters and prints tasks directly to the console based on their completion status.
     * Note: This was the initial approach for filtering tasks by status.
     *
     * @param completed true to print completed tasks, false to print incomplete tasks.
     */
    public void getTasksByStatus(boolean completed) {
        boolean found = false;

        System.out.println(completed ? "** Completed tasks: **" : "** Incomplete tasks: **");

        for (int i = 0; i < taskCount; i++) {
            if (tasksArray[i].getIsCompleted() == completed) {
                System.out.println(tasksArray[i].toString());
                found = true;
            }
        }
        if (!found) System.out.println(completed ? "No completed tasks." : "No incomplete tasks.");
    }

    /**
     * Retrieves an array containing only the tasks that have been marked as completed.
     * This fulfills the specific exercise requirement to return tasks by status.
     *
     * @return A dynamically sized array containing only the completed tasks.
     */
    public Task[] getCompletedTasks() {
        Task[] completedTasks = new Task[taskCount];
        int count = 0;

        for (int i = 0; i < taskCount; i++) {
            if (tasksArray[i].getIsCompleted()) {
                completedTasks[count] = tasksArray[i];
                count++;
            }
        }
        return Arrays.copyOf(completedTasks, count);
    }

    /**
     * A helper method used primarily for testing output.
     * It fetches the array of completed tasks and prints them one by one to the console.
     */
    public void printOnlyCompletedTasks() {
        Task[] completedTasks = getCompletedTasks();
        for (Task task : completedTasks) {
            System.out.println(task);
        }
    }
}
