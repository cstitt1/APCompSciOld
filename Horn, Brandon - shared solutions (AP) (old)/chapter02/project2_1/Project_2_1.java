package project2_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Project_2_1
{
	public static void main(String[] args)
	{
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(convertGregorianCalendarToString(cal));
		cal.add(Calendar.DAY_OF_MONTH, 100);
		System.out.println(convertGregorianCalendarToString(cal));

		cal = new GregorianCalendar(1982, Calendar.MAY, 12);
		System.out.println(convertWeekdayToString(cal.get(Calendar.DAY_OF_WEEK)));

		cal.add(Calendar.DAY_OF_MONTH, 10000);
		System.out.println(convertGregorianCalendarToString(cal));
	}

	private static String convertGregorianCalendarToString(GregorianCalendar cal)
	{
		String out = convertWeekdayToString(cal.get(Calendar.DAY_OF_WEEK));
		out += ", " + convertMonthToString(cal.get(Calendar.MONTH));
		out += " " + cal.get(Calendar.DAY_OF_MONTH);
		out += ", " + cal.get(Calendar.YEAR);
		return out;
	}

	private static String convertMonthToString(int month)
	{
		switch (month)
		{
			case Calendar.JANUARY:
				return "January";
			case Calendar.FEBRUARY:
				return "February";
			case Calendar.MARCH:
				return "March";
			case Calendar.APRIL:
				return "April";
			case Calendar.MAY:
				return "May";
			case Calendar.JUNE:
				return "June";
			case Calendar.JULY:
				return "July";
			case Calendar.AUGUST:
				return "August";
			case Calendar.SEPTEMBER:
				return "September";
			case Calendar.OCTOBER:
				return "October";
			case Calendar.NOVEMBER:
				return "November";
			case Calendar.DECEMBER:
				return "December";

			default:
				return null;
		}
	}

	private static String convertWeekdayToString(int weekday)
	{
		switch (weekday)
		{
			case Calendar.SUNDAY:
				return "Sunday";
			case Calendar.MONDAY:
				return "Monday";
			case Calendar.TUESDAY:
				return "Tuesday";
			case Calendar.WEDNESDAY:
				return "Wednesday";
			case Calendar.THURSDAY:
				return "Thursday";
			case Calendar.FRIDAY:
				return "Friday";
			case Calendar.SATURDAY:
				return "Saturday";

			default:
				return null;
		}
	}
}
