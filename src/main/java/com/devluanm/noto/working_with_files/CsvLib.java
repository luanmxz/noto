package com.devluanm.noto.working_with_files;

import org.apache.commons.csv.*;
import org.apache.commons.io.input.BOMInputStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class CsvLib {

  public static void main(String[] args) throws IOException {
    String filePath = args[0];

    Map<String, Integer> nomesMap = new HashMap<>();

    try (Reader reader = new InputStreamReader(
      BOMInputStream.builder()
        .setInputStream(new FileInputStream(filePath))
        .get(),
      StandardCharsets.UTF_8)) {

      Iterable<CSVRecord> records = CSVFormat.DEFAULT
        .withDelimiter(';')
        .withFirstRecordAsHeader()
        .withIgnoreHeaderCase()
        .withTrim()
        .parse(reader);

      for (CSVRecord record : records) {
        String name = record.get("nome");
        String age = record.get("idade");

        nomesMap.putIfAbsent(name, 0);

        nomesMap.computeIfPresent(name, (k, v) -> v + 1);
      }
    }
  }
}