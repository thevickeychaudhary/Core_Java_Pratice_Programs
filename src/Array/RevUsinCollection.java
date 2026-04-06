package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RevUsinCollection {

	public static void main(String args[]) {
		Integer[] arr = { 89, 67, 55, 987, 9, 56 };
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(Arrays.toString(arr));

	}

}
