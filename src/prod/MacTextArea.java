package prod;

import abstractFactory.TextArea;

public class MacTextArea implements TextArea {
    @Override
    public String getText() {
        return "맥 텍스트";
    }
}
