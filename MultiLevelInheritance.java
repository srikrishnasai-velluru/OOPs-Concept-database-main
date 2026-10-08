class GrandFather {

    void bike() {
        System.out.println("GrandFather has a bike");
    }
}

class Father extends GrandFather {

    void car() {
        System.out.println("Father has a car");
    }
}

class Son extends Father {

    void house() {
        System.out.println("Son has a house");
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args) {

        Son obj = new Son();

        obj.bike();    // GrandFather method
        obj.car();     // Father method
        obj.house();   // Son method
    }
}