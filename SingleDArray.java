public class SingleDArray {
    public static void main(String[] args) {
        int marks[] = new int[6];
        marks[0] = 34;
        marks[1] = 44;
        marks[2] = 54;
        marks[3] = 64;
        marks[4] = 74;
        marks[5] = 84;
        int marks2[] = { 123, 435, 54, 654, 324, 544, 363 };
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
        System.out.println("marks2");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks2[i]);

        }
    }
}
