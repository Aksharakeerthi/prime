# prime
import java.io.*;
import java.util.*;
public class prime{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int k,l=45,m=55;
System.out.println("Enter the number");
a=sc.nextInt();
while(l<m){
boolean flag=false;
for(int i=2;i<=k/2;i++){
if(l%i==0){
flag = true;
break;
}
}
if(flag){
System.out.println(l +" ");
k++;
}
}
}
