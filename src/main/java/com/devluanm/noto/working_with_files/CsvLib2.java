package com.devluanm.noto.working_with_files;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class CsvLib2 {

  static void main(String[] args) throws IOException {

    String filePath = "C:\\Users\\Luan\\Documents\\Projetos\\noto\\teste.csv"; // reading the file path
    File file = new File(filePath); // instantiang the file object

    try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
      String line;

      int counter = 0;
      while((line = bufferedReader.readLine()) != null) {
        if (counter == 0) {
          System.out.println(String.format("Headers [%s]", Arrays.toString(line.split(";"))));
          counter++;
          continue;
        }
        String[] columns = line.split(";");
        System.out.println(Arrays.toString(columns));
        counter++;
      }
    }
  }
}
