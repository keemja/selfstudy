package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 입력 값을 그대로 List에 저장해 뒀다가 exit 들어오면 List 를 쭉 돌아서 굿모닝 함수 호출하면서 출력한다.
public class GoodMorningMessage {

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

      String to;
      List<String> list = new ArrayList<String>();

      try {
         while(true) {
            Scanner sc = new Scanner(System.in);
            to = sc.nextLine();
            
            if("exit".equals(to)) {
               for(String result : list) {
                  System.out.println(result);
               }
               break;
            }
            
            System.out.println(getGoodMorningMessage(to));
            list.add(getGoodMorningMessage(to).toString());
         }
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }

   }

}