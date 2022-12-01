import java.io.*;
import java.util.*;

public class Util {
	public static List<String>	readFileAsList(String filepath)
	{
		List<String> ret = new ArrayList<>();
		File file = new File(filepath);

		Scanner sc;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine())
				ret.add(sc.nextLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return ret;
	}

	public static void	printAnswers(int day, int part1, int part2)
	{
		System.out.println("Day" + day + " Part1: " + part1 + " Part2: " + part2);
	}
}
