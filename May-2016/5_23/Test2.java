import java.net.*;
import java.io.*;
public class Test2{
  public static void main(String[] args){
    URL aURL = null;
    try{
      aURL = new URL("http://www.okfcm.win:80");
    }catch (MalformedURLException e){
      e.printStackTrace();
    }
    System.out.println("protocol="+aURL.getProtocol());
    System.out.println("authority="+aURL.getAuthority());
    System.out.println("host = "+aURL.getHost());
    System.out.println("port="+aURL.getPort());

  }
}
