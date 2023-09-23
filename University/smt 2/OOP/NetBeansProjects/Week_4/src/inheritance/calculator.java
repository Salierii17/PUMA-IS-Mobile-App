package inheritance;

class calculator {
    public int add(int i, int j) {
        return i + j;
    }
};

class calcAdv extends calculator {
    public int sub(int i, int j) {
        return i - j;
    }
};

class veryAdvCalc extends calcAdv {
    public int multi(int i, int j) {
        return i * j;
    }
};

class veryveryAdvCalc extends veryAdvCalc {
    public int div(int i, int j) {
        return i / j;
    }
    }
    


class inheritanceDemo {

    public static void main(String[] args) {
        veryveryAdvCalc c2 = new veryveryAdvCalc();
        int result = c2.add(2, 3);
        int result2 = c2.sub(6, 4);
        int result3 = c2.multi(4, 4);
        int result4 = c2.div(4, 4);
        
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
