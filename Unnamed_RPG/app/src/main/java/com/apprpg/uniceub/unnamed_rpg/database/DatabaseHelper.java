package com.apprpg.uniceub.unnamed_rpg.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "unamed_rpg.db";

    public DatabaseHelper(Context context){
        super(context, "Dados.db", null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ScriptDLL.getCreateTableUsuario());
        db.execSQL(ScriptDLL.getInsertTableUsuario());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
/* db.execSQL("CREATE TABLE TB_USUARIO(IDT_USUARIO INT NOT NULL PRIMARY KEY AUTOINCREMENT, NME_USUARIO VARCHAR(50) NOT NULL,
LGN_USUARIO VARCHAR(50) NOT NULL UNIQUE, PWD_USUARIO VARCHAR(128) NOT NULL, EML_USUARIO VARCHAR(50) NOT NULL UNIQUE, DTA_CRIACAO_USUARIO DATETIME NOT NULL)");*/