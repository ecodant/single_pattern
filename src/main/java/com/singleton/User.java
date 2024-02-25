package com.singleton;

public class User {
    private int id;
    private String name;
    private Connection connection;
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Connection getConnection() {
        return connection;
    }


    public User(int id, String name){
        this.id = id;
        this.name = name;
        this.connection = new Connection.ConnectionBuilder()
        .charactherEncoding("UTF-8")
        .contectionTimeout((short)2000)
        .port((short)3306)
        .sslContext(true)
        .dateBaseName("accounts")
        .build("JuandaDB", "123", "192.123.432.647");;
    }

   

}