
package laptrinh.com.model;
public class CartItem {
    private int cartId;
    private int productId;
    private int categoryId;
    private String name;
    private String decription;
    private double price;
    private int quantity;
    private String unit;
    private String image;

    public CartItem() {
    }

    public CartItem(int cartId, int productId, int categoryId, String name, String decription, double price, int quantity, String unit, String image) {
        this.cartId = cartId;
        this.productId = productId;
        this.categoryId = categoryId;
        this.name = name;
        this.decription = decription;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.image = image;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
           
}
