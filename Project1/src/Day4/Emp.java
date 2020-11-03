package Day4;

public class Emp {  
int id;  
String name; 
int pid;
String type;
int no;
 
public Emp(int id, String name,int pid,String type,int no) {  
    this.id = id;  
    this.name = name; 
    this.pid = pid;
    this.type = type;
    this.no = no;
   
}  
  
void display(){  
	
System.out.println(id+" "+name+" "+pid+" "+type+" "+no);  

}  
  
public static void main(String[] args) {  

Emp e=new Emp(51867517,"Hari",14,"(landline)",123456);  
Emp e2=new Emp(123456,"arun",15,"(mobile)",123456789);  
      
e.display();  
e2.display();  
      
}  
}  