package ToDo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {

    private static boolean active = true;
    private static List<Todo> todos = new ArrayList<Todo>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to your todo list!");
        while(active){
            System.out.println("---------------------------");
            System.out.println("What would you like to do?");
            System.out.println("1. Add a todo");
            System.out.println("2. Remove a todo");
            System.out.println("3. Update a todo");
            System.out.println("4. Complete a todo");
            System.out.println("5. List all todos");
            System.out.println("6. Exit");
            String input = scanner.nextLine();
            switch(input){
                case "1":
                    addTodo();
                    break;
                case "2":
                    removeTodo();
                    break;
                case "3":
                    updateTodo();
                    break;
                case "4":
                    finishTodo();
                    break;
                case "5":
                    listTodos();
                    break;
                case "6":
                    active = false;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        System.out.println("Goodbye!");
    }

    private static void addTodo(){
        System.out.println("What is the title of your todo?");
        String title = scanner.nextLine();
        System.out.println("What is the description of your todo?");
        String description = scanner.nextLine();
        System.out.println("What is the due date of your todo?");
        String dueDate = scanner.nextLine();
        System.out.println("What is the priority of your todo?");
        int priority = scanner.nextInt();
        scanner.nextLine();
        Todo todo = new Todo(
                todos.size(),
                title,
                description,
                dueDate,
                false,
                priority
        );
        todos.add(todo);
        System.out.println("Todo " + title + " added!");
    }

    private static void removeTodo(){
        System.out.println("Which todo would you like to remove?");
        while(true){
            listTodos();
            System.out.println("Todo Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            if(id < 0 || id > todos.size() || todos.get(id) == null){
                System.out.println("Invalid id");
            }
            else {
                todos.remove(id);
                break;
            }
        }
    }

    private static void finishTodo(){
    System.out.println("Which todo would you liked moved to finished?");
        while(true){
            listTodos();
            System.out.println("Todo Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            if(id < 0 || id > todos.size() || todos.get(id) == null){
                System.out.println("Invalid id");
            }
            else {
                todos.get(id).setDone(true);
                break;
            }
        }
    }

    private static void updateTodo(){
        System.out.println("Which todo would you like to update?");
        while(true){
            listTodos();
            System.out.println("Todo Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            if(id < 0 || id > todos.size() || todos.get(id) == null){
                System.out.println("Invalid id");
            }
            else {
                System.out.println("What would you like to update?");
                System.out.println("1. Title");
                System.out.println("2. Description");
                System.out.println("3. Due Date");
                System.out.println("4. Completed");
                String input = scanner.nextLine();
                switch(input){
                    case "1":
                        System.out.println("What is the new title?");
                        String title = scanner.nextLine();
                        todos.get(id).setTitle(title);
                        break;
                    case "2":
                        System.out.println("What is the new description?");
                        String description = scanner.nextLine();
                        todos.get(id).setDescription(description);
                        break;
                    case "3":
                        System.out.println("What is the new due date?");
                        String dueDate = scanner.nextLine();
                        todos.get(id).setDueDate(dueDate);
                        break;
                    case "4":
                        System.out.println("Is the todo completed?");
                        boolean isDone = scanner.nextBoolean();
                        todos.get(id).setDone(isDone);
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                break;
            }
        }
    }

    private static void listTodos(){
        for(Todo todo : todos){
            System.out.println(todo.toString());
        }
    }
}
