/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import kmeans.LogData;

/**
 *
 * @author Tess
 */


public class ReadData {
	
	public static List<LogData> readLogData(String filePath) throws FileNotFoundException{
		List<LogData> logs = new ArrayList<LogData>();
		LogData log = null;
		Scanner sc = new Scanner(new File(filePath));
		String[] line = null;
		
		/** Bypass 1st line of input, its plain text. **/
		if(sc.hasNext())
			sc.next();
		
		
		while(sc.hasNext()){
			line = sc.next().split(",");
			log = new LogData();
				
                        log.setId(line[0]);
                        log.setTime(Float.parseFloat(line[1]));
                        log.setSource(line[2]);
                        log.setDestination(Float.parseFloat(line[3]));
                        log.setProtocol(line[4].charAt(0));
                        log.setLength(Integer.parseInt(line[5]));
                        log.setInfo(line[6].charAt(0));
                        
			
			logs.add(log);
		}
		
		return logs;
	}
}
