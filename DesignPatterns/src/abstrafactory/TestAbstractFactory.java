package abstrafactory;

/**
 * Created by Alasad on 2016/3/21.
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory unixFactory = new UnixFactory();
        AbstractButton unixBtn = unixFactory.createButton();
        AbstractText unixText = unixFactory.createText();
        unixBtn.click();
        unixText.edit();

        AbstractFactory winFactory = new WinFactory();
        AbstractButton winBtn = winFactory.createButton();
        AbstractText winText = winFactory.createText();
        winBtn.click();
        winText.edit();
    }
}
