package com.in28minutes.sorting.util;

import java.util.List;

import com.in28minutes.sorting.algorithm.BubbleSort;

public class MySorterUtil {

	public List<String> sort(List<String> names) {
		BubbleSort bubblesort = new BubbleSort();
		return bubblesort.sort(names);

	}

}
