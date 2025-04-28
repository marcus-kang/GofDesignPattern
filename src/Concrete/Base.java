package Concrete;

import Decorator.IBeverage;

public class Base implements IBeverage {
    @Override
    public int getTotalPrice() {
        return 0;
    }
}
