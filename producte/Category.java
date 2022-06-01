package producte;

public enum Category {
    FOOD ("Thực Phẩm"), HOUSEWARE("Đồ Gia Dụng"),COSMETICS("Mỹ Phẩm"), FASHION("Thời Trang");
    private String value;

    private Category(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
}
