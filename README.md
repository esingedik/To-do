### Problem description

Build a simple To-do List with the following features:

- Add a task
- Mark a task as completed
- Print task list

## Acceptance criteria

Task list should show tasks in this format:

```
Task            | Completed
Buy milk        |
Feed the dog    |   x
Boil eggs       |
```

## Starting point and constraints

Start with a class with the following interface:

```java
interface TaskListInterface {
     void addTask(String description);
     void completeTask(TaskId id);
     void showTasks();
}
```
