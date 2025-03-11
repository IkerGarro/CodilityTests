package codility.easy;

public class FrogJump {
    public static int solution(int X, int Y, int D) {
        //return (X+Y)/D;
        int pendingDistance = Y - X;
        int numberOfJumps = 0;
        if (pendingDistance < D) {
            numberOfJumps = 1;
        } else {
            numberOfJumps = pendingDistance / D;
            if (pendingDistance % D != 0) {
                ++numberOfJumps;
            }
        }
        return numberOfJumps;
    }
    /*
    public static int solution(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y - X) / D);
    }
     */
}
