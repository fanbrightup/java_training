import java.net.InetAddress;
import java.io.IOException;
// import java.net.UnknownHostException;
public class InetAddressDemo01{
  public static void main(String[] args)throws Exception  {
    InetAddress localAdd = null;
    InetAddress remoteAdd = null;
    localAdd = InetAddress.getLocalHost();
    remoteAdd = InetAddress.getByName("www.google.com");

    System.out.println("本地地址为"+localAdd.getHostAddress());
    System.out.println("远程地址为"+remoteAdd.getHostAddress() );
    System.out.println("是否能连接"+localAdd.isReachable(5000));
    System.out.println(remoteAdd.toString());
  }

}
