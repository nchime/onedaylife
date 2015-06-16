/**
 * 
 */
package com.chime.onedaylife.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chkwak
 *
 */
public class proverb {

	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1. 소트 알고리즘");
		System.out.println("================");

		// int[] boxArray = new int[10];

		int[] boxArray = { 9, 8, 7, 6, 4, 3, 5, 2, 1 };

		int temp = 0;
		
		for (int i = 0; i < boxArray.length - 1; i++) {
			for (int j = i+1; j < boxArray.length; j++) {
				if (boxArray[i] > boxArray[j]) {
					temp = boxArray[i];
					boxArray[i] = boxArray[j];
					boxArray[j] = temp;
				}
			}
		}
		
		
		for (int i = 0; i < boxArray.length; i++) {
			System.out.print(" "+boxArray[i]); 
		}

		// map과 ArrayList의 개념

		/*
		 * Map map;
		 * 
		 * List list = new ArrayList();
		 * 
		 * map = new HashMap();
		 * 
		 * map.put("국어", 100); map.put("영어", 100); map.put("수학", 60);
		 * 
		 * list.add(map); // list는 map의 배열이구나.. list.add(map); // list는 map의
		 * 배열이구나..
		 * 
		 * 
		 * System.out.println(list);
		 * 
		 * 
		 * System.out.println(list.get(1));
		 */

	}

}
