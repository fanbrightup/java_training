import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class HttpClient{
  String urlString;
  public static void main(String[] args) throws Exception{
    if(args.length != 1){
      System.out.println("Usage:error");
      System.exit(1);
    }
    HttpClient client = new HttpClient(args[0]);
    client.run();
  }
  public HttpClient(String urlString){
    this.urlString = urlString;
  }

  public void run()throws Exception{
    URL url = new URL(urlString);
    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

    System.out.println("THE HEADERS");
    System.out.println("-----------");
    for(int i = 1;;i++){
      String key;
      String value;
      if((key = urlConnection.getHeaderFieldKey(i))==null) {
          break;
      }
      if((value = urlConnection.getHeaderField(i))==null){
        break;
      }
      System.out.println(key);
      System.out.println("is:"+value);
    }
    BufferedReader reader = new BufferedReader(new InputStreamReader(
          urlConnection.getInputStream()));
    String line;
    System.out.println("----CONTENT----");

    while((line = reader.readLine())!=null){
      System.out.println(line);
    }
  }
}
