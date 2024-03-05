package frc.robot.commands.feeder;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;

public class FeedAmp extends Command {
    
    public FeedAmp() {
        addRequirements(RobotContainer.s_Feeder);
    }

    @Override
    public void execute() {
        RobotContainer.s_Feeder.feedAmp();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.s_Feeder.stopFeed();
    }
}
