import java.util.List;

public class Utils {
    static String integersToString(List<Integer> list) {
        StringBuilder result = new StringBuilder();
        for (int x : list) {
            result.append(x);
        }
        return result.toString();
    }

    static String integersToString(Integer... digits) {
        StringBuilder result = new StringBuilder();
        for (int x : digits) {
            result.append(x);
        }
        return result.toString();
    }

}
