package leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongPair60 {
	 public static int pairCount(int[] songs) {
		 int count = 0;
		 List<Integer> visitedSongs = new ArrayList<>();
		 for(int n = 0; n < songs.length; n++) {
			 int diffRequired = 60 - (songs[n] % 60);
			 if(visitedSongs.contains(diffRequired)) {
				 count++;
				 visitedSongs.remove(Integer.valueOf(diffRequired));
			 } else {
				 visitedSongs.add(songs[n] % 60);
			 }
			 
		 }
		 return count;  
	 }
	 
	 public static void main(String[] args) {
		int[] nums = {20,40,10,90,30, 150, 30};
		System.out.println(pairCount(nums));
	}
}
