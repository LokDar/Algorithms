public class N_1_OddEven {
    public String oddEven(long num) {
        if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE) {
            return "Undefined";
        } else {
            if (num % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }
    }

    public String oddEven2(long num) {
        if (num < Integer.MAX_VALUE && num > Integer.MIN_VALUE) {
            if (num % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        } else {
            return "Undefined";
        }
    }

}
