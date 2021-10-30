public class Join1 extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<=4; i++)  
        {    
            try  
            {    
                Thread.sleep(500);    
            }catch(Exception e){System.out.println("how r u"+e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {   
        // creating three threads  
        Join1 t1 = new Join1();    
        Join1 t2 = new Join1();    
        Join1 t3 = new Join1();    
        // thread t1 starts  
        t1.start();   
        // starts second thread when first thread t1 is died.  
           try  
        {    
            t1.join();    
        }catch(Exception e){System.out.println(e);} 
        // start t2 and t3 thread   
        t2.start();   
        t3.start();    
    }    
}  