//int[] a={10,20,30,40,50}
class test{
    public static void main(String[]args){
      int[] a={10,20,30,40,50};//declaration ,creation and initilition
     int total= 0;
     for(int valu:a){
        total=total+valu;
     }
     for(int i=0; i<=a.length-1; i++){
        total=total +a[i];
     }
System.out.println(total);

    }
}