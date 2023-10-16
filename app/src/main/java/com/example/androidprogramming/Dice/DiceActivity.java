package com.example.androidprogramming.Dice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidprogramming.R;

public class DiceActivity extends AppCompatActivity {

    int random_number;

    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;
    int six = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        ImageView dice = findViewById(R.id.dice_image);

        TextView dice_count_1 = findViewById(R.id.dice_count_1);
        TextView dice_count_2 = findViewById(R.id.dice_count_2);
        TextView dice_count_3 = findViewById(R.id.dice_count_3);
        TextView dice_count_4 = findViewById(R.id.dice_count_4);
        TextView dice_count_5 = findViewById(R.id.dice_count_5);
        TextView dice_count_6 = findViewById(R.id.dice_count_6);

        Button reset = findViewById(R.id.reset_button);

        // 주사위 이미지 클릭 이벤트
        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 주사위 클릭 시 랜덤 색상 변경
                int red = (int) (Math.random() * 255);
                int green = (int) (Math.random() * 255);
                int blue = (int) (Math.random() * 255);
                dice.setColorFilter(Color.rgb(red, green, blue), PorterDuff.Mode.SRC_IN);

                // 주사위 클릭 시 1에서 6 사이의 난수 생성
                random_number = (int) (Math.random() * 6 + 1);

                // 난수에 맞는 주사위 이미지 출력, 횟수 증가 및 출력
                switch(random_number) {
                    case 1:
                        dice.setImageResource(R.drawable.dice_1);
                        one++;
                        dice_count_1.setText("1: " + one);
                        break;
                    case 2:
                        dice.setImageResource(R.drawable.dice_2);
                        two++;
                        dice_count_2.setText("2: " + two);
                        break;
                    case 3:
                        dice.setImageResource(R.drawable.dice_3);
                        three++;
                        dice_count_3.setText("3: " + three);
                        break;
                    case 4:
                        dice.setImageResource(R.drawable.dice_4);
                        four++;
                        dice_count_4.setText("4: " + four);
                        break;
                    case 5:
                        dice.setImageResource(R.drawable.dice_5);
                        five++;
                        dice_count_5.setText("5: " + five);
                        break;
                    case 6:
                        dice.setImageResource(R.drawable.dice_6);
                        six++;
                        dice_count_6.setText("6: " + six);
                        break;
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 횟수 리셋
                one = 0;
                two = 0;
                three = 0;
                four = 0;
                five = 0;
                six = 0;

                // 횟수 출력
                dice_count_1.setText("1: " + one);
                dice_count_2.setText("2: " + two);
                dice_count_3.setText("3: " + three);
                dice_count_4.setText("4: " + four);
                dice_count_5.setText("5: " + five);
                dice_count_6.setText("6: " + six);

            }
        });
    }
}


