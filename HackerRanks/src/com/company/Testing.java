package com.company;
import java.util.*;


public class Testing {

    public static void main(String[] args) {
        //Complete this code or write your own from scratch

        Scanner scan = new Scanner(System.in);
        Map<String, Integer> phoneBookMap = new HashMap<>();

        String input;
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            double num = scan.nextDouble();
            int number = (int) num;
            phoneBookMap.put(name, number);
        }

        for (int j = 0; j < n; j++) {
            input = scan.next();
            if(phoneBookMap.containsKey(input)) {
                System.out.println(input + "=" + phoneBookMap.get(input));
            }else{
                System.out.println("Not Found");
            }
        }

    }
}

