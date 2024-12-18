package com.company;

import java.sql.Connection;

public class main {

    public static void main(String[] args) {
        DbFunctions db=new DbFunctions();
        Connection conn=db.connect_to_db("telusko", "postgres", "9790");
        //db.createTable(conn, "Employee");
        db.insert_row(conn, "Employee", "sanjeev", "tvk");
        //db.update_name(conn, "Employee", "sanjeev", "sanjeev kumar");
        //db.search_by_name(conn, "Employee", "saqib");
        //db.search_by_id(conn, "Employee", 2);
        //db.delete_by_name(conn, "Employee","manjal");
        //db.delete_by_id(conn, "Employee", 5);
        //db.delete_table(conn, "Employee");
        //db.read_data(conn, "Employee");
    }

}
