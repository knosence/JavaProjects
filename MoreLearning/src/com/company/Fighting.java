package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

public class Fighting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Attack points of Monster: ");
        int monsterAttack = scan.nextInt();
        System.out.println("Defense points of Monster: ");
        int monsterDefense = scan.nextInt();
        System.out.println("Damage of Monster: ");
        int monsterDamage = scan.nextInt();
        System.out.println("Life points of Monster: ");
        int monsterLife = scan.nextInt();

        System.out.println("Your Attack points: ");
        int yourAttack = scan.nextInt();
        System.out.println("Your Defense points: ");
        int yourDefense = scan.nextInt();
        System.out.println("Your Damage: ");
        int yourDamage = scan.nextInt();
        System.out.println("Your Life points: ");
        int yourLife = scan.nextInt();

        boolean attacker = rand.nextBoolean();
        if(attacker){
            System.out.println("You attack");
            int dice = rand.nextInt(6)+1 +rand.nextInt(6);
            int attackValue = yourAttack + dice;
            System.out.println("Rolled Values: " +dice);
            System.out.println("Your attack value: " +attackValue);
            if(attackValue > monsterDefense){
                System.out.println("Your attack was successful.");
                monsterLife = monsterLife - yourDamage;
                System.out.println("The Monster's remaining Life Points: " +monsterLife);
            }else{
                System.out.println("Your attack was not successful");
            }
        }else{
            System.out.println("Monster attacks.");
            int dice = rand.nextInt(6)+1 + rand.nextInt();
            int attackValue = monsterAttack + dice;
            System.out.println("Rolled values: "+dice);
            System.out.println("Monster's attack value: " +attackValue);
            if(attackValue > yourDefense){
                System.out.println("Monster's attack was sucessfull.");
                yourLife = yourLife - monsterDamage;
                System.out.println("Your remaining Life Points: " +yourLife);
            }else{
                System.out.println("Monster's attack was not successful.");
            }
        }
    }
}
