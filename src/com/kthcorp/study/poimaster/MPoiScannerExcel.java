package com.kthcorp.study.poimaster;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MPoiScannerExcel {
	private static String filePath;
	private Workbook workBook;
	
	public MPoiScannerExcel(String filepath)
	{
		this.filePath = filepath;
	}

	public static double getDistance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2));
	}
	
	void openPoiExcel()
	{
		try {
			this.workBook = WorkbookFactory.create(new File(this.filePath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	List<MPoi> getNearPoi(double x, double y, int radius)
	{
		List<MPoi> ret = new ArrayList<MPoi>(); 
		
		Sheet tmpSheet = this.workBook.getSheetAt(0);
		
		for (Row tmpRow : tmpSheet)
		{
			String name = String.valueOf(tmpRow.getCell(1));
			double posX =  NumberUtils.toDouble(String.valueOf(tmpRow.getCell(14)));
			double posY =  NumberUtils.toDouble(String.valueOf(tmpRow.getCell(15)));
			
			double distance = MPoiScannerExcel.getDistance(x, y, posX, posY);
			
			if (distance < radius)
			{
				MPoi tmpPoi = new MPoi(name, posX, posY);
				ret.add(tmpPoi);
			}			
		}		
		
		return ret;
	}
	
	void writePoiExcel(String outputPath, List<MPoi> pois)
	{
		//Excel WorkBook 생성
		try {
			Workbook tmpWorkBook = new HSSFWorkbook();
			
			//WorkBook 에다 Sheet 생성
			Sheet tmpSheet = tmpWorkBook.createSheet();
			
			int index = 0;
			for (MPoi tmpPoi : pois)
			{
				//Sheet에다 row 생성
				Row row = tmpSheet.createRow(index);
				//row 에다 cell (0:name / 1:x / 2:y) 들 생성
				
				row.createCell(0).setCellValue(tmpPoi.getName());				
				row.createCell(1).setCellValue(tmpPoi.getX());				
				row.createCell(2).setCellValue(tmpPoi.getY());
			}
			//poi List 처음부터 끝까지 반복
				
			//WorkBook Write 하고 파일 닫기
			FileOutputStream tmpFileStream = new FileOutputStream(outputPath);
			tmpWorkBook.write(tmpFileStream);
			tmpFileStream.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MPoiScannerExcel2 Object 생성
			//file 이름은 생성할때 미리 받으면 좋겠다.
		MPoiScannerExcel myPoiScanner = new MPoiScannerExcel("D:/Projects/StudyExample/resource/mpoi_seoul_1000.xls");
		//Excel file 읽기
			//위에서 받은 file 이름으로 Excel file 열기
		myPoiScanner.openPoiExcel();
		//읽은 Excel file 내용중 내가 지정한 한 점에 가까운 Poi들 추출
			//Excel file 읽는 방법		
			//읽은 Excel file 내용 중 내가 원하는 조건에 맞는 Poi들을 내가 원하는 형태로 임시 저장
		List<MPoi> tmpMPois = myPoiScanner.getNearPoi(949013, 1943822, 1000);
		//추출된 Poi들을 Excel file에 쓰기
		myPoiScanner.writePoiExcel("D:/Projects/StudyExample/resource/output.xls", tmpMPois);
		
			//Excel file 쓰는 방법
		
	}

}
