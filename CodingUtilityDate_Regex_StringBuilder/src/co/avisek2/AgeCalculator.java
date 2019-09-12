package co.avisek2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;


public class AgeCalculator {
	
	public int[] calculateAge(String line) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		  Date d = sdf.parse(line);
		  Calendar c = Calendar.getInstance();
		  c.setTime(d);
		  int year = c.get(Calendar.YEAR);
		  int month = c.get(Calendar.MONTH);
		  if(year>2019) {
			  return null;
		  }else if(year==2019 && month>=4) {
			  return null;
		  }
		  
		  
		  int diffmonth=4-month;
		  int diffyear = 2019-year;
		  if (diffmonth < 0)
	      {
	         diffyear--;
	         diffmonth = 12 - month + 4;
	         if (c.get(Calendar.DATE)>1)
	            diffmonth--;
	      } else if (diffmonth == 0 && c.get(Calendar.DATE)>1)
	      {
	         diffyear--;
	         diffmonth = 11;
	      }
		  
		  int[] age = {diffyear,diffmonth};
		  return age;
		  
		
		
		
		
	}
	
	
	

}
