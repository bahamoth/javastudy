package com.kthcorp.study.poimaster;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

public class MPoiScannerCsv implements IMPoiScanner {

	@Override
	public List<MPoi> read(Object input) {
		CSVReader reader = null;
		List<MPoi> ret = new ArrayList<MPoi>();
		try {
			reader = new CSVReader(new FileReader((String)input));
			String[] nextLine;
			
			while ((nextLine = reader.readNext()) != null) 
			{
				ret.add(new MPoi(nextLine));
			}			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		return ret;
	}

	@Override
	public void write(List<MPoi> pois, Object output) {
		
		String outputPath = (String)output;
		List<String[]> tmpPoisList =  new ArrayList<String[]>();
		try {
			CSVWriter writer = new CSVWriter(new FileWriter(outputPath));
			
			Iterator<MPoi> iter = pois.iterator();
			while (iter.hasNext())
			{
				MPoi tmpPoi = iter.next();
				tmpPoisList.add(tmpPoi.get());				
			}
			
			writer.writeAll(tmpPoisList);			
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
