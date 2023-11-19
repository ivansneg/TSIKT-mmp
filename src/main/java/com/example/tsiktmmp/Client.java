package com.example.tsiktmmp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;



public class Client {
    private final String SERVER_IP;
    private final int SERVER_PORT;
    private Socket socket;
    private PrintWriter out;
    private Scanner scanner;

    public Client(String serverIP, int serverPort) {
        this.SERVER_IP = serverIP;
        this.SERVER_PORT = serverPort;
    }

    public boolean startClient(String message1,String message2,String message3,String message4) {
        boolean result = false;
        try {
            socket = new Socket(SERVER_IP, SERVER_PORT);
            System.out.println("Connected to server");

            scanner = new Scanner(System.in);
            out = new PrintWriter(socket.getOutputStream(), true);



                // Send the message to the server
                out.println(message1);
                if (message2 != null){ out.println(message2);}
                if (message3 != null){ out.println(message3);}
                if (message4 != null){ out.println(message4);}

                // Receive and display the response from the server
                Scanner in = new Scanner(socket.getInputStream());
                String serverResponseString = in.nextLine();
                Boolean serverResponse = Boolean.valueOf(serverResponseString);
                result = serverResponse;

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }


    public void Login(String usrn,String password){

    }
}
