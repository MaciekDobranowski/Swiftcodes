package com.example.swiftcodes;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelParser {
    public static List<SwiftCodeEntry> parse(String filePath) throws Exception {
        List<SwiftCodeEntry> entries = new ArrayList<>();
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row == null) continue;

            String iso2 = row.getCell(0).getStringCellValue().trim();
            String swift = row.getCell(1).getStringCellValue().trim();
            String name = row.getCell(5).getStringCellValue().trim();
            String address = row.getCell(6).getStringCellValue().trim();
            String country = row.getCell(8).getStringCellValue().trim();

            boolean isHeadquarter = swift.endsWith("XXX");

            SwiftCodeEntry entry = new SwiftCodeEntry(swift, name, address, iso2.toUpperCase(), country.toUpperCase(), isHeadquarter);
            entries.add(entry);
        }

        workbook.close();
        return entries;
    }
}