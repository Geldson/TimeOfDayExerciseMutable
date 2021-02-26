package time_of_day;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import time_of_day.TimeOfDay;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay myTimeOfDay = new TimeOfDay(16, 7);
		assertEquals(16, myTimeOfDay.getHours());
		assertEquals(7, myTimeOfDay.getMinutes());
		assertArrayEquals(new int[] {16, 7}, myTimeOfDay.getTime());
	}

}