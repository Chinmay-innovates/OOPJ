import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try {
            RandomAccessFile f = new RandomAccessFile("./data.txt", "rw");
            String data1 = "Hello";
            String data2 = "World";
            f.writeUTF(data1);
            f.writeUTF(data2);
            f.seek(0);

            String readData1 = f.readUTF();
            String readData2 = f.readUTF();

            System.out.println("Data read from file:");
            System.out.println(readData1);
            System.out.println(readData2);
            f.seek(f.length());

            String newData = "Java!";
            f.writeUTF(newData);
            f.seek(0);

            readData1 = f.readUTF();
            readData2 = f.readUTF();
            String readData3 = f.readUTF();
            System.out.println("Data read from file after appending:");
            System.out.println(readData1);
            System.out.println(readData2);
            System.out.println(readData3);
            f.close();

        } catch (IOException e) {
            System.out.println("An Error occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
