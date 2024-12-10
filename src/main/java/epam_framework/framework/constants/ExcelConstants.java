package epam_framework.framework.constants;

import java.nio.file.Paths;

/*
 * ExcelConstants
 * keep your excel files constants here
 */
public class ExcelConstants {

	public static final String EXCEL_PATH = Paths
			.get(System.getProperty("user.dir"), "src", "test", "resources", "dataprovider.xlsx").toString();
	public static final String LOGIN_EXCEL_SHEET_NAME = "Login";

}
