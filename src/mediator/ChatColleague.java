package mediator;

import mediatorContract.Colleague;

public class ChatColleague extends Colleague {
    @Override
    public void handle(String data) {
        System.out.println(this + "-" + data);
    }
}
