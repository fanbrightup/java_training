import java.net.Socket;
import java.net.*;
public class SocketDemo01{
  public static void main(String[] args)throws UnknownHostException {
    Socket msocket = new Socket();
    String localAddress = InetAddress.getHostAddress();
    msocket.bind(localAddress);
  }
}
