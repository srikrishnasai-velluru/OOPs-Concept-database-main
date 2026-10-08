interface Father {

    void bike();
}

interface Mother {

    void car();
}

class Son implements Father, Mother {

    public void bike() {
        System.out.println("Father has a bike");
    }

    public void car() {
        System.out.println("Mother has a car");
    }

    void house() {
        System.out.println("Son has a house");
    }
}

public class MultipleInterface {

    public static void main(String[] args) {

        Son obj = new Son();

        obj.bike();
        obj.car();
        obj.house();
    }
}