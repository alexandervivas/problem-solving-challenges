import java.util.HashMap;

public class SockMerchant {

    public static void main(String[] args) {
        System.out.println(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }

    private static int sockMerchant(int n, int[] ar) {
        final HashMap<Integer, Integer> socksByColor = new HashMap<>();
        for (int i = 0 ; i < n; i++) {
            int color = ar[i];

            if (socksByColor.containsKey(color)) {
                int currentSocks = socksByColor.get(color);
                socksByColor.put(color, currentSocks + 1);
            } else {
                socksByColor.put(color, 1);
            }
        }

        int numOfPairs = 0;
        for (Integer numOfSocks : socksByColor.values()) {
            numOfPairs += numOfSocks/2;
        }
        return numOfPairs;
    }
}