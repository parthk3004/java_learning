package dulicate;

import java.util.Scanner;

public class dulicate {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char c;
        System.out.println("1. Count the number of Duplicates");
        System.out.println("2. Facebook likes");
        System.out.println("3.  highest possible number");
        System.out.println("4. odd number of times");
        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        do {
            switch(ch) {
                case 1:
                    break;
                case 2 : {
                    FacebookLikes fb = new FacebookLikes();
                    System.out.print("enter length of string array to input");
                    int l = sc.nextInt();
                    String likes[] = new String[l];
                    for(int i=0;i<l;i++) {
                        System.out.print("enter element in array : ");
                        likes[i] = sc.next();
                    }
                    String result = fb.likes(likes);
                    System.out.println(result);
                    break;
                }
                case 3 : {
                    HighestPossibleNumber hpn = new HighestPossibleNumber();
                    System.out.print("enter any number : ");
                    int num = sc.nextInt();
                    int result = hpn.conversion(num);
                    System.out.println("Number after conversion : "+result);
                }
                default : System.out.println("invalid choice");
            }
            System.out.println("Do you like to continue : ");
            c = sc.next().charAt(0);


        }
        while(c=='y');
    }

}