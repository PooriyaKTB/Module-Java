package src.prep.taskManager.tasks;

/**
 * Represents a task that has a specific deadline attached to it.
 * Extends the base {@link Task} class.
 */
public class ScheduledTask extends Task {

    private final String taskDeadline;

    /**
     * Constructs a new ScheduledTask.
     * @param name        The name of the task.
     * @param description A brief description of the task.
     * @param deadline    The time or date by which the task must be finished.
     */
    public ScheduledTask(String name, String description, String deadline) {
        super(name, description);
        this.taskDeadline = deadline;
    }

    /**
     * Overrides the base type to identify this as a Scheduled task.
     * @return "Scheduled task"
     */
    @Override
    public String getTaskType() {
        return "Scheduled task";
    }

    /**
     * Returns a formatted string summary including the specific deadline field.
     * @return A string containing task details and its deadline.
     */
    @Override
    public String toString() {
        return String.format("---* Task ID %d *---\nName: %s\nDescription: %s\nDeadline: %s\nType: %s\nStatus: %s\n", getTaskId(), getTaskName(), getTaskDescription(), taskDeadline, getTaskType(), getTaskStatus());
    }
}
