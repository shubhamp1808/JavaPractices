package Arrays;

// Largest element in an Array

public class LargestElement{
    public static void main(String[] args){
        int[] sample ={2,3,6,119,1,2,232,8,4,7};
        int n = sample.length;
        // mergeSort(sample, 0, n-1);
        // System.out.println(Arrays.toString(sample));
        // System.out.println("Largest element in Array is "+sample[n-1]);
        System.out.println("Largest element in Array is " + findLargestElement(sample, n));
    }

    //Optimal soln
    public static int findLargestElement(int[] a, int n){
        int largest = a[0];
        for(int i=0; i<n; i++){
            if(a[i]>=largest){
                largest=a[i];
            }
        }
        return largest;
    }

    //Brute soln
    /* 
    public static void mergeSort(int[] a, int low, int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(a, low, mid);
        mergeSort(a, mid+1, high);
        merge(a, low, mid, high);
    }

    public static void merge(int[] a, int low, int mid, int high){
        int left = low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();

        while(left<=mid && right<=high){
            if(a[left]<=a[right]){
                temp.add(a[left]);
                left++;
            }else{
                temp.add(a[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(a[left]);
            left++;
        }

        while (right<=high) {
            temp.add(a[right]);
            right++;
        }

        for(int i =low; i<=high; i++){
            a[i] = temp.get(i-low);
        }
    }  */
}