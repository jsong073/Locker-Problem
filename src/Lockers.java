/*
This program will do the following:
1. Create an array of 100 "lockers" (booleans)
2. Start with the first locker and for every locker open it
    a. Repeat step 2, except now open every second locker
    b. Repeat step a, opening every nth locker, with n increasing by 1 until n = 100
    c. If a locker is already open, then the program will close it
3. Print out the lockers that remain open
Process:
1. Create an array of booleans, set them all to false to represent closed
2. Create a nested for loop:
    a. Outer loop:
        FOR int i = 1 to 100
            Inner loop:
            FOR int j = i to 100, j+i
                IF locker[j] is closed (i.e. false) THEN
                    open it (set equal to true)
                ELSE
                    close it (set equal to false)
                ENDIF
            ENDFOR
        ENDFOR
 */

public class Lockers {
    public static void main (String[] args) {
        boolean[] isLockerOpen = new boolean[100];

        for (int i = 0; i < isLockerOpen.length; i++) {
            isLockerOpen[i] = false;
        }

        for (int i = 1; i <= isLockerOpen.length; i++) {
            for (int j = (i - 1); j < isLockerOpen.length; j+= i) {
                if (isLockerOpen[j] == false) {
                    isLockerOpen[j] = true;
                } else {
                    isLockerOpen[j] = false;
                }
            }
        }

        for (int i = 0; i < isLockerOpen.length; i++) {
            System.out.print(isLockerOpen[i] + " ");
            if (i % 9 == 0 && i != 0) {
                System.out.println();
            }
        }

    }
}
