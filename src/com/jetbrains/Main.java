package com.jetbrains;
import java.util.Scanner;

public class Main {

    private static char ch1;
    private static char ch2;
    private static int l1;
    private static int l2;
    private static int l3;

    public static void main(String[] args) {

        Pin();

    }


    public static void Pin() {

        Scanner kb = new Scanner(System.in);


        boolean continueLoop = true;

        System.out.print("\nPlease enter the first name\t");
        String name = kb.next().toUpperCase() + kb.nextLine();

        System.out.print("Please enter the last name\t");
        String surname = kb.next().toUpperCase() + kb.nextLine();

        ch1 = name.charAt(0);
        ch2 = surname.charAt(0);

        l1 = name.length();
        l2 = surname.length();
        l3 = l1 + l2;

        System.out.println("\nThe account is:" + ch1 + ch2 + "-" + l3 + "-" + nameNumber()+ "-" + surnameNumber());

    }


    public static int nameNumber() {
        int n = 0;

        if (ch1 == 'A') {
            n = 1;
        } if (ch1 == 'B') {
            n = 2;
        } if (ch1 == 'C') {
            n = 3;
        } if (ch1 == 'D') {
            n = 4;
        } if (ch1 == 'E') {
            n = 5;
        } if (ch1 == 'F') {
            n = 6;
        } if (ch1 == 'G') {
            n = 7;
        } if (ch1 == 'H') {
            n = 8;
        } if (ch1 == 'I') {
            n = 9;
        } if (ch1 == 'J') {
            n = 10;
        } if (ch1 == 'K') {
            n = 11;
        } if (ch1 == 'L') {
            n = 12;
        } if (ch1 == 'M') {
            n = 13;
        } if (ch1 == 'N') {
            n = 14;
        }if (ch1 == 'O') {
            n = 15;
        }if (ch1 == 'P') {
            n = 16;
        }if (ch1 == 'Q') {
            n = 17;
        }if (ch1 == 'R') {
            n = 18;
        }if (ch1 == 'S') {
            n = 19;
        }if (ch1 == 'T') {
            n = 20;
        }if (ch1 == 'U') {
            n = 21;
        }if (ch1 == 'V') {
            n = 22;
        }if (ch1 == 'W') {
            n = 23;
        }if (ch1 == 'X') {
            n = 24;
        }if (ch1 == 'Y') {
            n = 25;
        }if (ch1 == 'Z') {
            n = 26;
        }
        return (n);
        }

    public static int surnameNumber() {
        int m = 0;

        if (ch2 == 'A') {
            m = 1;
        } if (ch2 == 'B') {
            m = 2;
        } if (ch2 == 'C') {
            m = 3;
        } if (ch2 == 'D') {
            m = 4;
        } if (ch2 == 'E') {
            m = 5;
        } if (ch2 == 'F') {
            m = 6;
        } if (ch2 == 'G') {
            m = 7;
        } if (ch2 == 'H') {
            m = 8;
        } if (ch2 == 'I') {
            m = 9;
        } if (ch2 == 'J') {
            m = 10;
        } if (ch2 == 'K') {
            m = 11;
        } if (ch2 == 'L') {
            m = 12;
        } if (ch2 == 'M') {
            m = 13;
        } if (ch2 == 'N') {
            m = 14;
        }if (ch2 == 'O') {
            m = 15;
        }if (ch2 == 'P') {
            m = 16;
        }if (ch2 == 'Q') {
            m = 17;
        }if (ch2 == 'R') {
            m = 18;
        }if (ch2 == 'S') {
            m = 19;
        }if (ch2 == 'T') {
            m = 20;
        }if (ch2 == 'U') {
            m = 21;
        }if (ch2 == 'V') {
            m = 22;
        }if (ch2 == 'W') {
            m = 23;
        }if (ch2 == 'X') {
            m = 24;
        }if (ch2 == 'Y') {
            m = 25;
        }if (ch2 == 'Z') {
            m = 26;
        }
        return (m);
    }
}

  /*private static char PinCode() {
        boolean continueLoop;

        continueLoop = false;
    }*/


    /*public static char encrypt(char letter){
        String pin1 = new String();
        String pin2 = new String();

      char[] letterArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
      String[] numberArray = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26"};


        for (int i = 0; i < name.length(); i++) {
            if (ch1 == letterArray[i]) {
                pin1 = numberArray[i];
            }
        }

        for (int j = 0; j < surname.length(); j++) {
            if (ch2 == letterArray[j]) {
                pin2 = numberArray[j];
            }
        }
    }*/


