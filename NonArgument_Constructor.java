class Student{
   
 
    String name;
    
     int age;
    
   
    Student()
    
     {
        
         name="neha";
        
        age=10;
   
    }
    
    void display()
  
    {
       
         System.out.println("My name is:"+name+"Age:"+age);
  
   }
     
  public static void main(String[] args)
 
   {
        
        Student s1=new Student();
        
       s1.display();
    
   }

}