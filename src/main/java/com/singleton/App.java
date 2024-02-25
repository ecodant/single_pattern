package com.singleton;

public class App 
{
    public static void main( String[] args )
    {

        User user = new User(23872872, "Juanda");

        User user2 = new User(289278372, "Steve");
        /* 
            Verificación simple de los datos establecidos para User #1 y User #2
        */
        System.out.println("User id: " + user.getId());
        System.out.println("User name: " + user.getName());
        System.out.println("User Connection : " + user.getConnection());

        System.out.println("User id: " + user2.getId());
        System.out.println("User name: " + user2.getName());
        System.out.println("User Connection : " + user.getConnection());
    }
}
