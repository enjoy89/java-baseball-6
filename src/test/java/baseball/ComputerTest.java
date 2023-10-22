package baseball;

import baseball.model.Computer;
import baseball.util.NumericComparator;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputerTest extends NsTest {
    private Computer computer = new Computer();
    private NumericComparator comparator = new NumericComparator();

    @Test
    void 컴퓨터_숫자랜덤생성() {
        List<Integer> computerNumbers = computer.generateComputerNumbers();
        assertThat(computerNumbers.size()).isEqualTo(3);
    }

    @Test
    void 컴퓨터_숫자중복값() {
        List<Integer> computerNumbers = computer.generateComputerNumbers();
        assertThat(computerNumbers.get(0)).isNotEqualTo(computerNumbers.get(1)).isNotEqualTo(computerNumbers.get(2));
    }

    @Test
    void 숫자_비교_힌트_낫싱() {
        List<Integer> computerNumbers = Arrays.asList(7, 8, 9);
        List<Integer> playerNumbers = Arrays.asList(1, 2, 3);
        int result = comparator.getResult(playerNumbers, computerNumbers);

        assertThat(result).isEqualTo(5);
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
