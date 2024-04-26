

class Bank { // SUPERCLASS Bank
    int getRateOfInterest() {
        return 0;
    }
}

class ABC extends Bank { // SUBCLASS ABC
    int getRateOfInterest() {
        return 8;
    }
}

class DEF extends Bank { // SUBCLASS DEF
    int getRateOfInterest() {
        return 7;
    }
}

class GHI extends Bank { // SUBCLASS GHI
    int getRateOfInterest() {
        return 9;
    }
}

class Main {
    public static void main(String args[]) {
        Bank b1 = new ABC();
        Bank b2 = new DEF();
        Bank b3 = new GHI();
        System.out.println("ABC interest rate: " + b1.getRateOfInterest());
        System.out.println("DEF interest rate: " + b2.getRateOfInterest());
        System.out.println("GHI interest rate: " + b3.getRateOfInterest());
    }
}
