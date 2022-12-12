package mx.com.app.advanteofcode.day1;


import java.io.IOException;
import java.util.Arrays;
import java.util.stream.LongStream;

import mx.com.app.advanteofcode.util.ReadFilesUtils;

public class Day1 {

	public static void main(String[] args) throws IOException {
		
		Day1 day = new Day1();
		day.solution();

	}

	public void solution() throws IOException {
		day();
		Long i = input().max().getAsLong();
		System.out.println(i);

	}

	protected String day() {
		return ReadFilesUtils.getResourceAsString("day1/day1-input/day1.txt");
	}

	private LongStream input() {
		return Arrays.stream(day().split("\n\n"))
				.mapToLong(s -> Arrays.stream(s.split("\n")).map(String::trim).mapToLong(Long::parseLong).sum());
	}

	
}
