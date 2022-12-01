import java.util.*;

public class Day1 {
	private static List<String> data = Util.readFileAsList("data/day1.txt");
	
	public static void solve() {
		Util.printAnswers(1, part1(), part2());
	}

	private static int part1(){
		List<Integer> sumData = parseData();

		return sumData.get(sumData.size() - 1);
	}

	private static int part2(){ 
		List<Integer> sumData = parseData();
		int ret = 0;

		for (int i = sumData.size() - 3; i < sumData.size(); i++)
			ret += sumData.get(i);
		return (ret);
	}

	private static List<Integer> parseData(){
		List<Integer> ret = new ArrayList<>();
		int sum = 0;

		for (String s: data)
		{
			if (s != "")
				sum += Integer.parseInt(s);
			else
			{
				ret.add(sum);
				sum = 0;
			}	
		}
		Collections.sort(ret);
		return (ret);
	}
}
