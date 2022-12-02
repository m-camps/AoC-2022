import java.lang.reflect.Array;
import java.util.*;

public class Day2 {
	private static List<String> data = Util.readFileAsList("data/day2.txt");
	
	public static void solve() {
		Util.printAnswers(2, part1(), part2());
	}

	private static int part1(){
		int ret = 0;

		for (String s: data)
		{
			ret += parseLinePart1(s);
		}
		return (ret);
	}

	private static int part2(){ 
		int ret = 0;

		for (String s: data)
		{
			ret += parseLinePart2(s);
		}
		return (ret);
	}

	private static int parseLinePart2(String s){
		int p1 = s.charAt(0);
		int p2 = s.charAt(2);
		int ret = 0;

		if (p2 == 'X')
		{
			ret = (p1 == 'A') ? 3 : (p1 == 'B') ? 1 : 2;
		}
		else if (p2 == 'Y')
		{
			ret = (p1 == 'A') ? 1 : (p1 == 'B') ? 2 : 3;
		}
		else if (p2 == 'Z')
		{
			ret = (p1 == 'A') ? 2 : (p1 == 'B') ? 3 : 1;
		}
		ret += (p2 == 'X') ? 0 : (p2 == 'Y') ? 3 : 6;
		System.out.println(s + " " + ret);
		return ret;
	}

	private static int parseLinePart1(String s){
		int p1 = s.charAt(0);
		int p2 = s.charAt(2);
		int ret = 0;

		if (p1 == 'A')
		{
			ret = (p2 == 'X') ? 3 : (p2 == 'Y') ? 6 : 0;
		}
		else if (p1 == 'B')
		{
			ret = (p2 == 'Y') ? 3 : (p2 == 'Z') ? 6 : 0;
		}
		else if (p1 == 'C')
		{
			ret = (p2 == 'Z') ? 3 : (p2 == 'X') ? 6 : 0;
		}
		ret += (p2 == 'X') ? 1 : (p2 == 'Y') ? 2 : 3;
		return ret;
	}
}
