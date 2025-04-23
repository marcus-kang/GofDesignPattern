package Bulider02;

public class Main {
    public static void main(String[] args) {
        Computer computer = ComputerBuilder
                .startWithCpu("i7")
                //.start()
                //.setCpu("i7")
                .setRam("8g")
                .setStorage("128g ssd")
                .build();

        System.out.println(computer.toString());
    }
}
