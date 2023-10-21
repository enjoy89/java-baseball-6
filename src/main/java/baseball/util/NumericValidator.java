package baseball.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumericValidator {

    // 서로 다른 숫자인지 검사
    private boolean isDifferentNumber(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            set.add(numbers.get(i));
        }
        return set.size() == 3;
    }

}
