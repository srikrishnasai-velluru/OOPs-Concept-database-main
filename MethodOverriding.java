class Bank {

    void interest() {
        System.out.println("Bank interest rate");
    }
}

class SBI extends Bank {

    @Override
    void interest() {
        System.out.println("SBI interest rate = 7%");
    }
}

class HDFC extends Bank {

    @Override
    void interest() {
        System.out.println("HDFC interest rate = 7.5%");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Bank bank;

        bank = new SBI();
        bank.interest();

        bank = new HDFC();
        bank.interest();
    }
}