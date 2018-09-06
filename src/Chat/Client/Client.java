package Chat.Client;

import com.sun.security.ntlm.Server;
import javafx.scene.shape.Arc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client implements Runnable {

    static int counter;
    private int id;

    static Socket socket;

    Client() {

        this.id = counter++;

        try {

            // создаём сокет общения на стороне клиента в конструкторе объекта
            socket = new Socket("localhost", 1237);
            System.out.println("Клиент " + id + " connected to socket");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

}}