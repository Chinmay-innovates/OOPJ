public class Students {
    int id;
    String name;

    Students(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("Name is " + name + "  Id is " + id);

    }

    public static void main(String[] args) {
        Students s1 = new Students(1, "Chinmay");
        Students s2 = new Students(2, "Kavya");
        Students s3 = new Students(3,"student 3");

        s1.display();
        s2.display();
        s3.display();

    }
}
