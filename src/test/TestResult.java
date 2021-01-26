package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Введите слово");
        
        String enterString = in.nextLine();
        
        boolean result = Exercise.IsPalindrome(enterString);

        System.out.println(result);
    }
}