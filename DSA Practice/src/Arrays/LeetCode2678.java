package Arrays;

public class LeetCode2678 {
    public static void main(String[] args) {
        String[] details ={"9751302862F0693","3888560693F7262","5485983835F0649","2580974299F6042","9976672161M6561","0234451011F8013","4294552179O6482"};
        int n = details.length;
        System.out.println("Count of Age greater than 60 " + findAgeGreaterThanSixty(details));
    }

    static int findAgeGreaterThanSixty(String[] details){
        int count = 0;

        for(String detail : details){
            if(Integer.parseInt(detail.substring(11,13))>60){
                count++;
            }
        }
        return count;
    }
}