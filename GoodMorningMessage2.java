package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodMorningMessage2 {
    private static String getGoodMorningMessage(String to) {
        String from = null;

        if (("김혜림").equals(to)) {
            from = "이진욱";
        } else if (("김주아").equals(to)) {
            from = "박보검";
        }

        if (from != null) {
            return String.format("%s : %s 굿모닝!", from, to);
        }

        throw new IllegalArgumentException(String.format("%s는 인사해줄 사람이 없습니다ㅜ.ㅠ", to));
    }

    public static void main(String[] args) {
        String to = null;
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        for (to = sc.nextLine(); !"exit".equals(to); to = sc.nextLine()) {
            try {
                System.out.println(getGoodMorningMessage(to));
                list.add(getGoodMorningMessage(to));

            } catch (Exception e) {
                System.out.println(e.getMessage());
                list.add(e.getMessage());
            }
        }
        list.forEach((result) -> System.out.println(result));
    }
}