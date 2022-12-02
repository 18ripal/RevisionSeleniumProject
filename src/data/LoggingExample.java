package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Logger print=Logger.getLogger("devpinoyLogger");
		print.debug("Hello");
		print.debug("line 1");
		print.debug("line 2");

	}

}
