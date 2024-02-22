package com.singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Singleton dataBase = new Singleton.SingleBuilder()
        .user("Juan José")
        .password("I_AM_DEVLOPER")
        .dateBaseHost("Hostinger")
        .charactherEncoding("UTF-8")
        .contectionTimeout(2000)
        .port(3306)
        .sslContext("SSL")
        .dateBaseName("accounts")
        .bluid();
        
        Singleton dataBase2 = new Singleton.SingleBuilder()
        .user("Sebastian")
        .password("123")
        .dateBaseHost("localhost")
        .charactherEncoding("UTF-9")
        .contectionTimeout(2000)
        .port(3306)
        .sslContext("SSL")
        .dateBaseName("movies")
        .bluid();
        /* 
            Verificación simple de los datos del Singletone que se pusieron en el singleton
        */
        System.out.println("User: " + dataBase.getUser());
        System.out.println("Password: " + dataBase.getPassword());
        System.out.println("Database Host: " + dataBase.getDateBaseHost());
        System.out.println("Character Encoding: " + dataBase.getCharactherEncoding());
        System.out.println("Connection Timeout: " + dataBase.getContectionTimeout());
        System.out.println("Port: " + dataBase.getPort());
        System.out.println("SSL Context: " + dataBase.getSslContext());
        System.out.println("Database Name: " + dataBase.getDateBaseName());
        
        /*  Ahora se quiere verificar si la segunda instancia de la Base de datos es la misma
            que la primera,dado que no pueden existir dos instancia de la misma base de datos
            por el statement en el build()
        */
        System.out.println("User: " + dataBase2.getUser());
        System.out.println("Password: " + dataBase2.getPassword());
        System.out.println("Database Host: " + dataBase2.getDateBaseHost());
        System.out.println("Character Encoding: " + dataBase2.getCharactherEncoding());
        System.out.println("Connection Timeout: " + dataBase2.getContectionTimeout());
        System.out.println("Port: " + dataBase2.getPort());
        System.out.println("SSL Context: " + dataBase2.getSslContext());
        System.out.println("Database Name: " + dataBase2.getDateBaseName());
    }
}
