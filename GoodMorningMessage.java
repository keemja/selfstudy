package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ����2
// �Է� ���� �״�� List�� ������ �״ٰ� exit ������ List �� �� ���Ƽ� �¸�� �Լ� ȣ���ϸ鼭 ����Ѵ�.
public class GoodMorningMessage {

	public static String getGoodMorningMessage(String to) {
		String from = null;
		String message;

		List<String> fromList = new ArrayList<String>();

		if (("������").equals(to)) {
			from = "������";

		} else if (("���־�").equals(to)) {
			from = "�ں���";

		} else if (("exit").equals(to)) {
			for (String result : fromList) {
				System.out.println(result);
			}

		}

		if (from != null) {
			message = String.format("%s : %s �¸��!", from, to);
			fromList.add(message);
			return message;
		}

		throw new IllegalArgumentException(String.format("%s�� �λ����� ����� �����ϴ٤�.��", to));
	}

	
}