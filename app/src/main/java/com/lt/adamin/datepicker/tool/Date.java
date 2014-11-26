package com.lt.adamin.datepicker.tool;

import android.widget.TextView;

import com.lt.adamin.datepicker.DatePickerDialog;
import com.lt.adamin.datepicker.month.MonthMainFragement;


/*
 * Created by Alireza Afkar - 24/10/14
 */

public class Date {

	static int day;
	static int month;
	static int year;

	static TextView todayText = null;
	static TextView dayText = null;
	static TextView yearText = null;

	/*
	 * Setters
	 */
	public static void setDay(int _day) {
		day = _day;
	}

	public static void setMonth(int _month) {
		month = _month;
	}

	public static void setYear(int _year) {
		year = _year;
	}

	public static void setDayText(TextView _dayText) {
		dayText = _dayText;
	}

	public static void setTodayText(TextView _todayText) {
		todayText = _todayText;
	}

	public static void setYearText(TextView _yearText) {
		yearText = _yearText;
	}

	public static void setDate(int _year, int _month, int _day, boolean update) {
		year = _year;
		month = _month;
		day = _day;
		if (update)
			updateUI();
	}

	/*
	 * End of Setters
	 */

	/*
	 * Getters
	 */
	public static int getDay() {
		return day;
	}

	public static int getMonth() {
		return month;
	}

	public static int getYear() {
		return year;
	}

	public static TextView getDayText() {
		return dayText;
	}

	public static TextView getTodayText() {
		return todayText;
	}

	public static TextView getYearText() {
		return yearText;
	}

	/*
	 * End of Getters
	 */

	public static void updateUI() {

		DatePickerDialog.updateDisplay(year, month, day);

		try {
			MonthMainFragement.title.setText(JDF.monthNames[month - 1] + " "
					+ year);
		} catch (Exception e) {
		}
	}

}