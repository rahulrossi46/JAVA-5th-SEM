import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter starting value:");
        int a = s.nextInt();
        System.out.println("enter ending value:");
        int b = s.nextInt();
for(int i=a; i<b;i++){
    if(i % 2 == 0){
        System.out.println(i);
    }
}
}
}