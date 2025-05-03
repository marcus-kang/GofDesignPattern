package Observer;

import java.util.Observable;
import java.util.Observer;

public class Application2 {
    public static void main(String[] args) {
        Button2 button = new Button2();
        button.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(o + " is Clicked");
            }
        });

        button.onClick();
        button.onClick();
        button.onClick();
    }
}
