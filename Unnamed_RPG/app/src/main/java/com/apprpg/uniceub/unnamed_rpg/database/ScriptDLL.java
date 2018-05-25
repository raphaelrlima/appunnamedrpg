package com.apprpg.uniceub.unnamed_rpg.database;

public class ScriptDLL {

    public static String getCreateTableUsuario(){

        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE IF NOT EXISTS TB_USUARIO(");
        sql.append("    IDT_USUARIO INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, ");
        sql.append("    NME_USUARIO VARCHAR(50) NOT NULL, ");
        sql.append("    EML_USUARIO VARCHAR(50) NOT NULL UNIQUE, ");
        sql.append("    LGN_USUARIO VARCHAR(50) NOT NULL UNIQUE, ");
        sql.append("    PWD_USUARIO VARCHAR(128) NOT NULL) ");


        return sql.toString();

    }

    public static String getInsertTableUsuario(){

        StringBuilder insertsql = new StringBuilder();

        insertsql.append("INSERT INTO TB_USUARIO(NME_USUARIO, EML_USUARIO, LGN_USUARIO, PWD_USUARIO) VALUES (");
        insertsql.append("'Raphael', 'raphael.rlima', 'lulinha','testeSENHA')");


        return insertsql.toString();

    }


}
