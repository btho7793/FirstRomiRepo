// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.kinematics.DifferentialDriveKinematics;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveConstants {
    public static final double ksVolts = 1.43;
    public static final double kvVoltSecondsPerMeter = 5.47;
    public static final double kaVoltSecondsSquaredPerMeter = 0.00894;
    //For electricity (num volts go in)

    public static final double kPDriveVel = 0.085;
    //P constant of PID loop
    //difference between target point and current point = error
    //P constant = proportional = number multiplied by error to get dif number
    //Larger error = larger P

    public static final double kTrackwidthMeters = 0.142072613;
    //Width of Romi in meters
    public static final DifferentialDriveKinematics kDriveKinematics =
        new DifferentialDriveKinematics(kTrackwidthMeters);
  }

  public static final class AutoConstants {
    //Max Velocity
    public static final double kMaxSpeedMetersPerSecond = 0.8;
    public static final double kMaxAccelerationMetersPerSecondSquared = 0.8;
    //Adjusts speed of how fast want Romi to move

    // Reasonable baseline values for a RAMSETE follower in units of meters and seconds
    public static final double kRamseteB = 2;
    public static final double kRamseteZeta = 0.7;
  }
}
