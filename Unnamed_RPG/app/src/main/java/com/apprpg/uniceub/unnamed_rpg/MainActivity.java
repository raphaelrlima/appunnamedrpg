package com.apprpg.uniceub.unnamed_rpg;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.apprpg.uniceub.unnamed_rpg.database.DatabaseHelper;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase conexao;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        criarConexao();



    }

    private void criarConexao(){
        try {
            databaseHelper =  new DatabaseHelper(this);
            conexao = databaseHelper.getWritableDatabase();
            AlertDialog.Builder conectado = new AlertDialog.Builder(this);
            conectado.setTitle("Conectado");
            conectado.setMessage("Conexão Criada com sucesso !");
            conectado.setNeutralButton("OK", null);
            conectado.show();

        }catch (SQLException ex){

            AlertDialog.Builder err = new AlertDialog.Builder(this);
            err.setTitle("Erro !!");
            err.setMessage(ex.getMessage());
            err.setNeutralButton("ok", null);
            err.show();


        }
    }

    }
