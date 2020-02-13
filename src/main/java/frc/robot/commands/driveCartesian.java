/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

// 2-11-20 import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class driveCartesian extends Command {
  public driveCartesian() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_train);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to r
  @Override
  protected void execute() {
    double xSpeed = Robot.m_oi.driveController.getRawAxis(RobotMap.DRIVER_CONTROLLER_X_AXIS)*0.6;
    double ySpeed = Robot.m_oi.driveController.getRawAxis(RobotMap.DRIVER_CONTROLLER_Y_AXIS)*0.6;
    double zRotation = Robot.m_oi.driveController.getRawAxis(RobotMap.DRIVER_CONTROLLER_ROTATE_AXIS)*0.6;
    
    Robot.m_train.DriveCartesian(ySpeed, xSpeed, zRotation);
    System.out.println(xSpeed);

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_train.DriveCartesian(0, 0, 0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
