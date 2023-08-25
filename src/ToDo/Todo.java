package ToDo;

public class Todo {

    // Plain old pojo
    // Popojo
    private int id;
    private String title;
    private String description;
    private String dueDate;
    private boolean isDone;
    private int priority;

    public Todo(int id, String title, String description, String dueDate, boolean isDone, int priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isDone = isDone;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "\n" +
                "Id: " + id + "\n" +
                "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "Due Date: " + dueDate + "\n" +
                "Is Done: " + isDone + "\n" +
                "Priority: " + priority + "\n";
    }
}
