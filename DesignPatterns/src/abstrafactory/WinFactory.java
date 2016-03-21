package abstrafactory;

/**
 * Created by Alasad on 2016/3/21.
 */
public class WinFactory extends AbstractFactory {
    @Override
    public AbstractButton createButton() {
        return new WinButton();
    }

    @Override
    public AbstractText createText() {
        return new WinText();
    }
}
