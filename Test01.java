package com.test;

import java.util.Scanner;

// ����1
// �Է��� ������ �¸�� �Լ��� ȣ���ؼ� �� ����� StringBuilder�� ���� ���� exit ������ StringBuilder�� �� ���� ����Ѵ�.
public class Test01 {
   
   private static String getGoodMorningMessage(String to) {
      
      String from = null;
      
      if(("������").equals(to)) {
         from = "������";
      
      } else if(("���־�").equals(to)) {
         from = "�ں���";
      
      }
        
      if(from != null) {
         return String.format("%s : %s �¸��!", from, to);
      }
      
      throw new IllegalArgumentException(String.format("%s�� �λ����� ����� �����ϴ٤�.��", to));
      
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