package com.waylau.spring.boot.blog.controller;

public class BubbleSort {
	public static void main(String[] args) {

		int[] array = { 12, 34, 23, 56, 72, 56, 78 };
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {// -1为了防止溢出
				if (array[j] > array[j + 1]) {
					int temp = array[j];

					array[j] = array[j + 1];

					array[j + 1] = temp;
				}
			}
			System.out.println("冒泡排序："+ array[i]);
		}
		
	}

}
