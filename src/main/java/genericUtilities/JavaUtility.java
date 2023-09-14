package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class consists of reusable methods of java
 * @author Keerthi
 *
 */
public class JavaUtility
{
	/**
	 * This method will generate system date in specified format and return to caller
	 * @return 
	 */
public String getSystemdate()
{
	Date d= new Date();
	SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy hh-mm-ss");
	String date = sdf.format(d);
	return date;
}
}
