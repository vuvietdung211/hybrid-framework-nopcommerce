package commons;

import java.io.File;

public class GlobalConstants {
	public static final String PORTAL_DEV_URL = "https://demo.nopcommerce.com/";
	public static final String ADMIN_DEV_URL = "https://admin-demo.nopcommerce.com/";
	
	public static final String PORTAL_TEST_URL = "https://demo.nopcommerce.com/";
	public static final String ADMIN_TEST_URL = "https://admin-demo.nopcommerce.com/";
	
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String 	UPLOAD_FOLDER_PATH = PROJECT_PATH +  File.separator + "uploadFiles" + File.separator;
	public static final String 	DOWNLOAD_FOLDER_PATH = PROJECT_PATH + File.separator + "/downloadfiles";

	public static final long 	LONG_TIMEOUT = 30;
	public static final long 	SHORT_TIMEOUT = 5;


}
