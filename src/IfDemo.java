
public class IfDemo {

	public static void main(String[] args) {
		int a=9;
		 if(a<10) {
			System.out.println("a is less than 10"); 
		 }else {
			 System.out.println("a is greater than 10");  
		 }
       int b=10;
       if(b<10) {
    	   System.out.println("b is less than 10");
       }else if(b>10) {
    	   System.out.println("b is greater than 10"); 
       }else {
    	   System.out.println("b is equal to 10"); 
       }
    	   
	   	int x=20;
	   	System.out.println("x ="+x);
	   	System.out.printf("x= %d\n",x);
	   	
	   	String  choice="1"; // byte short int char String enum
	   	int j=20;
	   	int k=10;
	   	int result=0;
	   	switch(choice) {
	   	case "1": 
	   		    result=j+k;
	   		    System.out.println("Result "+result);
	   		    break;
		case "2": 
   		       result=j-k;
   		       System.out.println("Result "+result);
   		       break;
		case "3": 
		       result=j*k;
		       System.out.println("Result "+result);
		       break;
		case "4": 
		       result=j/k;
		       System.out.println("Result "+result);
		       break; 
		 default:
			    System.out.println("Invalid Choice");
	   	}
	   	
	   	// y++ post fixed
	   	//++y; pre fixed
	   	
	   
	   	int y=10;
	   	int z;
	    
	     //z=y++; // first use /assign the value then increment or decrement
	     z=y--; // first  increment or decrement and then assing or used
	   	System.out.println(" y "+y+" z "+z);
	   	
	   	
	   	
	 /*  	if(choice==1) {
	   		result=j+k;
	   		System.out.println("Result "+result);
	   	}else if(choice==2) {
	   		result=j-k;
	   		System.out.println("Result "+result);
	   	}else if(choice==3) {
	   		result=j*k;
	   		System.out.println("Result "+result);
	   	}else if (choice==4) {
	   		result=j/k;
	   		System.out.println("Result "+result);	
	 }*/
	
	   	// 
	   	
	}
}
