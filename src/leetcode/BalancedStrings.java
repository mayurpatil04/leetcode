package leetcode;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Stack;

public class BalancedStrings {
	// {}[]()
	private static boolean isBalancedBrackets(String string) {

		ArrayDeque<String> characters = new ArrayDeque<String>();
		
		Stack<Integer> stack = new Stack<Integer>();		
		for (char s : string.toCharArray()) {
		
			switch (String.valueOf(s)) {
			case "}": {
				String topElement = characters.pop();
				if (!Objects.equals(topElement, "{"))
					return false;
				break;
			}
			case "]": {
				String topElement = characters.pop();
				if (!Objects.equals(topElement, "["))
					return false;
				break;
			}
			case ")": {
				String topElement = characters.pop();
				if (!Objects.equals(topElement, "("))
					return false;
				break;
			}
			case "(": {
				characters.push(""+s);
				break;
			}
			case "{": {
				characters.push(""+s);
				break;
			}
			case "[": {
				characters.push(""+s);
				break;
			}

			default:
				return false;
			}

		}

		return characters.size() == 0;

	}

	public static void main(String[] args) {
		String input = "{}[][()";
		System.out.println("Balanced string? "+isBalancedBrackets(input));
	}
}
