//package com.pe.relari.people.util;
//
//import com.pe.relari.example.repository.EmployeeRepository;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.ss.usermodel.FillPatternType;
//import org.apache.poi.ss.usermodel.IndexedColors;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//@Slf4j
//class ApplicationExcel {
//
//    private static final String PATH_NAME = System.getProperty("user.home").concat("/Desktop/data.xlsx");
//
//    void getContent() {
//
//        List<Object> cellData = new ArrayList<>();
//
//        try {
//
//            var fileInputStream = new FileInputStream(PATH_NAME);
//            var workbook = new XSSFWorkbook(fileInputStream);
//
//            var sheet = workbook.getSheetAt(0);
//
//            var rowIterator = sheet.rowIterator();
//
//            while(rowIterator.hasNext()) {
//
//                var row = (XSSFRow) rowIterator.next();
//
//                var iterator = row.cellIterator();
//
//                List<String> cellTemp = new ArrayList<>();
//
//                while (iterator.hasNext()) {
//                    var cell = (XSSFCell) iterator.next();
//                    cellTemp.add(cell.toString());
//                }
//
//                cellData.add(cellTemp);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
////        cellData.forEach(System.out::println);
////        get(cellData);
//        printData(cellData);
//    }
//
//    void printData(List<Object> cells) {
//
//        for (int i = 0; i < cells.size(); i++) {
//
//            if (i == 0) {
//                log.info("----------title----------------");
//                log.info(cells.get(i).toString());
//                log.info("-------------------------------");
//            } else {
//                log.info(cells.get(i).toString());
//            }
//        }
//    }
//
////    private void get(List<Object> cells) {
////        for (Object o : cells) {
////
////            var list = (List<Object>) o;
////
////            for (Object value : list) {
////
////                var cell = (XSSFCell) value;
////
////                var cellValue = cell.toString();
////                System.out.print(cellValue);
////            }
////            System.out.println();
////        }
////    }
//
//    void createExcel() throws IOException {
//        // Creamos el archivo donde almacenaremos la hoja
//        // de calculo, recuerde usar la extension correcta,
//        // en este caso .xlsx
//        File file = new File(PATH_NAME);
//
//        // Creamos el libro de trabajo de Excel formato OOXML
//        Workbook workbook = new XSSFWorkbook();
//
//        // La hoja donde pondremos los datos
//        Sheet pagina = workbook.createSheet("Reporte de productos");
//
//        // Creamos el estilo paga las celdas del encabezado
//        CellStyle style = workbook.createCellStyle();
//        // Indicamos que tendra un fondo azul aqua
//        // con patron solido del color indicado
//        style.setFillForegroundColor(IndexedColors.AQUA.getIndex());
//        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//
//        String[] title = {"id", "name", "sex", "position", "salary", "status"};
//
//        // Creamos una fila en la hoja en la posicion 0
//        Row fila = pagina.createRow(0);
//
//        // Creamos el encabezado
//        for (int i = 0; i < title.length; i++) {
//            // Creamos una celda en esa fila, en la posicion
//            // indicada por el contador del ciclo
//            Cell celda = fila.createCell(i);
//
//            // Indicamos el estilo que deseamos
//            // usar en la celda, en este caso el unico
//            // que hemos creado
//            celda.setCellStyle(style);
//            celda.setCellValue(title[i]);
//        }
//
//        var employees = EmployeeRepository.employees();
//
//        // Y colocamos los datos en esa fila
//        for (int i = 0; i < employees.size(); i++) {
//
//            // Ahora creamos una fila en la posicion 1
//            fila = pagina.createRow(i + 1);
//
//            // Creamos una celda en esa fila, en la
//            // posicion indicada por el contador del ciclo
//
//            var employee = employees.get(i);
//
//            fila.createCell(0).setCellValue(employee.getId());
//            fila.createCell(1).setCellValue(employee.getName());
//            fila.createCell(2).setCellValue(employee.getSex());
//            fila.createCell(3).setCellValue(employee.getPosition());
//            fila.createCell(4).setCellValue(employee.getSalary());
//            fila.createCell(5).setCellValue(employee.getStatus());
//        }
//
//        // Ahora guardaremos el archivo
//        try {
//            // Creamos el flujo de salida de datos,
//            // apuntando al archivo donde queremos
//            // almacenar el libro de Excel
//            FileOutputStream salida = new FileOutputStream(file);
//
//            // Almacenamos el libro de
//            // Excel via ese
//            // flujo de datos
//            workbook.write(salida);
//
//            // Cerramos el libro para concluir operaciones
//            workbook.close();
//
//            log.info("Archivo creado existosamente");
//
//        } catch (FileNotFoundException ex) {
//            log.error("Archivo no localizable en sistema de archivos");
//        } catch (IOException ex) {
//            log.error("Error de entrada/salida");
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        var file = new File(PATH_NAME);
//
//        log.info(file.getAbsolutePath());
//
//        var applicationExcel = new ApplicationExcel();
//
//        if (!file.exists()) {
//            applicationExcel.createExcel();
//        }
//        applicationExcel.getContent();
//    }
//}
