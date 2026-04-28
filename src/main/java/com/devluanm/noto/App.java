package com.devluanm.noto;

import com.devluanm.noto.model.Task;
import netscape.javascript.JSObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

  public static void main(String[] args) throws IOException {

    if (args.length == 0) {
      System.out.println("You must provide a command. Use the --help flag to see the available commands.");
      return;
    }

    switch (args[0]) {
      case "--help":
        System.out.println("""
          Available commands:
          - add <task_description>: to add a new task
          - delete <task_id>: to remove a task
          - update <task_id> <new_description>: to update a task content
          - list: to list all tasks
          - list done: to list all completed tasks
          - list todo: to list all tasks that are not completed
          - list in-progress: to list all tasks that are in progress
          - clear: to clear all tasks
          - help: to show this help message
          - mark-in-progress <task_id>: to mark a task as in progress
          - mark-done <task_id>: to mark a task as completed
          """);
        return;
      case "add":
        String result = add(args[1]);
        System.out.printf(result);
        return;
    }
  }

  private static String add(String taskDescription) throws IOException {
    File tasksFile = getOrCreateTasksFile("tasks.json");
    String rawJson = readTasksFile(tasksFile);
    String firstRawTask = parseTasks(rawJson);
    return firstRawTask;
  }

  private static File getOrCreateTasksFile(String pathname) throws IOException {
    File tasksFile = new File(pathname);

    if (!tasksFile.exists()) {
      boolean isCreated = tasksFile.createNewFile();

      if (!isCreated) {
        throw new IOException("Failed to create tasks.json file.");
      }
    }

    return tasksFile;
  }

  private static String readTasksFile(File tasksFile) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(tasksFile))) {
      return br.readAllAsString();
    }
  }

  private static String parseTasks(String rawJson) {
    StringBuilder sb = new StringBuilder(rawJson);
    String rawTaskList = sb.substring(sb.indexOf("[") + 1, sb.lastIndexOf("]")).trim();
    return "Task added successfully!";
  }
}