package WhatsApp.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client extends Thread{
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    public Client(int port,String ip){
        try {
            clientSocket=new Socket(ip,port);
            out=new PrintWriter(clientSocket.getOutputStream(),true);
            in=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        }catch (Exception e){
            System.out.println(e);
            System.exit(1);
        }
    }
    public Socket getClientSocket(){
        return clientSocket;
    }
    public PrintWriter getOut(){
        return out;
    }
    public BufferedReader getIn(){
        return in;
    }
    public void endConnection(){
        try {
            in.close();
            out.close();
            clientSocket.close();
        }catch (Exception e){
            System.out.println(e);
            System.exit(1);
        }
    }
    public void sendMessage(String message){
        out.println(message);
    }

    @Override
    public void run() {
        while (true) {
            try {
                String received = in.readLine();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
