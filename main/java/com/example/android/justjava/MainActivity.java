package com.example.android.justjava;





import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;

import android.widget.TextView;

import java.text.NumberFormat;


/**

 * This app displays an order form to order coffee.

 */

public class MainActivity extends AppCompatActivity {
    int amount=0;
    int price=0;
    String message="Total:  "+this.price+"\nThank You!";

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }
    public void add(View view){
        this.amount+=1;
        display();
    }
    public void subtract(View view){
        this.amount-=1;
        display();
    }
    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {
        this.price=this.amount*5;

        displayPrice();

    }


    /**
     * This method displays the given quantity value on the screen.
     */

    private void display() {

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);

        quantityTextView.setText("" + this.amount);

    }
    private void displayMessage(String message) {

        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);

        priceTextView.setText(message);

    }

    /**

     * This method displays the given price on the screen.

     */

    private void displayPrice() {
        message="Total:  "+NumberFormat.getCurrencyInstance().format(this.price)+"\nThank You!";

        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);

        priceTextView.setText(message);

    }
}


