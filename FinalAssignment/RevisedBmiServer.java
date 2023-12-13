package FinalAssignment;

import java.io.*;
import java.net.*;

public class RevisedBmiServer {
    public static void main(String[] args){
        int port = 8000;

            try (ServerSocket serverSocket = new ServerSocket(port)){
                System.out.println("The server is on port "+ port);

                    while (true){
                       Socket socket = serverSocket.accept();
                       System.out.println("The new client is now conneceted. :) ");
                       
                       ClientHandler bmiClientHandler = new ClientHandler(socket);
                       Thread bmiClientThread = new Thread(bmiClientHandler);
                       bmiClientThread.start();

                    }
            }
            catch (IOException e){
            e.printStackTrace();
            }
    }


    static class ClientHandler implements Runnable {
        private final Socket clientSocket;

        public ClientHandler(Socket clientSocket){
            this.clientSocket = clientSocket;
        }
        @Override
        public void run(){

            try{

                DataInputStream input = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());

                double weightInKilorams = input.readDouble();
                double heightInMeters = input.readDouble();

                double bmi = weightInKilorams / (heightInMeters * heightInMeters);

                output.writeDouble(bmi);


            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}