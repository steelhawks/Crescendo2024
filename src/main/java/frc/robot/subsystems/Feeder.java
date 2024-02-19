package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.feeder.Feed;

public class Feeder extends SubsystemBase {
    private final TalonFX m_feederMotor = new TalonFX(Constants.Shooter.feederMotorID);

    public Feeder() {
        configureMotors();
    }

    public Command feedCommand() {
        return new Feed();
    }

    public void feed() {
        m_feederMotor.set(-Constants.Shooter.feedSpeed);
    }

    public void stopFeed() {
        m_feederMotor.stopMotor();
    }

    private void configureMotors() {
        m_feederMotor.setInverted(true);

        m_feederMotor.setNeutralMode(NeutralModeValue.Coast);
    }
}
