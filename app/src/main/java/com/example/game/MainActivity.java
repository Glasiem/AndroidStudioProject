package com.example.game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    String lang = "EN";

    String symb = "symbX";

    @BindView(R.id.caption)
    TextView caption;

    @BindView(R.id.start)
    Button start;

    @OnClick(R.id.start)
    public void onViewClickedStart() {
        Intent intent = new Intent(MainActivity.this,GameActivity.class);
        Bundle extras = new Bundle();
        extras.putString("symb",symb);
        extras.putString("lang",lang);
        intent.putExtras(extras);
        startActivity(intent);
        finish();
    }

    @BindView(R.id.settings)
    Button settings;

    @OnClick(R.id.settings)
    public void onViewClickedSettings() {
        Intent intent = new Intent(MainActivity.this,SettingsActivity.class);
        Bundle extras = new Bundle();
        extras.putString("symb",symb);
        extras.putString("lang",lang);
        intent.putExtras(extras);
        startActivity(intent);
        finish();
    }

    @BindView(R.id.exit)
    Button exit;

    @OnClick(R.id.exit)
    public void onViewClickedExit() {
        finish();
        System.exit(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras;
        if (getIntent().getExtras() != null) {
            extras = getIntent().getExtras();
            if (extras.getString("symb") != null) symb = extras.getString("symb");
            if (extras.getString("lang") != null) lang = extras.getString("lang");
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if (Objects.equals(lang, "UA")) {
            caption.setText("Гра");
            exit.setText("Вийти");
            start.setText("Розпочати");
            settings.setText("Налаштування");
        }
        else {
            caption.setText("Game");
            exit.setText("Exit");
            start.setText("Start");
            settings.setText("Settings");

        }
    }
}