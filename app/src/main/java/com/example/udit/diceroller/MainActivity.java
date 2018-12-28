package com.example.udit.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

        private ImageView dice1,dice2;
        private Button rollButton;
        private Random myRandomNumber=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice1=findViewById(R.id.imageView);
        dice2=findViewById(R.id.imageView2);
        rollButton=findViewById(R.id.randombtn);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              rolldice();
              rolldice1();


            }
        });
    }



    private void rolldice(){

        int randNum=myRandomNumber.nextInt(6)+1;
        switch (randNum){

            case 1:
                dice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dice1.setImageResource(R.drawable.dice6);
                break;
        }

    }

private void  rolldice1(){

    int randNum=myRandomNumber.nextInt(6)+1;
    switch (randNum){
        case 1:
            dice2.setImageResource(R.drawable.dice1);
            break;
        case 2:
            dice2.setImageResource(R.drawable.dice2);
            break;
        case 3:
            dice2.setImageResource(R.drawable.dice3);
            break;
        case 4:
            dice2.setImageResource(R.drawable.dice4);
            break;
        case 5:
            dice2.setImageResource(R.drawable.dice5);
            break;
        case 6:
            dice2.setImageResource(R.drawable.dice6);
            break;
    }





}


}
