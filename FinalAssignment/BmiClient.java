package FinalAssignment;

import java.io.*;
import java.net.*;

public class BmiClient {
    public static void main(String[] args){
        String host = "localhost";
        int port = 8000;

        try {
        
            Socket socket = new Socket(host, port);
            
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter your weight in kilograms: ");
            String weight = systemIn.readLine();

            System.out.println("Enter your height in meters: ");
            String height = systemIn.readLine();

            output.writeDouble(Double.parseDouble(weight));
            output.writeDouble(Double.parseDouble(height));

            double answers = input.readDouble();
            System.out.println("Your bmi results wil be: " + answers);

            socket.close();
        }
        catch (IOException e){
        e.printStackTrace();
        }
    }
}
