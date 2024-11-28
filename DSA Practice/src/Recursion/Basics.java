package Recursion;

public class Basics {
    public static void main(String[] args) {
        // printName("Shubham", 0);
        // printLinearly(1, 45);
    }

    // print name 5 times
    static void printName(String name, int cnt){
        cnt++;
        System.out.println(name);
        if(cnt<5){
            printName(name, cnt);
        }
    }

    // print linearly 1 to 45
    static void printLinearly(int m, int n){
        System.out.println(m);
        m++;
        if(m<=n){
            printLinearly(m, n);
        }
    }
}
