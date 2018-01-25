/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.hasan.coffe_order;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int valueIncrement = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayMessage(createOrderSummary());

    }

    private String createOrderSummary(){
        return "Name:Shujaat Hasan"+ "\n"+"Quantity: "+ valueIncrement+"\n"+"Total: "+ calculatePrice()+"\n"+"Thank you!";
    }

    /**
     * Calculates the price of the order.
     *@ return total price
     */
    private int calculatePrice() {
        int price = valueIncrement * 5;
        return price;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.noforders);
        quantityTextView.setText("" + number);
    }

    // Increment method for adding number of coffees

    public void increment(View view) {

        valueIncrement += 1;
        displayQuantity(valueIncrement);

    }

    // Decrement method for adding number of coffees

    public void decrement(View view) {

        if (valueIncrement > 0) {
            valueIncrement -= 1;
            displayQuantity(valueIncrement);
        } else {
            displayQuantity(0);
        }

    }


    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText(message);
    }
}