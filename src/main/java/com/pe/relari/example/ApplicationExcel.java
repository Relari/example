package com.pe.relari.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Slf4j
class ApplicationExcel {

    private static final String PATH_NAME = System.getProperty("user.home").concat("/Desktop/data.xlsx");

    void getContent() {

        List<Object> cellData = new ArrayList<>();

        try {

            var fileInputStream = new FileInputStream(PATH_NAME);
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
                log.info("----------title----------------");
                log.info(cells.get(i).toString());
                log.info("-------------------------------");
            } else {
                log.info(cells.get(i).toString());
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

    void createExcel() {
        // Creamos el archivo donde almacenaremos la hoja
        // de calculo, recuerde usar la extension correcta,
        // en este caso .xlsx
        File archivo = new File(PATH_NAME);

        // Creamos el libro de trabajo de Excel formato OOXML
        Workbook workbook = new XSSFWorkbook();

        // La hoja donde pondremos los datos
        Sheet pagina = workbook.createSheet("Reporte de productos");

        // Creamos el estilo paga las celdas del encabezado
        CellStyle style = workbook.createCellStyle();
        // Indicamos que tendra un fondo azul aqua
        // con patron solido del color indicado
        style.setFillForegroundColor(IndexedColors.AQUA.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        String[] titulos = {"Identificador", "Consumos",
                "Precio Venta", "Precio Compra"};
        Double[] datos = {1.0, 10.0, 45.5, 25.50};

        // Creamos una fila en la hoja en la posicion 0
        Row fila = pagina.createRow(0);

        // Creamos el encabezado
        for (int i = 0; i < titulos.length; i++) {
            // Creamos una celda en esa fila, en la posicion
            // indicada por el contador del ciclo
            Cell celda = fila.createCell(i);

            // Indicamos el estilo que deseamos
            // usar en la celda, en este caso el unico
            // que hemos creado
            celda.setCellStyle(style);
            celda.setCellValue(titulos[i]);
        }

        // Ahora creamos una fila en la posicion 1
        fila = pagina.createRow(1);

        // Y colocamos los datos en esa fila
        for (int i = 0; i < datos.length; i++) {
            // Creamos una celda en esa fila, en la
            // posicion indicada por el contador del ciclo
            Cell celda = fila.createCell(i);

            celda.setCellValue(datos[i]);
        }

        // Ahora guardaremos el archivo
        try {
            // Creamos el flujo de salida de datos,
            // apuntando al archivo donde queremos
            // almacenar el libro de Excel
            FileOutputStream salida = new FileOutputStream(archivo);

            // Almacenamos el libro de
            // Excel via ese
            // flujo de datos
            workbook.write(salida);

            // Cerramos el libro para concluir operaciones
            workbook.close();

            log.info("Archivo creado existosamente");

        } catch (FileNotFoundException ex) {
            log.error("Archivo no localizable en sistema de archivos");
        } catch (IOException ex) {
            log.error("Error de entrada/salida");
        }
    }

    public static void main(String[] args) {

        var file = new File(PATH_NAME);

        log.info(file.getAbsolutePath());

        var applicationExcel = new ApplicationExcel();

        if (!file.exists()) {
            applicationExcel.createExcel();
        }
        applicationExcel.getContent();
    }
}
