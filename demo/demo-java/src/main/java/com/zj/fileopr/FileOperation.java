package main.java.com.zj.fileopr;

import java.io.File;

public class FileOperation {

    public static void main(String[] args) {
        File file = new File("D:/MyInstall/idea/rocketmq-nameserver/store");
        if(file.exists()) {
            System.out.println(1);
        }else {
            System.out.println(1);
        }
    }

}
