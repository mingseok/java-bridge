package bridge;

import bridge.domain.BridgeGameMachine;

public class Application {

    public static void main(String[] args) {
        BridgeGameMachine bridgeGameMachine = new BridgeGameMachine();
        bridgeGameMachine.run();
    }
}
