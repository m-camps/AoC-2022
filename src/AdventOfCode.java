import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class AdventOfCode {

	private static List<Object> days = new ArrayList<Object>(){{
		add(new Day1());
		add(new Day2());
	}};
    public static void main(String[] args) throws Exception {
		selectDay("Day2");
		if (true)
			printAllDays();
    }

	private static void selectDay(String day) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (int i = 0; i < days.size(); i++)
		{
			String name = days.get(i).getClass().getName();
			if (name == day)
				days.get(i).getClass().getMethod("solve").invoke(days.get(i));
		}
	}

	private static void printAllDays() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (int i = 0; i < days.size(); i++)
		{
			selectDay(days.get(i).getClass().getName());
		}
	}
}

