import java.util.Scanner;
package mypack;
class overloadingdemo{
    void add(int a,int b){
        System.out.println("Sum of two integers: "+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Sum of three integers: "+(a+b+c));
    }
    void add(double a,double b){
        System.out.println("Sum of two doubles: "+(a+b));
    }
    void add (String a,String b){
        System.out.println("Concatenation of two strings: "+(a+b));
    }
    public static void main(String args[]){
        overloadingdemo obj=new overloadingdemo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        obj.add(x,y);
        System.out.println("Enter three integers: ");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        obj.add(p,q,r);
        System.out.println("Enter two doubles: ");
        double m=sc.nextDouble();
        double n=sc.nextDouble();
        obj.add(m,n);
        System.out.println("Enter two strings: ");
        String s1=sc.next();
        String s2=sc.next();
        obj.add(s1,s2);
    }
}