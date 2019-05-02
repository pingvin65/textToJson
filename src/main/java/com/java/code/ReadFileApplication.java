package com.java.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author pingvin
 *
 */
@SpringBootApplication
public class ReadFileApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		SpringApplication.run(ReadFileApplication.class, args);

//		try {
//			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("my-beans.xml");
//			ReadWordsService wordsService = (ReadWordsService) ctx.getBean("readWordsService");
//			List<String> words = wordsService.readWords();
//			words.forEach(word -> logger.info(word));
//			ctx.close();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}

	}

}
