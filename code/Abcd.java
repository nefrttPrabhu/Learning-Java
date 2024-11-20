import java.io.Console;

class server {
    private static boolean connect(Console connectionHandler, String location) {
        if (location == null || location.isEmpty()) {
            return connectionHandler.connect.connectDefault();
        }
        if (location.startsWith("s")) {
            return connectionHandler.connect.connectRemote(location.substring(1));
        }
        return connectionHandler.connect.connectLocal(location);
    }

    private static void openRepository(Console connectionHandler, String otherArg) {
        if (otherArg != null && !otherArg.isEmpty()) {
            connectionHandler.open.openRepository(otherArg);
        }
    }

    public static void main(String[] args) {
        Console connectionHandler = System.console();
        if (connectionHandler == null) {
            System.err.println("No console available");
            System.exit(1);
        }

        String selectedLocation = args.length > 0 ? args[0] : null;
        String location = args.length > 1 ? args[1] : null;
        String otherArg = args.length > 2 ? args[2] : null;

        if (!connect(connectionHandler, selectedLocation)) {
            System.err.println("Failed to connect");
            System.exit(2);
        }

        openRepository(connectionHandler, otherArg);
    }
}