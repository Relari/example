package com.renzo.exercises.lessons.java.example.test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

class ApplicationExcel {

    ApplicationExcel(File fileName) {

        List<Object> cellData = new ArrayList<>();

        try {

            var fileInputStream = new FileInputStream(fileName);
            var workbook = new XSSFWorkbook(fileInputStream);

            var sheet = workbook.getSheetAt(0);

            var rowIterator = sheet.rowIterator();

            while(rowIterator.hasNext()) {

                var row = (XSSFRow) rowIterator.next();

                var iterator = row.cellIterator();

                List<String> cellTemp = new ArrayList<>();

                while (iterator.hasNext()) {
                    var cell = (XSSFCell) iterator.next();
                    cellTemp.add(cell.toString());
                }

                cellData.add(cellTemp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

//        cellData.forEach(System.out::println);
//        get(cellData);
        printData(cellData);
    }

    void printData(List<Object> cells) {

        for (int i = 0; i < cells.size(); i++) {

            if (i == 0) {
                System.out.println("----------title----------------");
                System.out.println(cells.get(i).toString());
                System.out.println("-------------------------------");
            } else {
                System.out.println(cells.get(i).toString());
            }
        }
    }

//    private void get(List<Object> cells) {
//        for (Object o : cells) {
//
//            var list = (List<Object>) o;
//
//            for (Object value : list) {
//
//                var cell = (XSSFCell) value;
//
//                var cellValue = cell.toString();
//                System.out.print(cellValue);
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {

        var file = new File("C:/Users/cld_r/Desktop/data.xlsx");

        if(file.exists()) {
            new ApplicationExcel(file);
        }
    }
}
