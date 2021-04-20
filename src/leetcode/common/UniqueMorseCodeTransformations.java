package leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class UniqueMorseCodeTransformations {
	public static int uniqueMorseRepresentations(String[] words) {
		String[] str = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		Map<Character, String> morseCodes = new HashMap<>();
		int i = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			morseCodes.put(c, str[i]);
			i++;
		}
		
		Set<String> transformations = new HashSet<>();
		for (String word : words) {
			StringBuffer sb = new StringBuffer();
			for (char c : word.toCharArray()) {
				sb.append(morseCodes.get(c));
			}
			transformations.add(sb.toString());
		}
		
		return transformations.size();

	}

	public static void main(String[] args) {
		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(words));
	}
}
