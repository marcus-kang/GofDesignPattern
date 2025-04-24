package Prod;

import AbstractFactory.Button;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("리눅스 버튼");
    }
}
