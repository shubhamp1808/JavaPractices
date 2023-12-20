package Arrays;

// Find number that appears once, and the others twice
public class NumbersOccurence {
    public static void main(String[] args) {
        int[] sample = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
        int n = sample.length;
        System.out.println("Once in Array is " + (oneOccurence(sample, n)));
    }

    /*
     * //Brute --> O(n^2)/O(1)
     * static int oneOccurence(int[] a, int n) {
     * for (int i = 0; i < n; i++) {
     * int num = a[i];
     * int cnt = 0;
     * for (int j = 0; j < n; j++) {
     * if (a[j] == num) {
     * cnt++;
     * }
     * }
     * if (cnt == 1) {
     * return a[i];
     * }
     * }
     * return -1;
     * }
     */

    /*
     * // Better 1 --> O(3n)/O(maxi+1)
     * // Not for negatives or very large numbers
     * static int oneOccurence(int[] a, int n) {
     * int maxi = 0;
     * for (int i = 0; i < n; i++) {
     * maxi = Math.max(maxi, a[i]);
     * }
     * 
     * int[] hash = new int[maxi + 1];
     * 
     * for (int i = 0; i < n; i++) {
     * hash[a[i]] = hash[a[i]] + 1;
     * }
     * 
     * for (int i = 0; i < n; i++) {
     * if (hash[a[i]] == 1) {
     * return a[i];
     * }
     * }
     * return -1;
     * }
     */

     /*
    // Better 2 -->  O(n*logm)+O(m)/O(m), where m is size of map i.e. (n/2)+1
    static int oneOccurence(int[] a, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int value = map.getOrDefault(a[i], 0);
            map.put(a[i], value+1);
        }
        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }  */

    // Optimal --> O(n)/O(1)
    static int oneOccurence(int[] a, int n) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ a[i];
        }
        return xor;
    }
    
}
