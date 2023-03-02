package com.example.game;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class SettingsActivity extends AppCompatActivity {

    String lang = "EN";

    String symb = "symbX";

    @BindView(R.id.settings_caption)
    TextView settingsCaption;

    @BindView(R.id.back)
    Button back;

    @OnClick(R.id.back)
    public void onViewClickedBack() {
        Intent intent = new Intent(SettingsActivity.this,MainActivity.class);
        Bundle extras = new Bundle();
        extras.putString("symb",symb);
        extras.putString("lang",lang);
        intent.putExtras(extras);
        startActivity(intent);
        finish();
    }

    @BindView(R.id.langEN)
    Button langEN;

    @OnClick(R.id.langEN)
    public void onViewClickedLangEN() {
        lang = "EN";
        langEN.setEnabled(false);
        langUA.setEnabled(true);
        settingsCaption.setText("Settings");
        back.setText("Back");
        first.setText("First");
        second.setText("Second");
    }

    @BindView(R.id.langUA)
    Button langUA;

    @OnClick(R.id.langUA)
    public void onViewClickedLangUA() {
        lang = "UA";
        langEN.setEnabled(true);
        langUA.setEnabled(false);
        settingsCaption.setText("Налаштування");
        back.setText("Повернутися");
        first.setText("Першим");
        second.setText("Другим");
    }

    @BindView(R.id.first)
    Button first;

    @OnClick(R.id.first)
    public void onViewClickedFirst() {
        symb = "symbX";
        second.setEnabled(true);
        first.setEnabled(false);
    }

    @BindView(R.id.second)
    Button second;

    @OnClick(R.id.second)
    public void onViewClickedSecond() {
        symb = "symb0";
        first.setEnabled(true);
        second.setEnabled(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        symb = extras.getString("symb");
        lang = extras.getString("lang");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);
        ButterKnife.bind(this);
        if (Objects.equals(lang, "EN")) {
            langEN.setEnabled(false);
            settingsCaption.setText("Settings");
            back.setText("Back");
            first.setText("First");
            second.setText("Second");
        }
        else {
            langUA.setEnabled(false);
            settingsCaption.setText("Налаштування");
            back.setText("Повернутися");
            first.setText("Першим");
            second.setText("Другим");
        }

        if (Objects.equals(symb, "symbX")) {
            first.setEnabled(false);
        }
        else {
            second.setEnabled(false);
        }
    }
}
