package concrete;

import decorator.AbstAdding;
import decorator.IBeverage;

public class Milk extends AbstAdding {
    public Milk(IBeverage material) {
        super(material);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+50;
    }
}
