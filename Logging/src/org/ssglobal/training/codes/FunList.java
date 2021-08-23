package org.ssglobal.training.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;

public class FunList {
	private BufferedReader bufferedReader;
	private Word word;	//injectables
	
	// Step1: Create a Logger
	private static Logger logger = Logger.getLogger(FunList.class.getName());	// logger should always be private and static
	
	{
		// Step1.b Set the logging level
		logger.setLevel(Level.INFO);
		
		// Step2 Creating another handler
		// Step3 Format the message
		try {		
			FileHandler fileHandler = new FileHandler("./src/log/funlist.log", true);   // to append and not overwrite loggers
			fileHandler.setEncoding("UTF-8");
			fileHandler.setLevel(Level.INFO);
					
			SimpleFormatter formatter = new SimpleFormatter();
			fileHandler.setFormatter(formatter);
					
			logger.addHandler(fileHandler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public FunList() {
		
	}
	
	
	public FunList(String filename) {
		
		Path path = Paths.get(filename);
		try {
			this.bufferedReader = Files.newBufferedReader(path);
		} catch (IOException e) {
			// Step1.c Apply logging
			logger.severe("Error message: " + e.getMessage());
			e.printStackTrace();
		}
	}	
	
	public long countWords() {
		logger.info("execute countWords");
		long temp =  this.bufferedReader.lines()
						 .map((str) -> { return str.split("");}).count();
		logger.info("exit without errors countWords");
		return temp;
	}
	
	@SuppressWarnings("deprecation")
	public boolean enableDisplay() {
		logger.info("execute enableDisplay");
		
		logger.warning("custom Date is deprecated");							// set the level to Warning to cater both warning level logger and severe
		Date xmas = new Date(121, 11, 25);
		
		try {
			if(this.bufferedReader.lines().toArray(String[]::new).length > 0) {
				showLines();
				return true;
			}
		} catch (Exception e) {
			// Step1.c Apply logging
			logger.severe("Error message: " + e.getMessage());
		}
		logger.info("exit without errors enableDisplay");
		return false;
	}
	
	public void showLines() {
		logger.info("execute showLines");
		this.bufferedReader.lines()
		    .forEach((line) -> {System.out.println(line);});
		logger.info("exit without errors showLines");
	}
	
	public List<String> getContentList() {
		logger.info("execute getContentList");
		List<String> temp = this.bufferedReader.lines().collect(Collectors.toList());
		logger.info("exit without errors getContentList");
		return temp;
	}
	
	public String[] getContentArray() {
		logger.info("execute getContentArray");
		String[] temp = (String[]) this.bufferedReader.lines().toArray();		// .toArray(String[]::new) --- casting Object[] to String[]
		logger.info("exit without errors getContentList");
		return temp;
	}
	
	public String processStr(String str1, String str2) {
		return String.join(" ", str1, str2);
	}
	
	
}

class Word {
	
}
