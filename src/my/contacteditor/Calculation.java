package my.contacteditor;

public class Calculation extends Thread{
    @Override
    public void run(){
        System.out.println("Диман гей: " + Thread.currentThread().getName());
    }

}
