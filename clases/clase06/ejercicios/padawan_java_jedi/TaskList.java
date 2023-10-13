package ejercicios.padawan_java_jedi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskList {
    List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskList instancia = new TaskList();

        boolean runAgain;
        do {
            instancia.showMenu();
            runAgain = instancia.executeOption(input);
        } while (runAgain);

        input.close();
    }

    public void showMenu() {
        String menu = "[----------Aplicacion de Tareas----------]\n";
        // menu += ">> Pending tasks:\n";
        // menu += this.printTasks();
        menu += this.printOptions();
        System.out.println(menu);
    }

    private String printTasks() {
        if (this.tasks.isEmpty()) {
            return "No pending tasks...\n\n";
        }

        StringBuilder tasks = new StringBuilder();
        for (Task t : this.tasks) {
            tasks.append(String.format("-[%d] %s\n\t%s\n\texpiration date: %s.\n", t.id, t.title, t.description,
                    t.expirationDate));
        }
        tasks.append("\n");
        return tasks.toString();
    }

    private String printOptions() {
        String options = ">> Options:\n";
        options += "1. List tasks.\n2. Add task.\n3. Remove task.\n0. Exit.\n";
        return options;
    }

    public boolean executeOption(Scanner input) {
        System.out.print("(enter option number) >> ");
        String option = input.nextLine();

        boolean runAgain = Boolean.TRUE;
        switch (option) {
            case "1":
                System.out.println(this.printTasks());
                break;
            case "2":
                this.addTask(input);
                break;
            case "3":
                this.removeTask(input);
                break;
            case "0":
                runAgain = Boolean.FALSE;
                break;
            default:
                System.out.println("Invalid option.\n");
                executeOption(input);
                break;
        }
        return runAgain;
    }

    private void addTask(Scanner input) {
        System.out.print("Title >> ");
        String title = input.nextLine();
        System.out.print("Description >> ");
        String description = input.nextLine();
        LocalDate expirationDate = LocalDate.now().plus(1, ChronoUnit.DAYS);
        // task
        int idTask = this.tasks.size();
        Task t = new Task(title, description, expirationDate, idTask);
        this.tasks.add(t);
    }

    private void removeTask(Scanner input) {
        System.out.print("Enter task id number >> ");
        int taskId = Integer.parseInt(input.nextLine());
        this.tasks.removeIf(task -> task.id == taskId);
    }
}

class Task {
    protected String title;
    protected String description;
    protected LocalDate expirationDate;
    protected int id = -1;

    public Task() {
    }

    public Task(String title, String description, LocalDate expirationDate, int id) {
        this.title = title;
        this.description = description;
        this.expirationDate = expirationDate;
        this.id = id;
    }

    public void setTitle(String title) {
        if (this.title == null) {
            this.title = title;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescription(String description) {
        if (this.description == null) {
            this.description = description;
        }
    }

    public String getDescription() {
        return this.description;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        if (this.expirationDate == null) {
            this.expirationDate = expirationDate;

        }
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public void setId(int id) {
        if (this.id == -1) {
            this.id = id;
        }
    }

    public int getId() {
        return this.id;
    }
}