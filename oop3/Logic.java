package by.htp.less.oop3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Iterator;

import by.htp.less.oop3.Calendar.Holiday;

public class Logic {

	public void addWeekend(Calendar calendar, int year) {
		LocalDate date = LocalDate.of(year, 1, 1);
		while (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
			date = date.plusDays(1);
		}
		while (date.getYear() == year) {
			if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
				calendar.getHolidays().add(calendar.new Holiday(date, "Saturday"));
				date = date.plusDays(1);
			} else if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
				calendar.getHolidays().add(calendar.new Holiday(date, "Sunday"));
				date = date.plusDays(6);
			} else {
				date = date.plusDays(1);
			}
		}
	}

	public void addHoliday(Calendar calendar, LocalDate holidayDate, String nameOfHoliday) {
		calendar.getHolidays().add(calendar.new Holiday(holidayDate, nameOfHoliday));
		calendar.getHolidays()
				.sort(Comparator.comparing(Holiday::getHolidayDate).thenComparing(Holiday::getNameOfHoliday));
	}

	public Holiday removeHoliday(Calendar calendar, String nameOfHoliday) {
		Holiday removedHoliday = null;
		Iterator<Holiday> holidayIterator = calendar.getHolidays().iterator();
		while (holidayIterator.hasNext()) {
			Holiday nextHoliday = holidayIterator.next();
			if (nextHoliday.getNameOfHoliday().equals(nameOfHoliday)) {
				removedHoliday = nextHoliday;
				holidayIterator.remove();
			}
		}
		return removedHoliday;
	}


}
