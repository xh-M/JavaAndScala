package tititit;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/17
 */
public class TCPTest1 {
    @Test
    public void client(){
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet,8899);
            outputStream = socket.getOutputStream();
            outputStream.write("你好, 我是客户端MM".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8899);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[5];
        int len;
        while ((len = inputStream.read(buffer)) != -1){
            baos.write(buffer,0, len);
        }
        System.out.println(baos.toString());
        System.out.println(serverSocket.getInetAddress().getHostName());

        baos.close();
        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
