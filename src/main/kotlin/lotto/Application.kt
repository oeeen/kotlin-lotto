package lotto

import lotto.domain.Lotto
import lotto.domain.LottoNumber
import lotto.domain.LottoResult
import lotto.domain.LottoStore
import lotto.util.getIntegersAfterSplit
import lotto.view.InputView
import lotto.view.OutputView

fun main() {
    val purchaseAmount = InputView.getPurchaseAmount()
    val userLotto = LottoStore.purchase(purchaseAmount)
    OutputView.printLottos(userLotto)
    val lastWinningNumbers = InputView.getLastWinningNumbers()
    val bonusBall = InputView.getBonusBall()
    val winningLotto = Lotto.fromInts(lastWinningNumbers.getIntegersAfterSplit(","))
    val lottoResult = LottoResult(userLotto, winningLotto, LottoNumber(bonusBall))
    OutputView.printResult(lottoResult)
}
