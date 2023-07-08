package oceanOfCode;

import java.util.*;

// Time Complexity = O(n)

public class ProgramForFindingDuplicateNumbersFromIntList {
	
	static List<Integer> findDuplicate(List<Integer> list) {
		if (list == null) {
			return new ArrayList<Integer>();
		}
		Set<Integer> set = new HashSet<>();
		return list.stream().filter(x -> !set.add(x)).toList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(5,1,2,3,4,5,6,7,3,2,8,9,10,9);
		System.out.println(findDuplicate(list));
	}

}
