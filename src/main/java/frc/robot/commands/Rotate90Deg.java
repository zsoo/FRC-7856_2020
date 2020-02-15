/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;


import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Add your docs here.
 */
public class Rotate90Deg extends Command {
    
    public Rotate90Deg() {
        requires(Robot.m_train);
        requires(Robot.m_gyro);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
    
        double targetAngle = 90;
        double turnspeed = Robot.m_gyro.rotateSpecificAngle(targetAngle);
        Robot.m_train.DriveCartesian(0, 0, turnspeed);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
    }

    @Override
    protected void interrupted() {
        
    }
}
