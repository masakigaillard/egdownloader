package org.arong.util.https;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.arong.util.Tracker;

public class HttpsUtils {

        public static HttpURLConnection getConnection(String urlStr, Proxy proxy) throws MalformedURLException, IOException, KeyManagementException, NoSuchAlgorithmException {
                HttpURLConnection conn = null;
                if (urlStr.toLowerCase().startsWith("https"))
                        conn = getHttpsConnection(urlStr, proxy);
                else
                        conn = getHttpConnection(urlStr, proxy);
                return conn;
        }
        private static HttpURLConnection getHttpConnection(String urlStr, Proxy proxy) throws MalformedURLException, IOException {
                URL url = new URL(urlStr);
                HttpURLConnection conn = null;
                if(proxy != null){
                	conn = (HttpURLConnection) url.openConnection(proxy);
                }else{
                	conn = (HttpURLConnection) url.openConnection();
                }
                return conn;
        }
       
        private static HttpsURLConnection getHttpsConnection(String urlStr, Proxy proxy) throws IOException {
                URL url = new URL(urlStr);
                HttpsURLConnection conn = null;
                if(proxy != null){
                	conn = (HttpsURLConnection) url.openConnection(proxy);
                }else{
                	conn = (HttpsURLConnection) url.openConnection();
                }
                try{
	                // 不验证服务器主机名和证书
	                conn.setHostnameVerifier(new IgnoreHostnameVerifier());
	                TrustManager[] tm = { new X509TrustManager4None() };
	                SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
	                sslContext.init(null, tm, new java.security.SecureRandom());
	                
	                SSLSocketFactory ssf = sslContext.getSocketFactory();
	                /*for(String cs : ssf.getSupportedCipherSuites()){
	                	System.out.println(cs);
	                }*/
	                
	                conn.setSSLSocketFactory(ssf);
                }catch (Exception e){
                	System.out.println("HTTPS需要JDK(JRE)1.7及以上版本的支持");
                	e.printStackTrace();
                }
                return conn;
        }
}

