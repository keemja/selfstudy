package chap11.sec13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

// 로또 번호 얻기
public class RandomExample {
    public static void main(String[] args) {
        // 선택 번호 6개가 저장될 배열 생성
        int[] selectNumber = new int[6];
        // 선택 번호를 얻기 위한 Random 객체 생성
        Random random = new Random(3);
        System.out.println("선택 번호 : ");
        for (int i = -0; i < 6; i++) {
            // 선택 번호를 얻어 배열에 저장
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        // 당첨 번호 6개가 저장될 배열 생성
        int[] winningNumber = new int[6];
        // 당첨 번호를 얻기 위한 Random 객체 생성
        random = new Random(5);
        System.out.println("당첨 번호 : ");
        for (int i = 0; i < 6; i++) {
            // 당첨 번호를 얻어 배열에 저장
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");
        }
        System.out.println();

        // 당첨 여부
        // 비교 전 정렬 시킴
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        // 배열 항목 값 비교
        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.println("당첨 여부 : ");
        if(result){
            System.out.println("1등에 당첨되셨습니다.");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }
    }
}
