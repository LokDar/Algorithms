public class N_2_OddIndices {
    public int[] oddIndices(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        int[] arrayOdd = new int[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                arrayOdd[count++] = array[i];
            }
        }
        return arrayOdd;
    }
}
