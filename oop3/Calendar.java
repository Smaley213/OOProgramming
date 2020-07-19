package by.htp.less.oop3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private int year;
	private List<Holiday> holidays;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Holiday> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}

	public Calendar(int year) {
		this.year = year;
		this.holidays = new ArrayList<>();
	}

	public class Holiday {
		private LocalDate holidayDate;
		private String nameOfHoliday;

		public Holiday(LocalDate holiday, String nameOfHoliday) {
			this.holidayDate = holiday;
			this.nameOfHoliday = nameOfHoliday;
		}

		public LocalDate getHolidayDate() {
			return holidayDate;
		}

		public String getNameOfHoliday() {
			return nameOfHoliday;
		}

		@Override
		public String toString() {
			return "Holiday{" + holidayDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + " - " + nameOfHoliday
					+ '}';
		}
	}

}
