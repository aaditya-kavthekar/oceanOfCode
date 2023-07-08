package oceanOfCode;

import java.util.*;

// Time Complexity = O(n)

public class ProgramForFindingDistinctNumbersFromIntList {
	
	static List<Integer> distinctsSol1(List<Integer> list) {
		if (list == null) {
			return new ArrayList<Integer>();
		}
		return list.stream().distinct().toList();
	}
	
	static List<Integer> distinctsSol2(List<Integer> list) {
		if (list == null) {
			return new ArrayList<Integer>();
		}
		Set<Integer> set = new HashSet<>();
		return list.stream().filter(x -> set.add(x)).toList();
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,2,5,6,7,5,3,8,9,10);
		System.out.println(distinctsSol1(list));
		System.out.println(distinctsSol2(list));
	}

}
