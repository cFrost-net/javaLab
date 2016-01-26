package net.javalab.test.thread;



public class Remote {    
    
    /**  
     * 处理消息  
     * @param msg   接收的消息  
     * @param callBack  回调函数处理类  
     */    
    public void executeMessage(String msg,Callback callBack)    
    {    
        /**模拟远程类正在处理其他事情，可能需要花费许多时间**/    
        try {
            Thread.sleep(1200L);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
        /**处理完其他事情，现在来处理消息**/    
        System.out.println(msg);    
        System.out.println("I hava executed the message by Local");    
        /**执行回调**/    
        callBack.execute(new String[]{"Nice to meet you~!"});  //这相当于同学执行完之后打电话给你  
    } 

}
