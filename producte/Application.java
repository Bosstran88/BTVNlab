package producte;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception{
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);

        int choose;
        do {
            Menu.mainMenu();
            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Danh Sách Sản Phẩm");
                    repository.show();
                    break;
                case 2:
                    System.out.println("Các sản phẩm có giá trên 10000:");
                    repository.filterProductByPrice();
                    break;
                case 3:
                    repository.countProductByAmountSale();
                    System.out.println("Sản phẩm có số lượng từ ̀50 trở lên :");
                    break;
                case 4:
                    repository.listProductByCategory();
                    System.out.println("Bạn chọn loại sản phẩm nào: ");
                    break;
                case 5:

                case 6:
                    repository.bestSellingProduct();
                    System.out.println("Sản phẩm bán được nhiều nhất:");

                    break;
                case 7:
                    repository.sortProductByName();
                    System.out.println("Sản phẩm sau khi sắp xếp");
                    repository.show();
                    break;
            }
        }while (choose!= 0);



    }
}
