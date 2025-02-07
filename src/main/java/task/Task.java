package task;

public class Task {
    /** task name description */
    protected String description;
    /** indicate if task is done */
    protected boolean isDone;

    /**
     * Initialize task.Task object with task name and task is not done.
     *
     * @param description type String;
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return this.description;
    }

    /**
     * Return status icon of the task whether it is done or not.
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    /**
     * mark the task as done.
     */
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * mark the task as undone.
     */
    public void markAsUndone() {
        this.isDone = false;
    }

    @Override
    public String toString() {
        return ("[" + getStatusIcon() + "] " + this.description);
    }

    /**
     * Output String format to be written in file.
     * Format : task.Task description|isDone
     *
     * @return formatted String
     */
    public String isDoneFormatter() {
        String kk;
        if (this.isDone) {
            kk = "1";
        } else {
            kk = "0";
        }
        return this.description + "|" + kk;
    }
}
