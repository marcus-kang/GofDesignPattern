package Prod;

import AbstractFactory.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("맥 버튼");
    }
}
