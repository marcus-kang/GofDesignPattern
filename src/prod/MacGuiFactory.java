package prod;

import abstractFactory.Button;
import abstractFactory.GuiFactory;
import abstractFactory.TextArea;

public class MacGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
