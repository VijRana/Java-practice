package com.besant.java.intro;

public class IntegerLookup implements GenericLookup<Integer> {

	private String[] names;
	private Integer[] values;

	public Integer find(String name) {

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name))
				return values[i];
		}
		return null; // not found
	}
}
