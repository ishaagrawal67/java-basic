package com.company;
class callme{
    void call(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class calles implements Runnable{
    String msg;
    callme target;
    Thread t;
    public calles(callme trg, String s){
        target=trg;
        msg=s;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        target.call(msg);
    }
}
public class synchonizedDemo {
    public static void main(String[] args) {
        callme target=new callme();
        calles ob1=new calles(target, "one");
        calles ob2=new calles(target, "Synchronized");
        calles ob3=new calles(target, "World");
    try{
        ob1.t.join();
        ob2.t.join();
        ob3.t.join();
    }
    catch (InterruptedException e){
        System.out.println("Interrupted");
    }
    }
}