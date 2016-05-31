import java.net.*;
import java.io.*;
public class WebClientDemo{
  public static void main(String [] args)throws Exception{

    Socket client = new Socket("www.swun.edu.cn",80);
    System.out.println("服务器IP是:"+client.getInetAddress());
    System.out.println("服务器端口号是"+client.getPort());
    System.out.println("客户端IP是"+client.getLocalAddress());
    System.out.println("客户机端口号是:"+client.getLocalPort());
    client.close();
  }
}
