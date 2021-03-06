/**
 * Description : add Data driven framework to get value from excel file
 * Author      : Mayur Mansukh
 * Date        : 11/6/21
 */
package com.bridgelabz.utils;

import com.bridgelabz.base.Base;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtilsBase extends Base {

    public XSSFWorkbook excel_utils_base() throws IOException {
        File file = new File("C:\\Users\\admin\\IdeaProjects\\MakeMyTrip.com\\Excel\\Data.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        return workbook;
    }

}

