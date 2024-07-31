public class TaskManagementSystemTest {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Add tasks
        taskList.addTask(new Task("T001", "Design UI", "In Progress"));
        taskList.addTask(new Task("T002", "Develop Backend", "Not Started"));
        taskList.addTask(new Task("T003", "Test Application", "Not Started"));

        // Traverse tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Search for a task
        System.out.println("\nSearching for Task with ID T002:");
        Task task = taskList.searchTask("T002");
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task
        System.out.println("\nDeleting Task with ID T001:");
        taskList.deleteTask("T001");

        // Traverse tasks after deletion
        System.out.println("All Tasks after deletion:");
        taskList.traverseTasks();
    }
}
