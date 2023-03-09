//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.subsystems.DriveTrain;

public class DriverCommands extends CommandBase {
    private final DriveTrain m_DriveTrain;
    private final Joystick m_Controller;

    public DriverCommands(DriveTrain driveTrain, Joystick Controller) {
        this.m_DriveTrain = driveTrain;
        this.m_Controller = Controller;
        this.addRequirements(new Subsystem[]{this.m_DriveTrain});
    }

    public void initialize() {
    }

    public void execute() {
        this.m_DriveTrain.Drive(this.m_Controller.getY(), this.m_Controller.getX());
    }

    public boolean isFinished() {
        return false;
    }

    public void end(boolean interrupted) {
    }
}
