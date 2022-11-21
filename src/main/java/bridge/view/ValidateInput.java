package bridge.view;

import bridge.constants.Command;
import bridge.constants.ExceptionMessage;

public class ValidateInput {
    private static final String REGULAR_PATTERN = "^\\d+$";
    private static final int STARTING_POINT_CONDITION = 3;
    private static final int LAST_POINT_CONDITION = 20;

//        try {
//                bridgeGameMachine.run();
//                } catch (IllegalArgumentException e) {
//                System.out.println("[ERROR] " + e.getMessage());
//                }

    public void bridgeSizeVerification(String bridgeLength) {
        validateNull(bridgeLength);
        validateNumber(bridgeLength);
        validateBetween(bridgeLength);
    }

    public void validateNull(String bridgeLength) {
        if (bridgeLength.equals(REGULAR_PATTERN)) {
            throw new IllegalArgumentException(ExceptionMessage.NOT_INPUT_ANYTHING);
        }
    }

    public void validateBetween(String bridgeLength) {
        int bridge = Integer.parseInt(bridgeLength);
        if (!(STARTING_POINT_CONDITION <= bridge && bridge <= LAST_POINT_CONDITION)) {
            throw new IllegalArgumentException(ExceptionMessage.NOT_VALID_BRIDGE_SIZE);
        }
    }

    public void validateNumber(String bridgeLength) {
        if (!(bridgeLength.matches(REGULAR_PATTERN))) {
            throw new IllegalArgumentException(ExceptionMessage.NOT_NUMBER_CHARACTERS);
        }
    }

    public void ValidateUpAndDownCharacter(String playerMoving) {
        if (!(playerMoving.equals(Command.UP.relevantCommand())
                || playerMoving.equals(Command.DOWN.relevantCommand()))) {
            throw new IllegalArgumentException(ExceptionMessage.NOT_UP_OR_DOWN_CHARACTERS);
        }
    }

    public void ValidateRestartAndEndCharacter(String playerMoving) {
        if (!(playerMoving.equals(Command.RE_START.relevantCommand())
                || playerMoving.equals(Command.END.relevantCommand()))) {
            throw new IllegalArgumentException(ExceptionMessage.NOT_RESTART_OR_END_CHARACTERS);
        }
    }

}
