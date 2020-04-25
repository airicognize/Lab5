/**
 * A class encapsulating the concept of a television set.
 * 
 * @author Jeremie Guerchon
 */
public class TV {
    String brand;
    static int price; 
    
    public TV(String newBrand, int newPrice) {
        this.brand = newBrand;
        this.price = newPrice;
    }
    
    public String toString() {
        String tvset = "\nBrand>> " + this.brand;
        tvset += "\nPrice>> " + this.price + "$";
        
        return tvset;
    }
        public boolean equals(TV tvset1)  {
            if (this.brand == tvset1.brand && this.price == tvset1.price)  {
                return true;
            } else {
                return false;
            }
                
        }
    
        public static void main(String[] args) {
            
            TV tvset1 = new TV("Samsung", 300);
    
            System.out.println(tvset1);
        }
}