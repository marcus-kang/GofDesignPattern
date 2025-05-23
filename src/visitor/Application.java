package visitor;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        //Visitable v1 = new VisitableA();

        ArrayList<Visitable> visitables = new ArrayList<Visitable>();
        visitables.add(new VisitableA(1));
        visitables.add(new VisitableA(2));
        visitables.add(new VisitableA(3));
        visitables.add(new VisitableA(4));
        visitables.add(new VisitableA(5));

        Visitor visitor = new VisitorA();

        for (Visitable visitable : visitables){
            visitable.accept(visitor);
        }

        System.out.println(((VisitorA) visitor).getAgeSum());
    }
}
