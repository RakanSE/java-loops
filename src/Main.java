import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

// Q1

        int num = 1;

        while (num <= 100){

            System.out.println(num);
            ++num;

            if (num % 5 == 0 && num % 3 ==0){
                System.out.println(num+ " FizzBuzz");

            }
            else if (num % 5 == 0) {
                System.out.println(num + " Buzz");

            }
            else if ( num % 3 ==0) {
                System.out.println(num + " Fizz");

            }

        }
        System.out.println("-------------------------------------");

// Q 2

        System.out.print("Enter the sentences: ");
        String snt = in.nextLine();

        String rev = "";

        for (int i = snt.length() - 1; i >= 0; i--){
            rev = rev + snt.charAt(i);

        }
        System.out.println("Revers String: "+ rev);

        System.out.println("-------------------------------------");

// Q 3

        System.out.print("Enter the number: ");
        int nmb = in.nextInt();

        int fct = 1;

        for (int z = 1; z <= nmb; z++ ){
            fct = fct * z;
        }
        System.out.println("Factorial of number is: " +fct);

        System.out.println("-------------------------------------");

// Q 4

        System.out.print("Enter the base number: ");
        int bnm = in.nextInt();

        System.out.print("Enter the exp number: ");
        int exn = in.nextInt();

        int res = 1;

        for (int k = 1; k <= exn; ++k) {
            res = res * bnm;
        }
        System.out.println("The result is: " + res);

        System.out.println("-------------------------------------");


 // Q 5

        int evenSum = 0;
        int oddSum = 0;

        while (true){
            System.out.print("Enter number or - 1 to exite: ");
            int n = in.nextInt();

            if (n == -1){
                break;
            }
            else if (n % 2 == 0){
                evenSum = evenSum + n;
            }
            else {
                oddSum = oddSum + n;
            }
        }
        System.out.println("The sum of even numbers: " + evenSum);
        System.out.println("The sum of odd numbers: " + oddSum);

        System.out.println("-------------------------------------");


// Q6

        System.out.print("Enter the number: ");
        int nmbr = in.nextInt();

        int count = 0;

        for (int j = 1; j <=nmbr; j++){

            if (nmbr % j == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("The number is Prime");
        }
        else {
            System.out.println("The number not prime");
        }
        System.out.println("-------------------------------------");


// Q7

        for (int w = 1; w <= 4; w++){

            System.out.println("Week " + w);

            for (int d = 1; d <=7; d++){
                System.out.println("Day "+ d);
            }
        }
        System.out.println("-------------------------------------");


// Q 8

        System.out.print("Enter the word: ");
        in.nextLine();
        String word = in.nextLine();

        String rev2 = "";

        for (int g = word.length() -1; g >= 0; g--){
            rev2 = rev2 + word.charAt(g);
        }
        if (word.equals(rev2)){
            System.out.println("This word is Palindrome");
        }
        else {
            System.out.println("This word is not palindrome");
        }
    }
}