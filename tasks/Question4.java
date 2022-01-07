import java.util.Arrays;
import java.util.Collections;

class Question4 {
    public int[] reverse(int[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }
}