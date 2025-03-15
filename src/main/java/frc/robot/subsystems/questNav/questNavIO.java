package frc.robot.subsystems.questNav;

import org.littletonrobotics.junction.AutoLog;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Quaternion;

public interface questNavIO {
    @AutoLog
    public static class QuestNavInputs {
        public double questBattery;
        public Pose2d questPose;
        public Quaternion questQuaternion;
        public boolean questConnected;
        public float questYaw;
    }

}
