package place.server;

import place.PlaceBoard;
import place.PlaceException;

import java.io.Closeable;
import java.io.IOException;
import java.net.ServerSocket;

public class PlaceServer implements Closeable {
    public ServerSocket server;

    public PlaceServer(int port, int dim) throws PlaceException {
        try {
            this.server = new ServerSocket(port);
            PlaceBoard board = new PlaceBoard(dim);
        } catch (IOException e) {
            throw new PlaceException(e);
        }

    }

    public void close() {
        try {
            this.server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
