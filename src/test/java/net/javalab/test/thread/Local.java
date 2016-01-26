package net.javalab.test.thread;



public class Local implements Callback, Runnable {

    private Remote remote;
    int i = 0;
    
    /**  
     * 发送出去的消息  
     */    
    private String message;    
        
    public Local(Remote remote, String message) {    
        super();    
        this.remote = remote;    
        this.message = message;    
    }    
    
    /**  
     * 发送消息  
     */    
    public void sendMessage()    
    {    
        message = "hello"+"-"+i++;
        /**当前线程的名称**/    
        System.out.println(Thread.currentThread().getName());    
        /**创建一个新的线程发送消息**/    
        Thread thread = new Thread(this);    
        thread.start();    
        /**当前线程继续执行**/    
        System.out.println("Message "+this.message+" has been sent by Local~!");    
    }    
    
    /**  
     * 发送消息后的回调函数  
     */    
    public void execute(Object... objects ) {    
        /**打印返回的消息**/    
        System.err.println(objects[0]);    
        /**打印发送消息的线程名称**/    
        System.err.println(Thread.currentThread().getName());    
        /**中断发送消息的线程**/    
        Thread.interrupted();    
    }    
        
    public static void main(String[] args) throws InterruptedException    
    {    
        Local local = new Local(new Remote(),"Hello");
        
        while(true){
            
        local.sendMessage();
        Thread.sleep(100L);
        }
    }    
    
    public void run() {
        remote.executeMessage(message, this);  //这相当于给同学打电话，打完电话之后，这个线程就可以去做其他事情了，只不过等到你的同学打回电话给你的时候你要做出响应  
            
    }    

}
