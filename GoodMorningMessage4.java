package homework;

import java.util.*;

/**
 * 과제4 : 저 커플을 효율적으로 처리할 수  있는 자료구조를 사용하도록 수정하세요
 * 맵을 쓰는 이유 : 커플이 100만개 있다고 가정했을 때 내가 지금 찾으려는 애가 90만번째라면,
 * 리스트는 0번째 인덱스부터 하나씩 확인하면서 90만번을 돌아야 하는거고
 * 맵은 그냥 바로 90만번째 애 꺼내오기 때문이지!
 * 리스트로 할 때는 엘리먼트가 n개면 n개 만큼 확인해야 하는데 맵은 그 놈 딱 타겟팅 해서 꺼내옴
 **/
class GoodMorningMessage4 {
    // HashMap 은 Map 인터페이스를 구현한 함수
    // 데이터의 저장은 key, value 형태(key : 중복 놉, value : 중복 가능)
    static Map<String, String> map = new HashMap<>();

    private static String getGoodMorningMessage(String to) {
        // HashMap 에서 값을 가져오는 방법
        // 저장할때 key 값을 저장하기 때문에 get() 함수의 인수로 찾고 싶은 key 값을 넘기면 됨
        String from = map.get(to);
        if(from != null){
            return String.format("%s : %s 굿모닝!", from, to);
        }
        throw new IllegalArgumentException(String.format("%s는 인사해줄 사람이 없습니다ㅜ.ㅠ", to));
    }

    public static void main(String[] args) {
        // put() : 데이터 넣기
        map.put("김혜림", "이진욱");
        map.put("김주아", "박보검");

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
