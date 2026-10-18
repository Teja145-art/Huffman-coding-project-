
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static Map<Character, Integer> countFrequencies(
            String text) {

        Map<Character, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            frequencies.put(
                    ch,
                    frequencies.getOrDefault(ch, 0) + 1);
        }

        return frequencies;
    }
}


