package mx.com.app.advanteofcode.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import mx.com.app.advanteofcode.util.ReadFilesUtils;

public class Day2 {

	static Map<String, Integer> m = new HashMap<>();
	static {
		m.put("A", 1);
		m.put("B", 2);
		m.put("C", 3);
		m.put("X", 1);
		m.put("Y", 2);
		m.put("Z", 3);
	}

	public static void main(String[] args) {
		Day2 two = new Day2();

		two.solution();
	}

	public void solution() {
		input();
	}

	protected String day() {// day/day_inputs/
		return ReadFilesUtils.getResourceAsString("day/day_inputs/day2.txt");
	}

	private void input() {
		Stream<String> s = Arrays.stream(day().split("\n"));
		long r = s.map(g -> g.split(" "))
				.map(k -> partOne(m.getOrDefault(k[1], null), k[0].charAt(0), k[1].charAt(0) )   )
				.mapToLong(Long::valueOf)
				.sum();
		System.out.println(r);
	}

	private Integer partOne(Integer v, char first, char second) {
		int r = 0;

		if ((second == 'X' && first == 'A') || (second == 'Y' && first == 'B') || (second == 'Z' && first == 'C')) {
			r = 3;
		} else if ((second == 'X' && first == 'C') || (second == 'Y' && first == 'A')
				|| (second == 'Z' && first == 'B')) {
			r= 6;
		}
		
		return v + r;
	}
}
