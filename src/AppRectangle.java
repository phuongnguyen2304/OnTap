public class AppRectangle {
    public static void main(String[] args) {
        CRUDRectangle crud = new CRUDRectangle();

        // 3.1: Tạo 3 đối tượng hình chữ nhật
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(8, 6);
        Rectangle rect3 = new Rectangle(15, 7);

        // 3.2: Thêm vào mảng danh sách hình chữ nhật
        crud.addRectangle(rect1);
        crud.addRectangle(rect2);
        crud.addRectangle(rect3);

        // 3.3: Lưu từng đối tượng hình chữ nhật vào file
        String filename = "rectangle.dat";
        crud.addRectangleToFile(rect1, filename);
        crud.addRectangleToFile(rect2, filename);
        crud.addRectangleToFile(rect3, filename);

        // 3.4: Hiển thị thông tin hình chữ nhật từ file
        Rectangle rectFromFile = crud.getRectangleFromFile(filename);
        System.out.println("Hình chữ nhật từ file: " + rectFromFile);

        // 3.5: Lưu mảng đối tượng hình chữ nhật vào file
        crud.addRectangleListToFile(new Rectangle[]{rect1, rect2, rect3}, "rectangles.dat");

        // 3.6: Hiển thị tất cả thông tin hình chữ nhật từ file
        Rectangle[] rectanglesFromFile = crud.getAllRectangleFromFile("rectangles.dat");
        if (rectanglesFromFile != null) {
            for (Rectangle rect : rectanglesFromFile) {
                System.out.println(rect);
            }
        }
    }
}
