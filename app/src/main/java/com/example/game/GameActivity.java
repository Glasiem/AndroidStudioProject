package com.example.game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GameActivity extends AppCompatActivity {

    @BindView(R.id.congrats)
    TextView congrats;

    public void deactivate(){
        b11.setEnabled(false);
        b11.setVisibility(View.INVISIBLE);
        b12.setEnabled(false);
        b12.setVisibility(View.INVISIBLE);
        b13.setEnabled(false);
        b13.setVisibility(View.INVISIBLE);
        b21.setEnabled(false);
        b21.setVisibility(View.INVISIBLE);
        b22.setEnabled(false);
        b22.setVisibility(View.INVISIBLE);
        b23.setEnabled(false);
        b23.setVisibility(View.INVISIBLE);
        b31.setEnabled(false);
        b31.setVisibility(View.INVISIBLE);
        b32.setEnabled(false);
        b32.setVisibility(View.INVISIBLE);
        b33.setEnabled(false);
        b33.setVisibility(View.INVISIBLE);
    }

    public void win(){
        deactivate();
        congrats.setText(lang.equals("EN")? "YOU WON!": "ПЕРЕМОГА!");
        congrats.setVisibility(View.VISIBLE);
    }

    public void loose(){
        deactivate();
        congrats.setText(lang.equals("EN")? "YOU LOST...": "ПОРАЗКА...");
        congrats.setVisibility(View.VISIBLE);
    }

    public int bot_action(int i){
        switch(i){
            case 1:
                if (t11.getText().equals(".")) {
                    b11.setEnabled(false);
                    b11.setVisibility(View.INVISIBLE);
                    t11.setText(symb.equals("symbX") ? "0" : "X");
                    t11.setVisibility(View.VISIBLE);
                    line[1]--; line[4]--; line[7]--;
                    return 1;
                } else if (t21.getText().equals(".")) {
                    b21.setEnabled(false);
                    b21.setVisibility(View.INVISIBLE);
                    t21.setText(symb.equals("symbX") ? "0" : "X");
                    t21.setVisibility(View.VISIBLE);
                    line[1]--; line[5]--;
                    return 1;
                } else if (t31.getText().equals(".")){
                    b31.setEnabled(false);
                    b31.setVisibility(View.INVISIBLE);
                    t31.setText(symb.equals("symbX") ? "0" : "X");
                    t31.setVisibility(View.VISIBLE);
                    line[1]--; line[6]--; line[8]--;
                    return 1;
                }
                return 0;
            case 2:
                if (t12.getText().equals(".")) {
                    b12.setEnabled(false);
                    b12.setVisibility(View.INVISIBLE);
                    t12.setText(symb.equals("symbX") ? "0" : "X");
                    t12.setVisibility(View.VISIBLE);
                    line[2]--; line[4]--;
                    return 1;
                } else if (t22.getText().equals(".")) {
                    b22.setEnabled(false);
                    b22.setVisibility(View.INVISIBLE);
                    t22.setText(symb.equals("symbX") ? "0" : "X");
                    t22.setVisibility(View.VISIBLE);
                    line[2]--; line[5]--; line[7]--; line[8]--;
                    return 1;
                } else if (t32.getText().equals(".")){
                    b32.setEnabled(false);
                    b32.setVisibility(View.INVISIBLE);
                    t32.setText(symb.equals("symbX") ? "0" : "X");
                    t32.setVisibility(View.VISIBLE);
                    line[2]--; line[6]--;
                    return 1;
                }
                return 0;
            case 3:
                if (t13.getText().equals(".")) {
                    b13.setEnabled(false);
                    b13.setVisibility(View.INVISIBLE);
                    t13.setText(symb.equals("symbX") ? "0" : "X");
                    t13.setVisibility(View.VISIBLE);
                    line[3]--; line[4]--; line[8]--;
                    return 1;
                } else if (t23.getText().equals(".")) {
                    b23.setEnabled(false);
                    b23.setVisibility(View.INVISIBLE);
                    t23.setText(symb.equals("symbX") ? "0" : "X");
                    t23.setVisibility(View.VISIBLE);
                    line[3]--; line[5]--;
                    return 1;
                } else if (t33.getText().equals(".")){
                    b33.setEnabled(false);
                    b33.setVisibility(View.INVISIBLE);
                    t33.setText(symb.equals("symbX") ? "0" : "X");
                    t33.setVisibility(View.VISIBLE);
                    line[3]--; line[6]--; line[7]--;
                    return 1;
                }
                return 0;
            case 4:
                if (t11.getText().equals(".")) {
                    b11.setEnabled(false);
                    b11.setVisibility(View.INVISIBLE);
                    t11.setText(symb.equals("symbX") ? "0" : "X");
                    t11.setVisibility(View.VISIBLE);
                    line[1]--; line[4]--; line[7]--;
                    return 1;
                } else if (t12.getText().equals(".")) {
                    b12.setEnabled(false);
                    b12.setVisibility(View.INVISIBLE);
                    t12.setText(symb.equals("symbX") ? "0" : "X");
                    t12.setVisibility(View.VISIBLE);
                    line[2]--; line[4]--;
                    return 1;
                } else if (t13.getText().equals(".")){
                    b13.setEnabled(false);
                    b13.setVisibility(View.INVISIBLE);
                    t13.setText(symb.equals("symbX") ? "0" : "X");
                    t13.setVisibility(View.VISIBLE);
                    line[3]--; line[4]--; line[8]--;
                    return 1;
                }
                return 0;
                case 5:
                if (t21.getText().equals(".")) {
                    b21.setEnabled(false);
                    b21.setVisibility(View.INVISIBLE);
                    t21.setText(symb.equals("symbX") ? "0" : "X");
                    t21.setVisibility(View.VISIBLE);
                    line[1]--; line[5]--;
                    return 1;
                } else if (t22.getText().equals(".")) {
                    b22.setEnabled(false);
                    b22.setVisibility(View.INVISIBLE);
                    t22.setText(symb.equals("symbX") ? "0" : "X");
                    t22.setVisibility(View.VISIBLE);
                    line[2]--; line[5]--; line[7]--; line[8]--;
                    return 1;
                } else if (t23.getText().equals(".")) {
                    b23.setEnabled(false);
                    b23.setVisibility(View.INVISIBLE);
                    t23.setText(symb.equals("symbX") ? "0" : "X");
                    t23.setVisibility(View.VISIBLE);
                    line[3]--; line[5]--;
                    return 1;
                }
                return 0;
                case 6:
                if (t31.getText().equals(".")) {
                    b31.setEnabled(false);
                    b31.setVisibility(View.INVISIBLE);
                    t31.setText(symb.equals("symbX") ? "0" : "X");
                    t31.setVisibility(View.VISIBLE);
                    line[1]--; line[6]--; line[8]--;
                    return 1;
                } else if (t32.getText().equals(".")) {
                    b32.setEnabled(false);
                    b32.setVisibility(View.INVISIBLE);
                    t32.setText(symb.equals("symbX") ? "0" : "X");
                    t32.setVisibility(View.VISIBLE);
                    line[2]--; line[6]--;
                    return 1;
                } else if (t33.getText().equals(".")) {
                    b33.setEnabled(false);
                    b33.setVisibility(View.INVISIBLE);
                    t33.setText(symb.equals("symbX") ? "0" : "X");
                    t33.setVisibility(View.VISIBLE);
                    line[3]--; line[6]--; line[7]--;
                    return 1;
                }
                return 0;
            case 7:
                if (t11.getText().equals(".")) {
                    b11.setEnabled(false);
                    b11.setVisibility(View.INVISIBLE);
                    t11.setText(symb.equals("symbX") ? "0" : "X");
                    t11.setVisibility(View.VISIBLE);
                    line[1]--; line[4]--; line[7]--;
                    return 1;
                } else if (t22.getText().equals(".")) {
                    b22.setEnabled(false);
                    b22.setVisibility(View.INVISIBLE);
                    t22.setText(symb.equals("symbX") ? "0" : "X");
                    t22.setVisibility(View.VISIBLE);
                    line[2]--; line[5]--; line[7]--; line[8]--;
                    return 1;
                } else if (t33.getText().equals(".")) {
                    b33.setEnabled(false);
                    b33.setVisibility(View.INVISIBLE);
                    t33.setText(symb.equals("symbX") ? "0" : "X");
                    t33.setVisibility(View.VISIBLE);
                    line[3]--; line[6]--; line[7]--;
                    return 1;
                }
                return 0;
            case 8:
                if (t13.getText().equals(".")) {
                    b13.setEnabled(false);
                    b13.setVisibility(View.INVISIBLE);
                    t13.setText(symb.equals("symbX") ? "0" : "X");
                    t13.setVisibility(View.VISIBLE);
                    line[3]--; line[4]--; line[8]--;
                    return 1;
                } else if (t22.getText().equals(".")) {
                    b22.setEnabled(false);
                    b22.setVisibility(View.INVISIBLE);
                    t22.setText(symb.equals("symbX") ? "0" : "X");
                    t22.setVisibility(View.VISIBLE);
                    line[2]--; line[5]--; line[7]--; line[8]--;
                    return 1;
                } else if (t31.getText().equals(".")){
                    b31.setEnabled(false);
                    b31.setVisibility(View.INVISIBLE);
                    t31.setText(symb.equals("symbX") ? "0" : "X");
                    t31.setVisibility(View.VISIBLE);
                    line[1]--; line[6]--; line[8]--;
                    return 1;
                }
                return 0;
        }
        return 0;
    }

    public void bot(){
        System.out.println("YES");
        for (int i = 1; i < 9; i++) {
            if (line[i] == -2){
                bot_action(i);
                return;
            }
        }
        System.out.println("1");
        for (int i = 1; i < 9; i++) {
            if (line[i] == 2){
                System.out.println(i);
                bot_action(i);
                return;
            }
        }
        System.out.println("2");
        for (int i = 1; i < 9; i++) {
            if (bot_action(i) == 1) return;
        }
        System.out.println("NO");
    }

    @BindView(R.id.game_back)
    Button back;

    @OnClick(R.id.game_back)
    public void onViewClickedBack() {
        Intent intent = new Intent(GameActivity.this,MainActivity.class);
        Bundle extras = new Bundle();
        extras.putString("symb",symb);
        extras.putString("lang",lang);
        intent.putExtras(extras);
        startActivity(intent);
        finish();
    }

    String lang = "EN";
    String symb = "symbX";

    @BindView(R.id.textView1)
    TextView t11;

    @BindView(R.id.textView2)
    TextView t12;

    @BindView(R.id.textView3)
    TextView t13;

    @BindView(R.id.textView4)
    TextView t21;

    @BindView(R.id.textView5)
    TextView t22;

    @BindView(R.id.textView6)
    TextView t23;

    @BindView(R.id.textView7)
    TextView t31;

    @BindView(R.id.textView8)
    TextView t32;

    @BindView(R.id.textView9)
    TextView t33;

    @BindView(R.id.button)
    Button b11;

    @OnClick(R.id.button)
    public void onViewClickedB11() {
        b11.setEnabled(false);
        b11.setVisibility(View.INVISIBLE);
        line[1]++; line[4]++; line[7]++;
        t11.setText(Objects.equals(symb, "symbX") ? "X" : "0");
        t11.setVisibility(View.VISIBLE);
        for (int i = 1; i < 9; i++) {
            if (line[i] == 3){
                win();
                return;
            }
        }
        bot();
        for (int i = 1; i < 9; i++) {
            if (line[i] == -3){
                loose();
            }
        }
    }

    @BindView(R.id.button2)
    Button b12;

    @OnClick(R.id.button2)
    public void onViewClickedB12() {
        b12.setEnabled(false);
        b12.setVisibility(View.INVISIBLE);
        line[2]++; line[4]++;
        t12.setText(Objects.equals(symb, "symbX") ? "X" : "0");
        t12.setVisibility(View.VISIBLE);
        for (int i = 1; i < 9; i++) {
            if (line[i] == 3){
                win();
                return;
            }
        }
        bot();
        for (int i = 1; i < 9; i++) {
            if (line[i] == -3){
                loose();
            }
        }
    }

    @BindView(R.id.button3)
    Button b13;

    @OnClick(R.id.button3)
    public void onViewClickedB13() {
        b13.setEnabled(false);
        b13.setVisibility(View.INVISIBLE);
        line[3]++; line[4]++; line[8]++;
        t13.setText(Objects.equals(symb, "symbX") ? "X" : "0");
        t13.setVisibility(View.VISIBLE);
        for (int i = 1; i < 9; i++) {
            if (line[i] == 3){
                win();
                return;
            }
        }
        bot();
        for (int i = 1; i < 9; i++) {
            if (line[i] == -3){
                loose();
            }
        }
    }

    @BindView(R.id.button4)
    Button b21;

    @OnClick(R.id.button4)
    public void onViewClickedB21() {
        b21.setEnabled(false);
        b21.setVisibility(View.INVISIBLE);
        line[1]++; line[5]++;
        t21.setText(Objects.equals(symb, "symbX") ? "X" : "0");
        t21.setVisibility(View.VISIBLE);
        for (int i = 1; i < 9; i++) {
            if (line[i] == 3){
                win();
                return;
            }
        }
        bot();
        for (int i = 1; i < 9; i++) {
            if (line[i] == -3){
                loose();
            }
        }
    }

    @BindView(R.id.button5)
    Button b22;

    @OnClick(R.id.button5)
    public void onViewClickedB22() {
        b22.setEnabled(false);
        b22.setVisibility(View.INVISIBLE);
        line[2]++; line[5]++; line[7]++; line[8]++;
        t22.setText(Objects.equals(symb, "symbX") ? "X" : "0");
        t22.setVisibility(View.VISIBLE);
        for (int i = 1; i < 9; i++) {
            if (line[i] == 3){
                win();
                return;
            }
        }
        bot();
        for (int i = 1; i < 9; i++) {
            if (line[i] == -3){
                loose();
            }
        }
    }

    @BindView(R.id.button6)
    Button b23;

    @OnClick(R.id.button6)
    public void onViewClickedB23() {
        b23.setEnabled(false);
        b23.setVisibility(View.INVISIBLE);
        line[3]++; line[5]++;
        t23.setText(Objects.equals(symb, "symbX") ? "X" : "0");
        t23.setVisibility(View.VISIBLE);
        for (int i = 1; i < 9; i++) {
            if (line[i] == 3){
                win();
                return;
            }
        }
        bot();
        for (int i = 1; i < 9; i++) {
            if (line[i] == -3){
                loose();
            }
        }
    }

    @BindView(R.id.button7)
    Button b31;

    @OnClick(R.id.button7)
    public void onViewClickedB31() {
        b31.setEnabled(false);
        b31.setVisibility(View.INVISIBLE);
        line[1]++; line[6]++; line[8]++;
        t31.setText(Objects.equals(symb, "symbX") ? "X" : "0");
        t31.setVisibility(View.VISIBLE);
        for (int i = 1; i < 9; i++) {
            if (line[i] == 3){
                win();
                return;
            }
        }
        bot();
        for (int i = 1; i < 9; i++) {
            if (line[i] == -3){
                loose();
            }
        }
    }

    @BindView(R.id.button8)
    Button b32;

    @OnClick(R.id.button8)
    public void onViewClickedB32() {
        b32.setEnabled(false);
        b32.setVisibility(View.INVISIBLE);
        line[2]++; line[6]++;
        t32.setText(Objects.equals(symb, "symbX") ? "X" : "0");
        t32.setVisibility(View.VISIBLE);
        for (int i = 1; i < 9; i++) {
            if (line[i] == 3){
                win();
                return;
            }
        }
        bot();
        for (int i = 1; i < 9; i++) {
            if (line[i] == -3){
                loose();
            }
        }
    }

    @BindView(R.id.button9)
    Button b33;

    @OnClick(R.id.button9)
    public void onViewClickedB33() {
        b33.setEnabled(false);
        b33.setVisibility(View.INVISIBLE);
        line[3]++; line[6]++; line[7]++;
        t33.setText(Objects.equals(symb, "symbX") ? "X" : "0");
        t33.setVisibility(View.VISIBLE);
        for (int i = 1; i < 9; i++) {
            if (line[i] == 3){
                win();
                return;
            }
        }
        bot();
        for (int i = 1; i < 9; i++) {
            if (line[i] == -3){
                loose();
            }
        }
    }

    int[] line = new int[9];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        for (int i=1; i <= 8; i++){
            line[i] = 0;
        }
        Bundle extras = getIntent().getExtras();
        symb = extras.getString("symb");
        lang = extras.getString("lang");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_layout);
        ButterKnife.bind(this);
        if (Objects.equals(lang, "UA")) {
        }
        else {
        }
        if (Objects.equals(symb, "symb0")) {
            b22.setEnabled(false);
            b22.setVisibility(View.INVISIBLE);
            t22.setText("X");
            t22.setVisibility(View.VISIBLE);
            line[2]--; line[5]--; line[7]--; line[8]--;
        }
    }
}
