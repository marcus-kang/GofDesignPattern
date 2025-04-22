package Concrete;

import Framework.Item;

public class HpPortion implements Item {

    @Override
    public void use() {
        System.out.println("체력 회복!");
    }
}
