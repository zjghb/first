package main.java.com.zj.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("D:\\MyInstall\\idea\\filews\\test.txt");
        FileChannel channel = fos.getChannel();
        ByteBuffer wrap = ByteBuffer.wrap("hello world".getBytes());
        channel.write(wrap);
        channel.close();
        fos.close();
    }

}
