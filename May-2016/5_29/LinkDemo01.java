class Node{
  private String data;//保存节点内容
  private Node next;//保存下一个节点
  public Node(String data){//构造方法设置节点内容
    this.data = data;
  }
  public String getData(){//得到节点内容
    return this.data;
  }
  public void setNext(Node next){//设置下一个节点
    this.next = next;
  }
  public Node getNext(){//取得下一个节点
    return this.next;
  }
}
public class LinkDemo01{
  public static void main(String[] args) {
    Node root = new Node("火车头");//定义跟节点
    Node n1 = new Node("车箱-A");//定义第一个车厢
    Node n2 = new Node("车箱-B");
    Node n3 = new Node("车箱-C");
    root.setNext(n1);//设置头节点的下一个节点
    n1.setNext(n2);
    n2.setNext(n3);
    printNode(root);//从根节点输出
  }
  public static void printNode(Node node){
    System.out.print(node.getData()+"\t");
    if(node.getNext()!=null){// 有一个问题，会不会跳过一个，直接Next了两次。
      printNode(node.getNext());//还要继续向下打印
      /*
      *关于这个问题，我想是：因为比较是否为空时并没有进行赋值的操作，
      *所以node还是指向自己，但是递归调用时，只传了node指向的下一个，
      *所以只是一次传递，所以没有跳过两个元素，如果将node=node.getNext()然后用
      *node！=null来比较的话，会出现一次跳两个元素的问题。
      */
    }
  }
}
