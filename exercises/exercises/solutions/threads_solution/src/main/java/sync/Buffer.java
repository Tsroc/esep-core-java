package sync;

public class Buffer {

    private StringBuffer data = new StringBuffer();

    public synchronized String getData(){
        String returnValue = null;
        try {
            wait();
            returnValue = data.toString();
            data = new StringBuffer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }

    public void addMessage(String msg){
        synchronized(this){
            this.data.append(msg);
            notify();
        }
    }
}