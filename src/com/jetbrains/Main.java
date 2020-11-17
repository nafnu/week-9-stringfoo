package com.jetbrains;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;

public class pin {

    public static char type;
    public static char[] arrayTxt1;
    public static char[] arrayTxt2;
    public static String[] encryptAccount;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        boolean continueLoop = true;

        do{

            System.out.print("\nPlease enter the first name\t");
            String name = kb.next() + kb.nextLine();
            arrayTxt1 = name.toCharArray();

            System.out.print("\nPlease enter the last name\t");
            String surname = kb.next() + kb.nextLine();
            arrayTxt2 = surname.toCharArray();


            System.out.println("The account was created under:");
            encryptAccount = new String[arrayTxt1.length];
            type='E';
            for (int i=0; i < arrayTxt1.length;i++)
            {
                encryptAccount[i] = String.valueOf(encrypt(arrayTxt1[i]));
                System.out.print(encryptAccount[i]);
                continueLoop = false;
            }
            System.out.println ();

        }while (continueLoop);
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
