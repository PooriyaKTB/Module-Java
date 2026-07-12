package src.prep.taskManager.tasks;

/**
 * Represents a generic task in the task management system.
 * This is the base class for all specific task types.
 */
public class Task {

    private final String taskName;
    private final String taskDescription;
    private final int taskId;
    private boolean isCompleted = false;
    private static int taskCount = 0;

    /**
     * Constructs a new Task with a generated unique ID.
     * @param name        The human-readable name of the task.
     * @param description A brief explanation of the task details.
     */
    public Task(String name, String description) {
        this.taskName = name;
        this.taskDescription = description;
        this.taskId = ++taskCount;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public final int getTaskId() {
        return taskId;
    }

    /**
     * Retrieves the current completion status as a human-readable string.
     * @return "Completed" if the task is done, otherwise "Incomplete".
     */
    public String getTaskStatus() {
        return isCompleted ? "Completed" : "Incomplete";
    }

    public String getTaskType() {
        return "Normal Task";
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    /**
     * Marks the task as completed.
     * If the task is already completed, it prevents double-completion and notifies the user.
     */
    public final void completeTask() {
        if (!isCompleted) {
            isCompleted = true;
            System.out.printf("Task \"%s\" has been marked as Completed!\n", taskName);
        } else {
            System.out.printf("Task \"%s\" is already marked as Completed!\n", taskName);
        }
    }

    /**
     * Returns a formatted string summary of the task's state.
     * @return A multi-line string containing the task ID, name, description, type, and status.
     */
    @Override
    public String toString() {
        return String.format("---* Task ID %d *---\nName: %s\nDescription: %s\nType: %s\nStatus: %s\n", taskId, taskName, taskDescription, getTaskType(), getTaskStatus());
    }
}
