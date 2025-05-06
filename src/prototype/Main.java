package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(1, 1, 3);
        Circle circle2 = circle1.copy();

        System.out.println(circle1.getX() + ", "
                + circle1.getY() + ", "
                + circle1.getR());

        System.out.println(circle2.getX() + ", "
                + circle2.getY() + ", "
                + circle2.getR());

        Cat navi = new Cat();
        navi.setName("navi");
        navi.setAge(new Age(2022, 3));

        Cat yo = navi.copy();
        yo.setName("yo");
        //yo.setAge(new Age(2023, 2));
        yo.getAge().setYear(2023);
        yo.getAge().setValue(2);

        System.out.println(navi.getName());
        System.out.println(yo.getName());

        System.out.println(navi.getAge().getYear());
        System.out.println(yo.getAge().getYear());

        System.out.println(navi.getAge().getValue());
        System.out.println(yo.getAge().getValue());
    }
}
