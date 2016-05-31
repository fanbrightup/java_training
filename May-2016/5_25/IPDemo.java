import java.net.*;
class IPDemo{
    public static void main(String[] args) throws UnknownHostException{
      //  InetAddress i =InetAddress.getLocalHost();
      //  System.out.println(i.toString());
      //  System.out.println("name: "+ i.getHostName());
      //  System.out.println("address: "+ i.getHostAddress());
       //
      //  InetAddress ia =InetAddress.getByName("127.0.0.1");
      //  System.out.println("name:"+ ia.getHostName());
      //  System.out.println("address:"+ ia.getHostAddress());
      InetAddress[] ias =InetAddress.getAllByName("www.baidu.com");
      for(InetAddress iaItem: ias){
          System.out.println(iaItem);
      }
    }
}
