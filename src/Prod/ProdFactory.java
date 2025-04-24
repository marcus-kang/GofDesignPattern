package Prod;

import AbstractFactory.BikeFactory;
import AbstractFactory.Body;
import AbstractFactory.Wheel;

public class ProdFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new ProdBody();
    }

    @Override
    public Wheel createWheel() {
        return new ProdWheel();
    }
}
