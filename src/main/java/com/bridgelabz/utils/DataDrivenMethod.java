/**
 * Description : add data driven method
 * Author      : Mayur Mansukh
 * Date        : 11/6/21
 */
package com.bridgelabz.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenMethod {

    public XSSFWorkbook getWorkbook() throws IOException {
        File file = new File("C:\\Users\\admin\\IdeaProjects\\PunePolicePortal\\Excel\\PunePortalData.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        return workbook;
    }

    public String userName() throws IOException {
        XSSFSheet sheet = getWorkbook().getSheetAt(0);
        XSSFCell username = sheet.getRow(0).getCell(0);
        return String.valueOf(username);
    }

    public String officeId() throws IOException {
        XSSFSheet sheet = getWorkbook().getSheetAt(0);
        XSSFCell officeId = sheet.getRow(1).getCell(0);
        return String.valueOf(officeId);
    }

    public String birthDate() throws IOException {
        XSSFSheet sheet = getWorkbook().getSheetAt(0);
        XSSFCell birthDate = sheet.getRow(2).getCell(0);
        return String.valueOf(birthDate);
    }

    public String phone() throws IOException {
        XSSFSheet sheet = getWorkbook().getSheetAt(0);
        XSSFCell phone = sheet.getRow(3).getCell(0);
        return String.valueOf(phone);
    }

    public String adhar() throws IOException {
        XSSFSheet sheet = getWorkbook().getSheetAt(0);
        XSSFCell adhar = sheet.getRow(4).getCell(0);
        return String.valueOf(adhar);
    }

    public String selectFromDate() throws IOException {
        XSSFSheet sheet = getWorkbook().getSheetAt(0);
        XSSFCell selectFromDate = sheet.getRow(5).getCell(0);
        return String.valueOf(selectFromDate);
    }

    public String selectToDate() throws IOException {
        XSSFSheet sheet = getWorkbook().getSheetAt(0);
        XSSFCell selectToDate = sheet.getRow(6).getCell(0);
        return String.valueOf(selectToDate);
    }

    public String enterRemark() throws IOException {
        XSSFSheet sheet = getWorkbook().getSheetAt(0);
        XSSFCell enterRemark = sheet.getRow(7).getCell(0);
        return String.valueOf(enterRemark);
    }




}
