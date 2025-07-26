package edu.gui.study.exDatabase.app;

import db.DB;

import java.sql.Connection;

public class teste {

    public static void main(String[] args) {

        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
