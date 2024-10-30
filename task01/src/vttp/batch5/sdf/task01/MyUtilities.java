package vttp.batch5.sdf.task01;

import java.util.HashMap;
import java.util.Map;


public class MyUtilities {

	public static final String[] SEASON = { "Spring", "Summer", "Fall", "Winter" };
	public static final String[] DAY = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	public static final String[] MONTH = { "January", "Febuary", "March", "April", "May",
		"June", "July", "August", "September", "October", "November", "December"
	};
	public static final String[] WEATHER = { "Clear, Few clouds, Partly cloudy, Partly cloudy", "Mist + Cloudy, Mist + Broken clouds, Mist + Few clouds, Mist",
		 "Light Snow, Light Rain + Thunderstorm + Scattered clouds, Light Rain + Scattered clouds", "Heavy Rain + Ice Pallets + Thunderstorm + Mist, Snow + Fog"
	};
	public static final String[] POSITION = { "highest", "second highest", "third highest", "fourth highest", "fifth highest" };
	public static final String[] HOLIDAY = { "a holiday", "not a holiday"};
	



	public static String toSeason(int season) {
		switch (season) {
			case 1:
			case 2:
			case 3:
			case 4:
				return SEASON[season - 1];
			default:
				return "funny season";
		}
	}

	public static String toWeekday(int weekday) {
		switch (weekday) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				return DAY[weekday - 1];
			default:
				return "incorrect day";
		}
	}

	public static String toMonth(int month) {
		switch (month) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				return MONTH[month - 1];
			default:
				return "unknown month";
		}
	}

	public static String toWeather(int weather) {
		switch (weather) {
			case 1:
			case 2:
			case 3:
			case 4:
				return WEATHER[weather - 1];
			default:
				return "abnormal weather";
		}
	}

	public static String toPosition(int position) {
		switch (position) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				return POSITION[position - 1];
			default:
				return "irrelevant position";
		}
	}

	public static String toHoliday(int holiday) {
		switch (holiday) {
			case 1:
			case 2:
				return HOLIDAY[holiday - 1];
			default:
				return "invalid holiday";
		}
	}
}
