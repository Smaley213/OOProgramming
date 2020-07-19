package by.htp.less.oop3;

import by.htp.less.oop3.Calendar.Holiday;

public class View {

	public void Views(Calendar calendar) {
		for (Holiday holiday : calendar.getHolidays()) {
			System.out.println(holiday);
		}
	}

}
