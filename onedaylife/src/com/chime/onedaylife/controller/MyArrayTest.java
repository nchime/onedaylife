package com.chime.onedaylife.controller;

public class MyArrayTest {

	public static void main(String[] args) {

		MyArray arr = new MyArray(5);
		
		// MyArray 데이터 추가  
		for (int i = 0; i < 5; i++) {
			arr.add("Data" + i);
		}
	
		// 전체 데이터 출력
		System.out.println(arr);

		
		// 인덱스값으로 배열 데이터 값 구하기
		try {
			System.out.println("Get Data : " + arr.get(4));
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("요청 index가 범위밖에 있습니다");  
			// TODO 메시지 프로퍼티로 구성  
		}
		
		// 인덱스 데이터 삭제 
		arr.remove(2); 
		System.out.println(arr);		
		
		
		arr.add(2, "추가 데이터");
		System.out.println(arr);		

	
		
		
		
		
		
//		System.out.println(arr);
		
		

	}

}
