package com.test;

import java.util.Scanner;

// ����2
// �Է� ���� �״�� List�� ������ �״ٰ� exit ������ List �� �� ���Ƽ� �¸�� �Լ� ȣ���ϸ鼭 ����Ѵ�.
public class Test02 {
   
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
         for(int i=1; i<=3; i++) { 
            Scanner sc = new Scanner(System.in);
            to = sc.nextLine();   
            System.out.println(getGoodMorningMessage(to));
         }
           
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
      
   }
}