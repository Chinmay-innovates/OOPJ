
// Contructor overloading
public class Sum {
    int a, b, c;
    

    Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Sum(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void display() {
        System.out.println("sum is " + (a + b + c));
    }

    public static void main(String[] args) {
        Sum s1 = new Sum(10, 12);
        Sum s2 = new Sum(13, 2, 3);
        s1.display();
        s2.display();

    }
}
