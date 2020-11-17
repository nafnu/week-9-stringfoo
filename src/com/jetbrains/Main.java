package com.jetbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do{

            System.out.print("\nPlease enter your first name\t");
            String name = scanner.next();

            System.out.print("\nPlease enter your last name\t");
            String surname = scanner.next();
            continueLoop = false;

        }while(continueLoop);
   }





    public static char encrypt(char letter){
        char [] orig =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char [] value = {'1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26'};

        char newLetter='\0';

        for (int i=0;i<orig.length;i++)
        {
            if (orig[i] == letter)
                newLetter = value[i];

            if (letter == ' ')
                newLetter = ' ';
        }

        return newLetter;
    }

}
