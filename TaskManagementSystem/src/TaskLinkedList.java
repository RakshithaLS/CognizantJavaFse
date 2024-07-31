public class TaskLinkedList {
    private Node head;

    public TaskLinkedList() {
        head = null;
    }

    // Method to add a task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to search for a task by ID
    public Task searchTask(String taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getTaskId().equals(taskId)) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    // Method to traverse and print all tasks
    public void traverseTasks() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    // Method to delete a task by ID
    public void deleteTask(String taskId) {
        if (head == null) {
            return;
        }

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.task.getTaskId().equals(taskId)) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
}
