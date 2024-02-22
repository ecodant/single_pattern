package com.singleton;
public class Singleton {
    private static Singleton instance;
    private String user;
    private String password;
    private String dateBaseHost;
    private String charactherEncoding;
    private int contectionTimeout;
    private int port;
    private String sslContext;
    private String dateBaseName;

    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    }
    public String getDateBaseHost() {
        return dateBaseHost;
    }
    public String getCharactherEncoding() {
        return charactherEncoding;
    }
    public int getContectionTimeout() {
        return contectionTimeout;
    }
    public int getPort() {
        return port;
    }
    public String getSslContext() {
        return sslContext;
    }
    public String getDateBaseName() {
        return dateBaseName;
    }
    private Singleton (String user, String password, String dateBaseHost, String charactherEncoding,
                    int contectionTimeout, int port, String sslContext, String dateBaseName)
    {
        this.user = user;
        this.password = password;
        this.dateBaseHost = dateBaseHost;
        this.charactherEncoding = charactherEncoding;
        this.contectionTimeout = contectionTimeout;
        this.port = port;
        this.sslContext = sslContext;
        this.dateBaseName = dateBaseName;
    }
    public static class SingleBuilder {
        private String user;
        private String password;
        private String dateBaseHost;
        private String charactherEncoding;
        private int contectionTimeout;
        private int port;
        private String sslContext;
        private String dateBaseName;

        public SingleBuilder user(String user)
        {
            this.user = user;
            return this;
        }

        public SingleBuilder password(String password)
        {
            this.password = password;
            return this;
        }

        public SingleBuilder dateBaseHost(String dateBaseHost)
        {
            this.dateBaseHost = dateBaseHost;
            return this;
        }

        public SingleBuilder charactherEncoding(String charactherEncoding)
        {
            this.charactherEncoding = charactherEncoding;
            return this;
        }

        public SingleBuilder contectionTimeout(int contectionTimeout)
        {
            this.contectionTimeout = contectionTimeout;
            return this;
        }

        public SingleBuilder port(int port)
        {
            this.port = port;
            return this;
        }

        public SingleBuilder sslContext(String sslContext)
        {
            this.sslContext = sslContext;
            return this;
        }
        public SingleBuilder dateBaseName(String dateBaseName)
        {
            this.dateBaseName = dateBaseName;
            return this;
        }
        public Singleton bluid(){
            if (instance == null){
                synchronized (Singleton.class){
                    if (instance == null) instance = new Singleton(user, password, dateBaseHost, charactherEncoding, contectionTimeout, port, sslContext, dateBaseName);
                }
            }
            return instance;
        }
    }
}