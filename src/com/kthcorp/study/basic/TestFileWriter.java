package com.kthcorp.study.basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter bwriter = new BufferedWriter(new FileWriter("d:/test.txt"));
			bwriter.write("Hello TextFile !!");
			
			bwriter.flush();
			bwriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
