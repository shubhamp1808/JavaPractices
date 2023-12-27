package Arrays;

/*
You are given a string X and a string containing single character Y. Your task is to find the largest distance between 
any two occurrences of the character Y in string X.
The distance is defined by the number of distinct characters between any two occurrences of character Y in string X 
(excluding whitespaces and the character being searched for).
If there is no occurrence or only one occurrence of the given character, the function should return -1.
 */

public class StringLetterSearch {
    public static void main(String[] args) {
        String sample = "my name is garnar";
        String word = "a";
        System.out.println(getDistance(sample, word));
    }

    /*
    // O(n+m)/O(m)
    static int getDistance(String x, String y) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == y.charAt(0)) {
                positions.add(i);
            }
        }

        if (positions.size() < 2) {
            return -1;
        }

        int maxDist = 0;

        for (int i = 0; i < positions.size() - 1; i++) {
            int start = positions.get(i) + 1;
            int end = positions.get(i + 1);
            int distance = end - start;
            maxDist = Math.max(maxDist, distance);
        }

        return maxDist;
    }  */

    // O(n)/O(1)
    static int getDistance(String x, String y) {
        int maxDistance = 0;
        int firstIndex = -1;
        for(int i=0; i<x.length();i++){
            if(x.charAt(i)==y.charAt(0)){
                if(firstIndex!=-1){
                    int distance = i - firstIndex;
                    maxDistance = Math.max(maxDistance, distance);
                }
                firstIndex = i;
            }
        }
        return (firstIndex==-1) ? -1 :maxDistance-1;
    }
}