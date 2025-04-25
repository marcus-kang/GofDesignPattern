package Bridge;

public class Main {
    public static void main(String[] args) {
        //PrintMorseCode code = new PrintMorseCode(new DefaultMCF());
        PrintMorseCode code = new PrintMorseCode(new SoundMCF());

        code.m().i().n().s().u().n().g();
    }
}
