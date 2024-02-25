package com.singleton;

public class Connection {
    private static Connection instance;
    private String userConnection;
    private String password;
    private String host;
    private String charactherEncoding;
    private short contectionTimeout;
    private boolean sslContext;
    private short port;
    private String dateBaseName;
    
    public String getUserConnection() {
        return userConnection;
    }

    public String getPassword() {
        return password;
    }

    public String getHost() {
        return host;
    }

    public String getCharactherEncoding() {
        return charactherEncoding;
    }

    public short getContectionTimeout() {
        return contectionTimeout;
    }

    public boolean isSslContext() {
        return sslContext;
    }

    public short getPort() {
        return port;
    }

    public String getDateBaseName() {
        return dateBaseName;
    }

    Connection (String userConnection, String password, String host, String charactherEncoding,
                        short contectionTimeout, short port, boolean sslContext, String dateBaseName)
    {
        this.userConnection = userConnection;
        this.password = password;
        this.host = host;
        this.charactherEncoding = charactherEncoding;
        this.contectionTimeout = contectionTimeout;
        this.sslContext = sslContext;
        this.port = port;
        this.dateBaseName = dateBaseName;
    }

    public static class ConnectionBuilder {
        private String charactherEncoding;
        private short contectionTimeout;
        private boolean sslContext;
        private short port;
        private String dateBaseName;

        public ConnectionBuilder charactherEncoding(String charactherEncoding)
        {
            this.charactherEncoding = charactherEncoding;
            return this;
        }
        public ConnectionBuilder contectionTimeout(short contectionTimeout)
        {
            this.contectionTimeout = contectionTimeout;
            return this;
        }
        public ConnectionBuilder sslContext(boolean sslContext)
        {
            this.sslContext = sslContext;
            return this;
        }
        public ConnectionBuilder port(short port)
        {
            this.port = port;
            return this;
        }
        public ConnectionBuilder dateBaseName(String dateBaseName)
        {
            this.dateBaseName = dateBaseName;
            return this;
        }
        public Connection build(String userConnection,String password, String host){
            /*
             * Verificación doble de la existencia de una conexión antes de crear una, esto
             * para garantizar que solo exista una solo conexión para cada usuario, seguiendo
             * de esta manera el patrón Singleton
             */
            if (instance == null){
                /*
                 *  synchronized en este contexto se establece por la posibilidad del multiples
                 *  usuarios intentando generar una conexión al tiempo, por lo cual con el synchronized
                 *  se busca hacer esperar a cada usuario antes de crear una nueva Connection, para verificar
                 *  de esta manera si existe un previa, y con ello garantizar la existencia de solo una
                 *  instancia de Connection
                 */
                synchronized (Connection.class){
                    if (instance == null) instance = new Connection(userConnection, password, host, charactherEncoding,
                 contectionTimeout, port, sslContext, dateBaseName);
                }
            }
            return instance;
        }
    }



    
}