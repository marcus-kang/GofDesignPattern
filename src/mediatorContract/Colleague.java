package mediatorContract;

public abstract class Colleague {

    private Mediator mediator;

    public boolean join(Mediator mediator){
        if(mediator == null)
            return false;
        this.mediator = mediator;
        return mediator.addColeague(this);
    }

    public void sendData(String data){
        if(mediator != null)
            mediator.mediate(data);
    }

    abstract public void handle(String data);
}
