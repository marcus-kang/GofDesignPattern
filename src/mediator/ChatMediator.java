package mediator;

import mediatorContract.Colleague;
import mediatorContract.Mediator;

public class ChatMediator extends Mediator {
    @Override
    public void mediate(String data) {
        for(Colleague colleague : colleagues){
            //중재 가능성
            colleague.handle(data);
        }
    }
}
