import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Question1 {
    public static void main(String[] a){
        List<String> input = new ArrayList<String>();
        for (String s :a) {
            input.add(s);
        }
        String [] input2 =  input.toArray(new String[0]);
        List<String> values = sortValues(input2);
        System.out.print(values);
    }

    public static List<String> sortValues( String[] a) {
        Arrays.sort(a);
        return Arrays.asList(a);
    }

}