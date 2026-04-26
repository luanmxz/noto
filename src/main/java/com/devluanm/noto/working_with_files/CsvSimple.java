package com.devluanm.noto.working_with_files;

import java.io.*;

public class CsvSimple {
	public static void main(String ...args) throws IOException {

		if (args.length == 0) {
			System.out.println("Please provide a file path");
			return;
		}

		File file = new File(args[0]);

		if (!file.exists() || !file.isFile()) {
			System.out.println("File not found");
			return;
		}

		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());

		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while((line = br.readLine()) != null) {
			String[] columns = line.split(",");

			for(String column : columns) {
				System.out.println(column + " | ");
			}
			System.out.println();
		}
		br.close();
	}
}
