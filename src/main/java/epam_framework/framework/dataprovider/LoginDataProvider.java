package epam_framework.framework.dataprovider;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import epam_framework.framework.constants.ExcelConstants;
import epam_framework.framework.util.ExcelReadWrite;

/*
 * LoginDataProvider
 * add data providers for your login class
 */
public class LoginDataProvider {

	@DataProvider(name = "loginDataProvider")
	public Object[] dataProvider() throws IOException {

		List<Map<String, String>> data = ExcelReadWrite.readExcelAsMap(ExcelConstants.EXCEL_PATH,
				ExcelConstants.LOGIN_EXCEL_SHEET_NAME);

		Object[] arr  = data.toArray();

		for(int i = 0; i<data.toArray().length; i++) {
			System.out.println(arr[i]);
		}

		return data.toArray();
	}

}
