
public class Student {
      private int rollno;
      private String name;
      private int marks;
      void setRollno(int x) {
    	 if(x >=1) { 
    	     rollno=x;
    	 }else {
    		 System.out.println("Invalid rollno");
    	 }  
      }     
      void setName(String n) {
    	  if(n.isEmpty()) {
    		  System.out.println("Name is not entered");
    	  }else {
    		  name=n;  
    	  }
    	 
      }
      void setMarks(int m) {
    	  if(m >=1 && m <=100) {
    	  marks=m;
    	  }else {
    		  System.out.println("Invalid Marks");
    	  } 
      }
      int getRollno() {
    	  
    	  return rollno;
      }
      String getName() {
    	  return name;
      }
      int getMarks() {
    	  return marks;
      }
}
