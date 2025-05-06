package prod;

import abstractFactory.Button;
import abstractFactory.GuiFactory;
import abstractFactory.TextArea;

public class LinuxGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
