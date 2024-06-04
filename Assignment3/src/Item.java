public class Item {
    String name; // Name of the item
    double price; // Price of the item

   // Constructor to initialize an Item object with a name and price
   public Item(String name, double price) {
       this.name = name;
       this.price = price;
   }

   // Getter method to retrieve the name of the item
   public String getName() {
       return name;
   }

   // Getter method to retrieve the price of the item
   public double getPrice() {
       return price;
   }

   // Override the toString method to provide a string representation of the item
   @Override
   public String toString() {
       return "Item: " + name + ", Price: ₹" + price;
   }
}
