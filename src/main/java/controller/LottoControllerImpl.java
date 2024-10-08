package controller;

import model.lotto.Lotto;
import model.service.LottoService;
import view.LottoInput;
import view.LottoOutput;

public class LottoControllerImpl implements LottoController {
    private final LottoInput lottoInput;
    private final LottoOutput lottoOutput;
    private final LottoService lottoService;

    public LottoControllerImpl(LottoInput lottoInput, LottoOutput lottoOutput, LottoService lottoService) {
        this.lottoInput = lottoInput;
        this.lottoOutput = lottoOutput;
        this.lottoService = lottoService;
    }

    @Override
    public void run() {
        int inputMoney = lottoInput.getInputMoney();
        lottoService.printLotto(inputMoney);
        Lotto targetLotto = lottoInput.inputNumber();
        int bonusNumber = lottoInput.getBonusNumber();
        lottoService.lottoCompare(targetLotto, bonusNumber);
        lottoOutput.resultPrint(inputMoney);
    }
}
