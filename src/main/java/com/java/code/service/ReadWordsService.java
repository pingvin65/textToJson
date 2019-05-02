package com.java.code.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import java.util.List;


/**
 * 
 * @author pingvin
 *
 */
public class ReadWordsService {

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public List<String> readWords() throws IOException {

		String separator = System.getProperty("file.separator");
		String dataFolder = System.getProperty("user.dir") + separator + "data";

		File myFile2 = new File(dataFolder + separator + "words.txt");
		List<String> lines = Files.readAllLines(myFile2.toPath());
		return lines;
	}

}