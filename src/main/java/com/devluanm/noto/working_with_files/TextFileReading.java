package com.devluanm.noto.working_with_files;

import org.jetbrains.annotations.NotNull;

import java.io.*;

public class TextFileReading {

  static void main(String ...args) throws IOException {
    if (args.length == 0) {
      System.out.println("0 files received");
      return;
    }

    String filePath = args[0];
    File file = new File(filePath);
    System.out.printf("File name '%s'%n", file.getName());

    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
      String line;

      int counter = 0;
      while ((line = br.readLine()) != null) {
        System.out.printf("Line number {%d} - content: '%s'\n", counter++, line);
      }
    }
  }
}
