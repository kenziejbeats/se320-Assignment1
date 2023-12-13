package FinalAssignment;

import java.io.*;
import java.net.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class BmiServer {
    public static void mainn(String[] args){
    int port = 8000;

        try (ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("The server is on port "+ port);

                while (true){
                    Socket clientSocket = serverSocket.accept();

                    DataInputStream input = new DataInputStream(clientSocket.getInputStream());
                    DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());

                        double weightInKilorams = input.readDouble();
                        double heightInMeters = input.readDouble();

                        double bmi = weightInKilorams / (heightInMeters * heightInMeters);

                        output.writeDouble(bmi);

                        clientSocket.close();           
                }
                    
            }catch (IOException e){
            e.printStackTrace();
            }
    }
}

