package bridge;

public class PrintMorseCode extends MorseCode{
    public PrintMorseCode(MorseCodeFunction function) {
        super(function);
    }

    //minsung
    public PrintMorseCode m(){
        dash();dash();space();
        return this;
    }
    public PrintMorseCode i(){
        dot();dot();space();
        return this;
    }
    public PrintMorseCode n(){
        dash();dot();space();
        return this;
    }
    public PrintMorseCode s(){
        dot();dot();dot();space();
        return this;
    }
    public PrintMorseCode u(){
        dot();dot();dash();space();
        return this;
    }
    public PrintMorseCode g(){
        dash();dash();dot();space();
        return this;
    }
}
