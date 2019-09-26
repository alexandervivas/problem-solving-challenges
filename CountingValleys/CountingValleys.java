public class CountingValleys {

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    private static int countingValleys(int n, String s) {
        int currentLevel = 0; // Sea level
        int valleys = 0;
        for (int i = 0; i < n; i++) {
            char step = s.charAt(i);
            if (currentLevel == 0 && step == 'D') {
                valleys++;
            }

            if (step == 'D') {
                currentLevel--;
            } else {
                currentLevel++;
            }
        }

        return valleys;
    }
}