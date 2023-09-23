package inheritance;

class Parentclass {
    Parentclass() {
        System.out.println("Constructor of parent");
    }
}

class JavaExample extends Parentclass {
    JavaExample() {
        System.out.println("Constructor of Child");
    }

    public static void main(String[] args) {
        new JavaExample();
    }
}
