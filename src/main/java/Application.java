import controller.LottoController;

public class Application {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        LottoController lottoController = appConfig.lottoController();

        lottoController.run();
    }
}
