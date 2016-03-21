package abstrafactory;

/**
 * Created by Alasad on 2016/3/21.
 */
public class UnixFactory extends AbstractFactory {
    @Override
    public AbstractButton createButton() {
        return new UnixButton();
    }

    @Override
    public AbstractText createText() {
        return new UnixText();
    }
}
