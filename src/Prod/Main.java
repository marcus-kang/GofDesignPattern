package Prod;

import AbstractFactory.*;
import Concrete.FactoryInstance;

public class Main {
    public static void main(String[] args) {
        Abst2();
    }

    private static void Abst1(){
        BikeFactory factory = new ProdFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }

    private static void Abst2(){

        GuiFactory fac = FactoryInstance.getGuiFactory();
        //GuiFactory fac = new LinuxGuiFactory();

        Button button = fac.createButton();
        TextArea area = fac.createTextArea();

        button.click();
        System.out.println(area.getText());
    }
}
