package com.example.tsiktmmp;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;


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


    public boolean bookBorrowing(String bookname) {
        boolean result = false;
        try {
            socket = new Socket(SERVER_IP, SERVER_PORT);
            System.out.println("Connected to server");

            scanner = new Scanner(System.in);
            out = new PrintWriter(socket.getOutputStream(), true);

            out.println("borrowrequest");
            out.println(bookname);



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

    public String[] bookLoading(String command){
        List<String> stringList = new ArrayList<>();
        try {
            socket = new Socket(SERVER_IP, SERVER_PORT);
            System.out.println("Connected to server");

            scanner = new Scanner(System.in);
            out = new PrintWriter(socket.getOutputStream(), true);
            Scanner in = new Scanner(socket.getInputStream());

            out.println(command);

             while(in.hasNextLine()){
                 // Add elements dynamically
                 stringList.add(in.nextLine());

             }




        } catch (IOException e){

        }
        return stringList.toArray(new String[0]);
    }

    public boolean bookAdding(String message1, String message2) {
        try {
            socket = new Socket(SERVER_IP, SERVER_PORT);
            System.out.println("Connected to server");

            scanner = new Scanner(System.in);
            out = new PrintWriter(socket.getOutputStream(), true);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            FileHandling fh = new FileHandling();

            String outCommand = "addbook";
            //byte[] fD = fh.FileLoad(message1);
            //byte[] imD = fh.FileLoad(message2;
            String bookName = message1;
            String bookAuthor = message2;

            out.println(outCommand);
            out.println(bookName);
            out.println(bookAuthor);

            // Send the file path and data to the server
          //  dos.writeInt(fD.length);
          //  dos.write(fD);

          //  dos.writeInt(imD.length);
         //   dos.write(imD);








            // Receive and display the response from the server
            Scanner in = new Scanner(socket.getInputStream());
            String serverResponseString = in.nextLine();
            Boolean serverResponse = Boolean.valueOf(serverResponseString);
            //result = serverResponse;

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
        return true;
    }

    public boolean startClient(String message1,String message2,String message3,String message4) {
        boolean result = false;
        try {
            socket = new Socket(SERVER_IP, SERVER_PORT);
            System.out.println("Connected to server");

            scanner = new Scanner(System.in);
            out = new PrintWriter(socket.getOutputStream(), true);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());


                // Send the message to the server
                out.println(message1);
                if (message2 != null){ out.println(message2);}
                if (message3 != null){ out.println(message3);}
                if (message4 != null){ out.println(message4);}


                    // Send the file path and data to the server




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

    public String[] requestLoading(String command) {
        List<String> stringList1 = new ArrayList<>();
        try {
            socket = new Socket(SERVER_IP, SERVER_PORT);
            System.out.println("Connected to server");

            scanner = new Scanner(System.in);
            out = new PrintWriter(socket.getOutputStream(), true);
            Scanner in = new Scanner(socket.getInputStream());

            out.println(command);

            while(in.hasNextLine()){
                // Add elements dynamically
                stringList1.add(in.nextLine());

            }




        } catch (IOException e){

        }
        return stringList1.toArray(new String[0]);
    }

    public boolean isAdmin() {
        boolean result = false;
        try {
            socket = new Socket(SERVER_IP, SERVER_PORT);
            System.out.println("Connected to server");

            scanner = new Scanner(System.in);
            out = new PrintWriter(socket.getOutputStream(), true);

            String outCommand = "isAdmin";


            out.println(outCommand);


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
}
