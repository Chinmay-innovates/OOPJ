class Calculate {

    void add(int a, int b) {
        System.out.println("sum is " + (a + b));
    }

    void add(int a, float x) {
        System.out.println("sum is " + (a + x));
    }

    void add(int b, float x, float y) {
        System.out.println("sum is " + (b + x + y));
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        float x = 30.3F, y = 40.4F;

        Calculate c = new Calculate();
        c.add(a, b);
        c.add(a, x);
        c.add(a, y);
        c.add(b, x);
        c.add(b, y);
        c.add(b, x, y);
    }

}