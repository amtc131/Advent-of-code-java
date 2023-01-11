package mx.com.app.advanteofcode.day3;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mx.com.app.advanteofcode.util.ReadFilesUtils;

public class Day3 {

	public static void main(String[] args) {
		Day3 three = new Day3();
		three.solution();
	}

	public void solution() {
		input();
	}

	protected String day() {// day/day_inputs/
		return ReadFilesUtils.getResourceAsString("day/day_inputs/day3.txt");
	}

	private void input() {
		Stream<String> s = Arrays.stream(day().split("\n"));
		Long suma=s.map(m -> createArray(m))
		.map(a-> Arrays.asList(a[0].split("")).stream().filter(p -> Arrays.asList(a[1].split("")).contains(p)).map(String::new).collect(Collectors.toSet()))
		.map(u -> u.stream().map(l-> l.matches("[a-z]") ? (l.charAt(0) - 'a') + 1 : (l.charAt(0) - 'A') + 1 + 26 ).mapToLong(Long::valueOf).sum() )
		.mapToLong(Long::valueOf)
		.sum();
		
		System.out.println(suma );

	}

	public String[] createArray(String s) {
		String[] st = { s.substring(0, s.length() / 2), s.substring(s.length() / 2) };
		return st;
	}

}
