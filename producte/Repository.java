package producte;

import java.util.*;

public class Repository {
    List<Product> listProducts = new ArrayList<>();

    public Repository(){

        listProducts.add(new Product("05","Thìa ăn cơm inox mạ vàng",Category.HOUSEWARE,50,8000,4));
        listProducts.add(new Product("06","Bát đựng gia vị",Category.HOUSEWARE,65,4000,44));
        listProducts.add(new Product("07","Nước hoa hồng Soothing Facical Toner simple ",Category.COSMETICS,140,92000,88));
        listProducts.add(new Product("08","Combo gội xả HAIRBURST",Category.COSMETICS,100,639000,7));
        listProducts.add(new Product("09","Tinh chất dưỡng ẩm sâu Klairs Rich Moist Soothing serum",Category.COSMETICS,50,249000,24));
        listProducts.add(new Product("10","Kem dưỡng thể Saula",Category.COSMETICS,80,715000,63));
        listProducts.add(new Product("11","Ao Thun Tship",Category.FASHION,250,320000,146));
        listProducts.add(new Product("01","Bánh Doreamon 3 vị", Category.FOOD,100,3500,57));
        listProducts.add(new Product("02","Xúc xích Sườn Non",Category.FOOD,150,3500,12));
        listProducts.add(new Product("03","Thanh Cua" ,Category.FOOD,100,5000,85));
        listProducts.add(new Product("04","Bánh Khoai Môn",Category.FOOD,200,42000,78));

    }

    public void show(){


        listProducts.forEach(product -> System.out.println(product));
    }

    public void sortProductByName(){
        listProducts.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
    }


    public void filterProductByPrice(){
        listProducts.stream()
                .filter(product -> product.getPrice() > 10000)
                .forEach(product -> System.out.println(product));
    }

    public void countProductByAmountSale(){
        long count = listProducts.stream()
                .filter(product -> product.getAmountSale() >= 50)
                .count();

        System.out.println("Số lượng bán được từ 50 trở lên là: "+ count);
    }
    public void listProductByCategory(){
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);
        int choose;
        Menu.chooseCategory();
        choose = scanner.nextInt();
        scanner.nextLine();

        if (choose ==1){
            for (Product product:
            listProducts){
                if (product.getCategory().equals(Category.FOOD)){
                    System.out.println(product);
                }
            }
        } else if (choose ==2) {
            for (Product product:listProducts){
                if (product.getCategory().equals(Category.HOUSEWARE)){
                    System.out.println(product);
                }
            }

        }else if (choose ==3){
            for (Product product: listProducts){
                if (product.getCategory().equals(Category.COSMETICS)){
                    System.out.println(product);
                }
            }
        } else if (choose ==4) {
            for (Product product:listProducts){
                if (product.getCategory().equals(Category.FASHION)){
                    System.out.println(product);
                }
            }
        }
    }

    public void bestSellingProduct(){
        List<String> product = new LinkedList<>();
        for (Product listProduct : listProducts) {
            System.out.println(listProduct);
        }
        Collections.sort(product);










    }

}
