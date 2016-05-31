import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
public class GetURLInfo{
  public static void printInfo(URL url) throws IOException{
    System.out.println("File:"+url.getFile());
    System.out.println("Protocol:"+url.getProtocol());
    System.out.println("Host:"+url.getHost());
    System.out.println("Port"+url.getPort());
    System.out.println("Path:"+url.getPath());

    URLConnection c = url.openConnection();
    c.connect();

    sop("Content Type"+ c.getContentType());
    sop("Content Encoding"+c.getContentEncoding());
    sop("Content Length"+c.getContentLength());
    sop("--------------------------");
    sop(c.getDate()+",,,,");
    sop("Date:"+new Date(c.getDate()));
    sop("Last Modified:"+new Date(c.getLastModified()));
    sop("Expiration:"+new Date(c.getExpiration()));



  }
  public static void main(String[] args){
    try{
      String urlStr = "http://www.sina.com.cn:80/index.htm";
      URL url = new URL(urlStr);
      printInfo(url);
    }catch(Exception e){
      System.err.println(e);
    }
  }
  public static void sop(String str){
    System.out.println(str);
  }
}
