import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n=sc.nextInt();
    int[] a=new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    for(int i=0;i<n-1;i++){
      int pos=i;
      for(int j=i+1;j<n;j++){
        if(a[j]<a[pos])
          pos=j;
      }
      int temp=a[pos];
      a[pos]=a[i];
      a[i]=temp;
    }
    for(int i=0;i<n;i++)
      System.out.print(a[i]+ " ");
  }
}
