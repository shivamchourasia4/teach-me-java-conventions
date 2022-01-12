public class PowerFinder {
    public static int powerOf(int num, int toPower) {
        int numRaisedToPower = 1;
        for (int i = 0; i < toPower; i++) {
            numRaisedToPower *= num;
        }
        return numRaisedToPower;
    }
}