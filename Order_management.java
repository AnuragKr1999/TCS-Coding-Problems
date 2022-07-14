/*
 * Problem Statement:

A store has different categories of products in stock as shown below.
Item Number=[101, 102, 103, 108] Price=[42, 50, 500, 40] Stock =[10, 20, 15, 16]

User Inputs two values:

Item number for item which user wish to buy
Quantity for the item entered above
If quantity is less than stock and item is available display a notification message showing Output: Total price in float with precision and 
updated stock for item after after purchase
If the quantity of stocks is less than quantity entered by the user while placing order, then Output: NO STOCK and quantity left
If user enter character as input for item number and quantity or enter item number which is not available Output: INVALID INPUT
 */

public class Order_management {
    public static void main(String[] args) {

        
        int[] itemNumber = {101, 102, 103, 108};
        int n = itemNumber.length;
        int[] price = {42, 50, 500, 40};  
        int[] stock = {10, 20, 15, 16};

        int userItem = 103;
        int userQuantity = 10;

        int i=0;
        for(i=0; i<n; i++) {
            if(itemNumber[i] == userItem) {
                break;
            }
        }

        if(i != n) { // item found in items
            if(userQuantity <= stock[i]) {
                System.out.println("Total Price: " + price[i]*userQuantity);
                stock[i] = stock[i] - userQuantity;
                System.out.println("STOCK Left: " + stock[i]);
            } else {
                System.out.println("NO STOCK");
                System.out.println("STOCK LEFT: " + stock[i]);
            }
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}
