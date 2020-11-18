package ch9.InterfaceSample;

public class Client implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Client calling callback with param = " + p);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.callback(100);

        if (client instanceof Callback)
            System.out.println("Client support Callback interface");
    }
}
