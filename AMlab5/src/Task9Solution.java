public class Task9Solution {
    public static int without2Zero(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return without2Zero(a, b - 1) + without2Zero(a - 1, b - 1);
    }
}