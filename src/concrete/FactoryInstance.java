package concrete;

import abstractFactory.Button;
import abstractFactory.GuiFactory;
import abstractFactory.TextArea;

public class FactoryInstance {

    public static GuiFactory getGuiFactory() {

        switch (getOsCode()){
            case 0: return new LinuxGuiFactory();
            case 1: return new MacGuiFactory();
        }
        return null;
    }

    private static int getOsCode() {
        if(System.getProperty("os.name").equals("Mac OS X"))
            return 0;
        return 1;
    }

}

class LinuxGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}

class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("리눅스 버튼");
    }
}

class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "리눅스 텍스트";
    }
}

class MacGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}

class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("맥 버튼");
    }
}

class MacTextArea implements TextArea {
    @Override
    public String getText() {
        return "맥 텍스트";
    }
}