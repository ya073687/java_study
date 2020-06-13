package java_study;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> num_list = new ArrayList<Integer>();
        
        for(int i=0; i<N; i++){
            int number = sc.nextInt();
            num_list.add(number);
        }
        
     
  
        
        
				
        
        for(int i=0; i<num_list.size(); i++){
            System.out.println(num_list.get(i));
        }
	}
}




