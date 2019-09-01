package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 과제2
// 입력 값을 그대로 List에 저장해 뒀다가 exit 들어오면 List 를 쭉 돌아서 굿모닝 함수 호출하면서 출력한다.
public class GoodMorningMessage {

	public static String getGoodMorningMessage(String to) {
		String from = null;
		String message;

		List<String> fromList = new ArrayList<String>();

		if (("김혜림").equals(to)) {
			from = "이진욱";

		} else if (("김주아").equals(to)) {
			from = "박보검";

		} else if (("exit").equals(to)) {
			for (String result : fromList) {
				System.out.println(result);
			}

		}

		if (from != null) {
			message = String.format("%s : %s 굿모닝!", from, to);
			fromList.add(message);
			return message;
		}

		throw new IllegalArgumentException(String.format("%s는 인사해줄 사람이 없습니다ㅜ.ㅠ", to));
	}

	
}