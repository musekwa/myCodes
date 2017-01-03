import java.util.*;

public class ArrayLista {
	
	public static ArrayList<Integer> lista(ArrayList<Integer> n, ArrayList<Integer> m){
		ArrayList<Integer> aux=new ArrayList<Integer>();
		for(int i=0;i<n.size();i++){
			
				int a=n.get(i);
				int b=m.get(i);
				int c= a+b;
		    	aux.add(c);
			
		}
		
		return aux;
	}
	
	public static void main(String[] args) {
	  Scanner stdin = new Scanner(System.in);
	  ArrayList<Integer> list1;
	  ArrayList<Integer> list2;
	  ArrayList<Integer> list3;
	  
	  list1= new ArrayList<Integer>();
	  list2= new ArrayList<Integer>();
	  list3= new ArrayList<Integer>();
	  
	  System.out.println("Enter number in list1 and list 2");
	  while(true)
	  {
		  System.out.print("list1: ");
		  int n=stdin.nextInt();
		  if(n==0)
			  break;
		  list1.add(n);
		  System.out.print("list2: ");
		  int m=stdin.nextInt();
		  if(m==0)
			  break;
		  list2.add(m);
	  }
	  System.out.println();
	  list3=lista(list1,list2);
	  for(int i=0;i<list3.size();i++){
		  System.out.printf("%d ",list3.get(i));
	  }
		
	}

}
