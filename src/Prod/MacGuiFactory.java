package Prod;

import AbstractFactory.Button;
import AbstractFactory.GuiFactory;
import AbstractFactory.TextArea;

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
