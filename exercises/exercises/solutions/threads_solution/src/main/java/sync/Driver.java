package sync;

public class Driver {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Reader reader = new Reader(buffer);
        Writer writer = new Writer(buffer);

        Thread readerThread = new Thread(reader, "Reader");
        Thread writerThread = new Thread(writer, "Writer");

        writerThread.start();
        readerThread.start();
    }
}
