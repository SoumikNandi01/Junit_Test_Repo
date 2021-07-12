public class Calculator {


    public Calculator() {
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        int difference = a - b;
        int absoluteDifference = modulusOfDifference(difference);
        return absoluteDifference;
    }

    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }

        return result;
    }

    private int modulusOfDifference(int difference) {
        if (difference >= 0) {
            return difference;
        } else {
            return -difference;
        }
    }
}
