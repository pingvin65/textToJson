package com.java.code.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.code.ReadFileApplication;
import com.java.code.model.Word;
import com.java.code.service.ReadWordsService;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/words") // This means URL's start with /demo (after Application path)
public class MainController {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ReadFileApplication.class);
	
	private ReadWordsService readWordsService;
	List<String> readWords;
	@GetMapping(path = "/all")
	public @ResponseBody List<Word> getAllWords(){
		List<Word> words = new ArrayList<Word>();
		try {
			
			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("my-beans.xml");
			readWordsService = (ReadWordsService) ctx.getBean("readWordsService");
			readWords = readWordsService.readWords();
			for(String w: readWords) {
				//String we = w.toString();
				 logger.info( w.toString());
				words.add(new Word(w.toString()));
			}
			ctx.close();
			logger.info("----------");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
		}
		
		return words;
		
	}
}
