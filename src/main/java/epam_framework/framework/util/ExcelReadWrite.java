package epam_framework.framework.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * ExcelReadWrite Utility for excel read write
 */
public class ExcelReadWrite {

	public static List<Map<String, String>> readExcelAsMap(String file, String sheetName) throws IOException {

		try (XSSFWorkbook workbook = new XSSFWorkbook(file)) {

			XSSFSheet sheet = workbook.getSheet(sheetName);
			int rows = sheet.getLastRowNum();
			int cols = sheet.getRow(0).getLastCellNum();

			System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
			System.out.println(String.valueOf(sheet.getRow(1).getCell(0).getNumericCellValue()));

			System.out.println(rows);
			System.out.println(cols);

			List<Map<String, String>> listMap = new ArrayList<>();

			for (int i = 1; i <= rows; i++) {
				Map<String, String> map = new HashMap<>();

				for (int j = 0; j < cols; j++) {
					map.put(sheet.getRow(0).getCell(j).getStringCellValue(),
							String.valueOf(sheet.getRow(i).getCell(j).getStringCellValue()));
				}

				listMap.add(map);

			}
			System.out.println(listMap);

			return listMap;

		}
	}
}
