
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
    private WPI_TalonSRX m_RightSideMaster = new WPI_TalonSRX(1);
    private WPI_TalonSRX m_RightSideFollower = new WPI_TalonSRX(2);
    private WPI_TalonSRX m_LeftSideMaster = new WPI_TalonSRX(3);
    private WPI_TalonSRX m_LeftSideFollower = new WPI_TalonSRX(4);
    private DifferentialDrive m_DD;

    public DriveTrain() {
        this.m_RightSideFollower.follow(this.m_RightSideMaster);
        this.m_LeftSideFollower.follow(this.m_LeftSideMaster);
        this.m_RightSideMaster.setInverted(true);
        this.m_DD = new DifferentialDrive(this.m_LeftSideMaster, this.m_RightSideMaster);
    }

    public void Drive(double xSpeed, double zRotation) {
        this.m_DD.arcadeDrive(xSpeed, zRotation);
    }
}
