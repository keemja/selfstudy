package homework;

import java.util.*;

/** 과제 5 : to from 에 추가로 메시지까지 개인화(자료구조를 새로 만드는 것임)
 각각 다 다른 메시지를 출력할 수 있게 to, from, message 를 갖는 클래스를 만들면 됨 **/
class Customer {
    private String to;
    private String from;
    //private String message;

    public Customer(String to, String from) {
        this.to = to;
        this.from = from;
    }

    public String getTo() { return to; }
    public String getFrom() { return from; }
    //public String getMessage() { return message; }
}

class GoodMorningMessage5 {
    static Map<String, String> map = new HashMap<>();

    private static String getGoodMorningMessage(String to) {
        Customer customer = new Customer(to, map.get(to));

        if (customer.getFrom() != null) {
            return String.format("%s : %s 굿모닝!", customer.getFrom(), customer.getTo());
        }
        throw new IllegalArgumentException(String.format("%s는 인사해줄 사람이 없습니다ㅜ.ㅠ", customer.getTo()));
    }

    public static void main(String[] args) {
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