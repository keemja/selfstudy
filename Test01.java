package com.test;

import java.util.Scanner;

// 과제1
// 입력할 때마다 굿모닝 함수를 호출해서 그 결과를 StringBuilder에 붙인 다음 exit 들어오면 StringBuilder를 한 번에 출력한다.
public class Test01 {
   
   private static String getGoodMorningMessage(String to) {
      
      String from = null;
      
      if(("김혜림").equals(to)) {
         from = "이진욱";
      
      } else if(("김주아").equals(to)) {
         from = "박보검";
      
      }
        
      if(from != null) {
         return String.format("%s : %s 굿모닝!", from, to);
      }
      
      throw new IllegalArgumentException(String.format("%s는 인사해줄 사람이 없습니다ㅜ.ㅠ", to));
      
   }
   
   public static void main(String[] args) {
      
     String to;
      
     try {
         while (true) {
            Scanner sc = new Scanner(System.in);
            to = sc.nextLine();   
            System.out.println(getGoodMorningMessage(to));
         }
           
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
      

   }
}