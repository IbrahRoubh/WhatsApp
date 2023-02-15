package WhatsApp.client;

public class Main {
    public static void main(String[] args) {
        Client client=new Client(8888,"192.168.1.102");
        client.start();

    }
}
