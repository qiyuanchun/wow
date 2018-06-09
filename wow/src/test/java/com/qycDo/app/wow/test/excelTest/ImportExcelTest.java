package com.qycDo.app.wow.test.excelTest;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;

import static javafx.scene.input.KeyCode.X;

public class ImportExcelTest {

    public static void main(String[] args) {

        // 用Struts导入文件:
        // FormFile formFile = batchChangeAGForm.getXlsfile();
        //
        // if (0 == formFile.getFileSize()) {
        // this.setPromptMessage(request, "选择的文件有误！");
        // return mapping.findForward("batchChangeAGImport");
        // }
        // InputStream is = formFile.getInputStream();

        // 直接读取文件:
        String filePath = "D:\\File_Import.xls";
        File file = new File(filePath);
        InputStream is;
//        HSSFSheet sheetMain;
        XSSFSheet sheetMain = null;
        try {
            is = new FileInputStream(file);
//            POIFSFileSystem fs = new POIFSFileSystem(is);

//            HSSFWorkbook wb = new HSSFWorkbook(is);
            XSSFWorkbook wb = new XSSFWorkbook(is);
            // 读取第一个Sheet
//            sheetMain = wb.getSheetAt(0);
            sheetMain = wb.getSheetAt(0);
            is.close();

            // 总共的行数
            int rowLens = sheetMain.getLastRowNum();
            int colLens = 6;
            int errCnt = 0;
//            HSSFRow row = null;
            XSSFRow row = null;
//            HSSFCell cell = null;
            XSSFCell cell = null;
            String content = "";

            for (int rowCount = 0; rowCount <= rowLens; rowCount++) {
                System.out.println("读取行：" + rowCount);
                row = sheetMain.getRow(rowCount);
                if (row != null) {
                    for (int colCount = 0; colCount < colLens; colCount++) {
                        System.out.print("行 ：" + rowCount + "；列 ：" + colCount
                                + "的内容：");
                        cell = row.getCell((short) colCount);
                        content = getCellValue(cell).trim();
                        if (content == "") {
                            System.out.println("### 发现空异常 ###");
                        } else {
                            System.out.println(content);
                        }
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getCellValue(XSSFCell cell) {
        if (cell != null) {
            switch (cell.getCellType()) {
                case HSSFCell.CELL_TYPE_BLANK:
                    return "";
                case HSSFCell.CELL_TYPE_NUMERIC:
                    String strValue = String.valueOf(cell.getNumericCellValue());
                    if (strValue != null && strValue.indexOf(".") != -1
                            && strValue.indexOf("E") != -1) {
                        try {
                            return new DecimalFormat().parse(strValue).toString();
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    } else {
                        if (strValue.endsWith(".0")) {
                            return strValue.substring(0, strValue.indexOf(".0"));
                        } else {
                            return strValue;
                        }
                    }
                case HSSFCell.CELL_TYPE_STRING:
                    return (cell.getStringCellValue() + "").trim();
                case HSSFCell.CELL_TYPE_FORMULA:
                    return (cell.getCellFormula() + "").trim();
                case HSSFCell.CELL_TYPE_BOOLEAN:
                    return cell.getBooleanCellValue() + "";
                case HSSFCell.CELL_TYPE_ERROR:
                    return cell.getErrorCellValue() + "";
            }
        }
        return "";
    }

    public static String getCellValue(HSSFCell cell) {
        if (cell != null) {
            switch (cell.getCellType()) {
                case HSSFCell.CELL_TYPE_BLANK:
                    return "";
                case HSSFCell.CELL_TYPE_NUMERIC:
                    String strValue = String.valueOf(cell.getNumericCellValue());
                    if (strValue != null && strValue.indexOf(".") != -1
                            && strValue.indexOf("E") != -1) {
                        try {
                            return new DecimalFormat().parse(strValue).toString();
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    } else {
                        if (strValue.endsWith(".0")) {
                            return strValue.substring(0, strValue.indexOf(".0"));
                        } else {
                            return strValue;
                        }
                    }
                case HSSFCell.CELL_TYPE_STRING:
                    return (cell.getStringCellValue() + "").trim();
                case HSSFCell.CELL_TYPE_FORMULA:
                    return (cell.getCellFormula() + "").trim();
                case HSSFCell.CELL_TYPE_BOOLEAN:
                    return cell.getBooleanCellValue() + "";
                case HSSFCell.CELL_TYPE_ERROR:
                    return cell.getErrorCellValue() + "";
            }
        }
        return "";
    }

}
