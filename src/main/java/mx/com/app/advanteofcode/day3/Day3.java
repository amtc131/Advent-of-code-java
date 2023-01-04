package mx.com.app.advanteofcode.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
		return ReadFilesUtils.getResourceAsString("day3.txt");
	}

	private void input() {
		Stream<String> s = Arrays.stream(day().split("\n"));
		// i-> a[0].indexOf("Apple") ).collec
		s.map(m -> createArray(m))
		.map(a-> IntStream.range(0, a[1].length()).mapToObj(i-> binarySearch(a[0], a[1])  ).collect(Collectors.toList()) )
		.forEach(System.out::println);;

	}

	public String[] createArray(String s) {
		String[] st = { s.substring(0, s.length() / 2), s.substring(s.length() / 2) };
		return st;
	}

	public String binarySearch(String a, String key) {
		String[] arr = a.split("");
		String[] k = key.split("");
		Stack<String> s = new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
		
		for (int i = 0; i < k.length; i++) {
			if (!s.contains(k[i]) ) {
				
			}
		}
		System.out.println(s.toString());

		return "";
	}

}
// a b c d e f g h i j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26