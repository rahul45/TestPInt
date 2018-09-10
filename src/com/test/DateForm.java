package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateForm {

	    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	    public static void main(String[] args) {
            String startDate = "2017-05-14";
            Date df =null;
            try {
				df= dateFormat.parse(startDate);
				System.out.println(df);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Date currentDate = new Date();
	        System.out.println(dateFormat.format(df));
	        // convert date to calendar
	        Calendar c = Calendar.getInstance();
	        c.setTime(df);
	        // manipulate date
	       // c.add(Calendar.YEAR, 1);
	       // c.add(Calendar.MONTH, 1);
	        c.add(Calendar.DATE, 10); //same with c.add(Calendar.DAY_OF_MONTH, 1);
	        //c.add(Calendar.HOUR, 1);
	       // c.add(Calendar.MINUTE, 1);
	        //c.add(Calendar.SECOND, 1);
	        // convert calendar to date
	        Date currentDatePlusOne = c.getTime();

	        System.out.println(dateFormat.format(currentDatePlusOne));
	      
	        


	}
}
