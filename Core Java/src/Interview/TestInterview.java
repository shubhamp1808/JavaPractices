package Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestInterview {
    public static void main(String[] args) {
        int[] a = {1,2,5,3,8,2,4,6};
        findSmallest(a);
        System.out.println("****************************************************");

        int[] b = {4,3,6,2,3,1,8,6};
        findCommon(a,b);
        System.out.println("****************************************************");

        reverseArr(a);

        System.out.println("****************************************************");

        String[] s = {"Shubham", "Surbhi", "Muskaan", "Prashant", "Ruchika"};
        longestString(s);
    }

    static void findSmallest(int[] a){
        int n = Arrays.stream(a).distinct().sorted().skip(1).findFirst().orElse(0);
        System.out.println(n);
    }

    static void findCommon(int[] a, int[] b){
        List<Integer> list = Arrays.stream(a).distinct().filter(i-> Arrays.stream(b).distinct().anyMatch(j-> j==i)).boxed().collect(Collectors.toList());
        System.out.println(list);
    }

    static void reverseArr(int[] a){
        IntStream.range(0, a.length/2).forEach(i-> {
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        });

        System.out.println(Arrays.toString(a));
    }

    static void longestString(String[] s){
        int n = Arrays.stream(s).mapToInt(String::length).max().orElse(0);
        System.out.println(n);;

        System.out.println("****************************************************");

        String name = Arrays.stream(s).max(Comparator.comparingInt(String::length)).get();
        System.out.println(name);

        String name2 = Arrays.stream(s).reduce((x,y)-> x.length()>y.length() ? x : y).get();
        System.out.println(name2);
    }
}
