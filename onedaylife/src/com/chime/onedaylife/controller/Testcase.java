package com.chime.onedaylife.controller;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 
 * 로또 예제를 활용한 알고리즘 테스트
 * 
 * @author 곽채화
 *
 */
public class Testcase {

	public static void main(String[] args) {

		final int MAX_NUM = 6; // 셋트당 로또 추출번호 갯수
		final int[] MATCH_NUM = { 1, 5, 6, 34, 38, 45 }; // 당첨 번호
		final int MAX_COUNT = 10000; // 최대 반복 횟수 

		int[] lottoNum = new int[MAX_NUM];
		
		int[] totMatchNum = {0,0,0,0,0,0};

		
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < MAX_COUNT; i++) {

			lottoNum = lottoNumGenerator(lottoNum);

			lottoNumPrint(lottoNum);

		
			// 로또번호 당첨 확인
			int matchNum = 0;

			for (int j = 0; j < lottoNum.length; j++) {
				for (int k = 0; k < lottoNum.length; k++) {
					if (lottoNum[j] == MATCH_NUM[k]) { // 일치 숫자 발견
						//matchNum++;
						totMatchNum[matchNum++]++;
						break;
					} 
				}
			}
			
			System.out.println("==>" + matchNum + "개 일치");
		}
		
		
		long end = System.currentTimeMillis();
		
		// 요약 정보
		
		Date d = new Date(); 
		String currentDate = d.toString();
		DecimalFormat df = new DecimalFormat("#,##0");
		
		int deadNum = 0; 
		
		System.out.println("===================================================");
		System.out.println("Current Date : " + currentDate);
		System.out.println("Elapsed Time : " + (end - start)/1000.0 + "sec");
		System.out.println("cost : " + df.format(MAX_COUNT * 1000) + "원");
		System.out.println("===================================================");
		for (int j = 0; j < totMatchNum.length; j++) {
			System.out.println((j+1) + "개 일치 : " + totMatchNum[j] );
			
			deadNum += totMatchNum[j]; 
		}
		System.out.println("0개 일치 : " + (MAX_COUNT - deadNum) );
		System.out.println("===================================================");
	}

	/**
	 * 
	 * 로또 번호 출력
	 * 
	 * @param lottoNum
	 */
	private static void lottoNumPrint(int[] lottoNum) {
		// 로또 번호 출력
		for (int j : lottoNum) {
			System.out.print(j + " ");
		}
		// System.out.println();
	}

	/**
	 * Lotto 번호 생성
	 * 
	 * @param lottoNum
	 * @return
	 */
	private static int[] lottoNumGenerator(int[] lottoNum) {
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int) (Math.random() * 45 + 1);

			// 중복 숫자 생기지 않도록 처리
			for (int j = 0; j < i; j++) {
				if (lottoNum[j] == lottoNum[i]) {
					i--;
				}
			}
		}

		// 올림차순 정렬
		Arrays.sort(lottoNum);
		return lottoNum;
	}

}
