class Array{
  private int[] temp;
  private int foot;
  public Array(int len){
    if (len > 0){
      this.temp = new int[len];
    }else{
      this.temp = new int[1];
    }
  }
  public boolean add(int i){
    if (this.foot < this.temp.length){
      this.temp[foot] = i;
      foot ++;
      return true;
    }else{
      return false;
    }
  }
  public int[] getArray(){
    return this.temp;
  }
}
class SortArray extends Array{
  public SortArray(int len){
    super(len);
  }
  public int[] getArray(){
    java.util.Arrays.sort(super.getArray());
    return super.getArray();
  }



}
