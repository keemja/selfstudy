package homework;

import java.util.*;

/** 과제3 : 리스트 두개로 구현(굿모닝 함수에서 to와 메시지)
 * to 를 담는 리스트와 같은 순서대로 메시지를 담는 리스트
 * 그럼 저 함수에서는 to 리스트에서 해당하는 놈을 찾아서 같은 인덱스에 있는 메시지 꺼내오면 됨
 * to 에서 index 찾았으면, 그 인덱스 가지고 두 번째 리스트 바로 꺼내오면 됨
 */
class GoodMorningMessage3 {
    // 굿모닝 함수는 현재 사용자가 입력을 할 때 마다 호출되는데 그 안에서 커플 자료구조를 매번 만듦
    // 비효율적이기 때문에 리스트 생성을 전역변수로 뺌
    static List<String> toList = new ArrayList<>();
    static List<String> message = new ArrayList<>();

    private static String getGoodMorningMessage(String to) {
        // 리스트는 인덱스로 값을 접근하는 자료구조
        // 맵은 키로 값을 접근하는 자료구조

        // indexOf(Object o)는 인자로 객체를 받음. 리스트 앞쪽부터 인자와 동일한 객체가 있는지 찾으며,
        // 존재한다면 그 인덱스를 리턴함. 존재하지 않으면 -1을 리턴함
        int index = toList.indexOf(to);
        if (index != -1) {
            return String.format("%s : %s 굿모닝!", message.get(index), to);
        }
        throw new IllegalArgumentException(String.format("%s는 인사해줄 사람이 없습니다ㅜ.ㅠ", to));
    }

    public static void main(String[] args) {
        toList.add("김혜림");
        toList.add("김주아");
        message.add("이진욱");
        message.add("박보검");

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        for (String to = sc.nextLine(); !"exit".equals(to); to = sc.nextLine()) {
            try {
                String gm = getGoodMorningMessage(to);
                System.out.println(gm);
                list.add(gm);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                list.add(e.getMessage());
            }
        }
        for (String result : list) {
            System.out.println(result);
        }
    }
}
