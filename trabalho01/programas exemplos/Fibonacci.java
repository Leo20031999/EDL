import java.io.*;
import java.util.*;
public class Fibonacci{
	static int fibonaccir(int n){
		if (n<2){
			return n;
		}else{
			return fibonaccir(n-1)+fibonaccir(n-2);
		}
	}
	static int fibonaccii(int n){
		int F=0;int ant=0;
		for(int i=1;i<=n;i++){
			if(i==1){
				F=1;ant=0;
			}else{
				F+=ant;
				ant=F-ant;
			}
		}
		return F;
	}
	public static void main(String[] args){
		System.out.println(Fibonacci.fibonaccir(3));
		System.out.print("\n");
		System.out.println(Fibonacci.fibonaccii(3));
	}
}