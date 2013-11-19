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
		//Excel WorkBook ����
		try {
			Workbook tmpWorkBook = new HSSFWorkbook();
			
			//WorkBook ���� Sheet ����
			Sheet tmpSheet = tmpWorkBook.createSheet();
			
			int index = 0;
			for (MPoi tmpPoi : pois)
			{
				//Sheet���� row ����
				Row row = tmpSheet.createRow(index);
				//row ���� cell (0:name / 1:x / 2:y) �� ����
				
				row.createCell(0).setCellValue(tmpPoi.getName());				
				row.createCell(1).setCellValue(tmpPoi.getX());				
				row.createCell(2).setCellValue(tmpPoi.getY());
			}
			//poi List ó������ ������ �ݺ�
				
			//WorkBook Write �ϰ� ���� �ݱ�
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
		
		//MPoiScannerExcel2 Object ����
			//file �̸��� �����Ҷ� �̸� ������ ���ڴ�.
		MPoiScannerExcel myPoiScanner = new MPoiScannerExcel("D:/Projects/StudyExample/resource/mpoi_seoul_1000.xls");
		//Excel file �б�
			//������ ���� file �̸����� Excel file ����
		myPoiScanner.openPoiExcel();
		//���� Excel file ������ ���� ������ �� ���� ����� Poi�� ����
			//Excel file �д� ���		
			//���� Excel file ���� �� ���� ���ϴ� ���ǿ� �´� Poi���� ���� ���ϴ� ���·� �ӽ� ����
		List<MPoi> tmpMPois = myPoiScanner.getNearPoi(949013, 1943822, 1000);
		//����� Poi���� Excel file�� ����
		myPoiScanner.writePoiExcel("D:/Projects/StudyExample/resource/output.xls", tmpMPois);
		
			//Excel file ���� ���
		
	}

}
