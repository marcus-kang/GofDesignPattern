package Concrete;

import Framework.Item;
import Framework.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator {

    @Override
    protected void requestItemsInfo() {
        System.out.println("DB에서 체력 회복 물약 정보 가져오기");
    }

    @Override
    protected void createItemLog() {
        System.out.println("체력 회복 물약 새로 생성 " + new Date());
    }

    @Override
    protected Item createItem() {
        //작업
        return new HpPortion();
    }
}
