class Father {

    void bike() {
        System.out.println("Father has a bike");
    }
}

class Son extends Father {

    void car() {
        System.out.println("Son has a car");
    }
}

public class singleInheritance {

    public static void main(String[] args) {

        Son obj = new Son();

        obj.bike();   // inherited from Father
        obj.car();    // Son's own method
    }
}