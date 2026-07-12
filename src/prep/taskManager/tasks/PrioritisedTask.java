package src.prep.taskManager.tasks;

/**
 * Represents a task with an assigned priority level.
 * Extends the base {@link Task} class.
 */
public class PrioritisedTask extends Task {

    private final String taskPriority;

    /**
     * Constructs a new PrioritisedTask.
     * @param name        The name of the task.
     * @param description A brief description of the task.
     * @param priority    The priority level (e.g., "High", "Urgent", "Low").
     */
    public PrioritisedTask(String name, String description, String priority) {
        super(name, description);
        this.taskPriority = priority;
    }

    /**
     * Overrides the base type to identify this as a Prioritised task.
     * @return "Prioritised task"
     */
    @Override
    public String getTaskType() {
        return "Prioritised task";
    }

    /**
     * Returns a formatted string summary including the specific priority field.
     * @return A string containing task details and its priority level.
     */
    @Override
    public String toString() {
        return String.format("---* Task ID %d *---\nName: %s\nDescription: %s\nPriority: %s\nType: %s\nStatus: %s\n", getTaskId(), getTaskName(), getTaskDescription(), taskPriority, getTaskType(), getTaskStatus());
    }
}
