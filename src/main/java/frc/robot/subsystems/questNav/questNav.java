package frc.robot.subsystems.questNav;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class questNav extends SubsystemBase {
    questNavIO io;
    QuestNavInputsAutoLogged inputs = new QuestNavInputsAutoLogged();
    Pose2d resetPositon =
        new Pose2d(new Translation2d(0, Rotation2d.fromDegrees(0)), Rotation2d.fromDegrees(0));

    public questNav(questNavIO io) {
        this.io = io;
    }

    public void resetPositon() {
        io.zeroPosition();
    }
}
