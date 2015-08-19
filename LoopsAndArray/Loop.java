import java.util.ArrayList;

import org.testng.annotations.Test;


public class Loop {

	@Test
	public void testLoop(){
		
		int r = 100;
		int e[] = {10,20,30,40,50};
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		for(int p = 0; p<list.size(); p++){
			System.out.println(list.get(p));
		}
		
		for(int t : list){
			System.out.println(t);
		}
		
		System.out.println(e[0]);
		System.out.println(e[1]);
		for(int k: e){
			System.out.println(k);
		}
		for(int i = 0; i<e.length; i++){
			System.out.println(e[i]);
		}
		
		do
		{
			System.out.println("Execute AtLeast Once");
		}while(1>10);
		
		int j = 1;
		while(j<=10){
			System.out.println("J is "+j);
			if(j==5){
				j= j +2;
			}
			else{
			j++;
			}
		}
		
		
		for(int i = 10 ; i>=1 ; i--){
			System.out.println("I is "+i);
		}
	}
}
