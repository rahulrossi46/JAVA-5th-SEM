class Main {
public static void main(String[] args)
{
   int[] number=new int[5];
   number[0] = 1;
   number[1] = 2;
   number[2] = 3;
   number[3] = 4;
   number[4] = 5;

   int a=0;
  for(int i=0;i<=number.length-1;i++)
  {
     
if(number[i]%2==0){
    a=number[i]+a;
    
}
  }
System.out.println("sum of even numbers= "+a);
    }
}