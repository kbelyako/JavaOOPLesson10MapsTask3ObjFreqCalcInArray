//3. –ешить задачу подсчЄта повтор€ющихс€ элементов в массиве с помощью HashMap.

package com.yandex.kbelyako;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		int[] array = generateArray(10);
		Map<Integer, Integer> numbers1 = count(array);
		Set<Integer> keys1 = numbers1.keySet();
		for (Integer key : keys1) {
			System.out.println(key + " = " + numbers1.get(key) + "\t"
					+ ((numbers1.get(key) * 100.00) / array.length) + "%");
		}
		System.out.println("*********");
		String[] testArray = { "one", "two", "three", "four", "two", "five",
				"one", "one", "six", "nine" };
		Map<String, Integer> numbers2 = countAnyObjFreq(testArray);
		Set<String> keys2 = numbers2.keySet();
		for (String key : keys2) {
			System.out.println(key + " = " + numbers2.get(key) + "\t"
					+ ((numbers2.get(key) * 100.00) / testArray.length) + "%");
		}

	}

	public static int[] generateArray(int number) {
		int[] array = new int[number];
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(10);
		}
		return array;
	}

	public static <T> Map<T, Integer> countAnyObjFreq(T[] array) {
		Map<T, Integer> number = new HashMap<>();
		for (T i : array) {
			Integer element = number.get(i);
			if (element != null) {
				number.put(i, element + 1);
			} else {
				number.put(i, 1);
			}
		}
		return number;

	}

	public static Map<Integer, Integer> count(int[] array) {
		Map<Integer, Integer> number = new HashMap<>();
		for (int i : array) {
			Integer element = number.get(i);
			if (element != null) {
				number.put(i, element + 1);
			} else {
				number.put(i, 1);
			}
		}
		return number;
	}

}