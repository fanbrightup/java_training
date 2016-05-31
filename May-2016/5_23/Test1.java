import java.net.*;
public class Test1{
  public static void main(String[] args){
    InetAddress ia = null;
    try{
      ia = InetAddress.getLocalHost();
    }catch (UnknownHostException e){
      e.printStackTrace();
    }
    System.out.println("本机的主机名为:"+ia.getHostName());
    System.out.println("本机的IP为:"+ia.getHostAddress());

  }
}
