package com.example.exercisemenu18b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class ListBangun extends AppCompatActivity implements
        PopupMenu.OnMenuItemClickListener{

    Button persegi, segitiga, trapesium, persegiPanjang, lingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bangun);

        persegi = findViewById(R.id.persegi);
        persegiPanjang = findViewById(R.id.persegiPanjang);
        segitiga = findViewById(R.id.segitiga);
        trapesium = findViewById(R.id.trapesium);
        lingkaran = findViewById(R.id.lingkaran);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(ListBangun.this, view);
                popup.setOnMenuItemClickListener(ListBangun.this);
                popup.inflate(R.menu.menu);
                popup.show();
            }
        });
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup2 = new PopupMenu(ListBangun.this, view);
                popup2.setOnMenuItemClickListener(ListBangun.this);
                popup2.inflate(R.menu.menu2);
                popup2.show();
            }
        });
        persegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup3 = new PopupMenu(ListBangun.this, view);
                popup3.setOnMenuItemClickListener(ListBangun.this);
                popup3.inflate(R.menu.menu3);
                popup3.show();
            }
        });
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup4 = new PopupMenu(ListBangun.this, view);
                popup4.setOnMenuItemClickListener(ListBangun.this);
                popup4.inflate(R.menu.menu4);
                popup4.show();
            }
        });
        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup5 = new PopupMenu(ListBangun.this, view);
                popup5.setOnMenuItemClickListener(ListBangun.this);
                popup5.inflate(R.menu.menu2);
                popup5.show();
            }
        });
    }

    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Luas:
                startActivity(new Intent(this, LuasPersegi.class));
                return true;
            case R.id.Keliling:
                startActivity(new Intent(this, KelilingPersegi.class));
                return true;
            case R.id.LuasK:
                startActivity(new Intent(this, LuasLingkaran.class));
                return true;
            case R.id.KelilingK:
                startActivity(new Intent(this, KelilingLingkaran.class));
                return true;
            case R.id.LuasPP:
                startActivity(new Intent(this, LuasPersegiPanjang.class));
                return true;
            case R.id.KelilingPP:
                startActivity(new Intent(this, KelilingPersegiPanjang.class));
                return true;
            case R.id.LuasS:
                startActivity(new Intent(this, LuasSegitiga.class));
                return true;
            case R.id.KelilingS:
                startActivity(new Intent(this, KelilingSegitiga.class));
                return true;
            case R.id.LuasT:
                startActivity(new Intent(this, LuasTrapesium.class));
                return true;
            case R.id.KelilingT:
                startActivity(new Intent(this, KelilingTrapesium.class));
                return true;
            default:
                return false;
        }
    }
}