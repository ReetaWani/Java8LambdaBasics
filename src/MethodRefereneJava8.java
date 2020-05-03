
public class MethodRefereneJava8 {  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    } 
    
    public static void ThreadStatus2(){  
        System.out.println("Thread is running222...");  
    } 
    
    public void ThreadStatus3(){  
        System.out.println("Thread status non static method...");  
    } 
    
    public static void main(String[] args) {  
        Thread t2=new Thread(MethodRefereneJava8::ThreadStatus);  
        t2.start(); 
        
        Thread t1=new Thread(MethodRefereneJava8::ThreadStatus2);  
        t1.start(); 
        
        Test test = new MethodRefereneJava8()::ThreadStatus3;
        test.test();
        
        MethodRefereneJava8 java8 = new MethodRefereneJava8(); 
        
        Test test2 = java8::ThreadStatus3;
        test2.test();
        
    }  
}  


interface Test{
	
	public void test();
}
