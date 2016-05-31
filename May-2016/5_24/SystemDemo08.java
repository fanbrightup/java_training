import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class SystemDemo08{
  public static void main(String[] args) {
    ByteArrayOutputStream bos = null;
    bos = new ByteArrayOutputStream();
    System.setErr(new PrintStream(bos));
    System.err.print("www.okfcm.win");
    System.err.print(",范");
    System.out.println(bos);
  }
}
