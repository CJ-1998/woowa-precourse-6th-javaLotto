package lotto.domain;

import lotto.model.Lottos;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LottoRepositoryTest {

    LottoRepository lottoRepository = new LottoRepository();

    @ParameterizedTest
    @CsvSource(value = {"1, 1", "6, 6", "9, 9"})
    @DisplayName("로또 개수만큼 로또 생성 테스트")
    void 로또_개수만큼_로또_생성_테스트(int actual, int expected) {
        Lottos lottos = lottoRepository.makeLottos(actual);

        int lottoSize = lottos.size();

        Assertions.assertThat(lottoSize).isEqualTo(expected);
    }
}