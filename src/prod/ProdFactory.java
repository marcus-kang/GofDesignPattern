package prod;

import abstractFactory.BikeFactory;
import abstractFactory.Body;
import abstractFactory.Wheel;

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
