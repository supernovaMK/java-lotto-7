package lotto.model;

import java.util.List;

public class LottoArchive {
    List<Lotto> lottos;

    public LottoArchive(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public List<Lotto> getLottos() {
        return lottos;
    }
}
