import java.io.*;
import java.util.ArrayList;

public class CRUDRectangle {
    private Rectangle[] rectangleList;
    private static int numberOfRectangle = 0;

    // Constructor
    public CRUDRectangle() {
        this.rectangleList = new Rectangle[100];
        numberOfRectangle = 0;  // Chưa có hình chữ nhật nào
    }

    // 3.2: Phương thức thêm 1 hình chữ nhật vào danh sách
    public boolean addRectangle(Rectangle objRectangle) {
        if (numberOfRectangle < 100) {
            rectangleList[numberOfRectangle] = objRectangle;
            numberOfRectangle++;
            return true;
        }
        return false;
    }

    // 3.3: Phương thức lưu một hình chữ nhật vào file
    public boolean addRectangleToFile(Rectangle objRectangle, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(objRectangle);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 3.4: Phương thức trả về đối tượng hình chữ nhật từ file
    public Rectangle getRectangleFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Rectangle) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 3.5: Phương thức lưu danh sách hình chữ nhật vào file
    public boolean addRectangleListToFile(Rectangle[] listRectangle, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(listRectangle);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // 3.6: Phương thức trả về danh sách hình chữ nhật từ file
    public Rectangle[] getAllRectangleFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Rectangle[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
