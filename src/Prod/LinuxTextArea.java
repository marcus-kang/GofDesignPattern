package Prod;

import AbstractFactory.TextArea;

public class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "리눅스 텍스트";
    }
}
