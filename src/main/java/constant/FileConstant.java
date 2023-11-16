package constant;

import utilis.CommonUtilis;

public class FileConstant {
	public static final String LOGIN_TESTDATA_FILE_PATH=System.getProperty("user.dir") + "/src/main/resources/testdata/logintest.properties";
	public static final String PROFILE_PHOTO_PATH=System.getProperty("user.dir") + "/src/main/resources/testdata/IMG-1294.jpg";
	public static final String REPORT_PATH =  System.getProperty("user.dir") + "/src/main/resources/reports/"+CommonUtilis.getDateAndTimeStamp()+"cucumber.html";
	public static final String SCREENSHOT_FOLDER_PATH =  System.getProperty("user.dir") + "/src/main/resources/reports/"+CommonUtilis.getDateAndTimeStamp()+"cucumber.PNG";
	

}
