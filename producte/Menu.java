package producte;

public class Menu {
    public static void mainMenu(){
        System.out.println("1- Xem thông tin sản phẩm");
        System.out.println("2- In thông tin sản phẩm có giá trị trên 10.000");
        System.out.println("3- Đếm số sản phẩm có số lượng từ 50 trở lên");
        System.out.println("4- Liệt kê sản phẩm dựa trên loại sản phẩm");
        System.out.println("5- Sắp xếp sản phẩm theo số lượng bán được");
        System.out.println("6- Đưa ra sản phẩm bán được nhiều nhất");
        System.out.println("7- Sắp xếp sản phẩm theo tên");
        System.out.println("0- Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void chooseCategory(){
        System.out.println("1- Thực phẩm");
        System.out.println("2- Đồ gia dụng");
        System.out.println("3- Mỹ Phầm");
        System.out.println("4- Thời trang");
    }

    public static void secondMenu(){
        System.out.println("1- Sửa thông tin sản phẩm");
        System.out.println("2- Xóa sản phẩm");
        System.out.println("0- Quay lại trang chủ");
        System.out.println("Lựa chọn của bạn là: ");

    }

}
