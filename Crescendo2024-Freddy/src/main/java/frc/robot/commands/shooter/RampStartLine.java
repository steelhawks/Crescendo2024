package frc.robot.commands.shooter;

import frc.robot.Constants;

public class RampStartLine extends RampShooter {

    public RampStartLine() {
        super(Constants.ShootingConstants.startLineRPM, Constants.ShootingConstants.startLineRPM, Constants.ShootingConstants.startLineAngle);
    }
}
