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
public class RotateColorWheel extends Command {
    
    public RotateColorWheel() {
        requires(Robot.m_color);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        double turnspeed = 0;
        System.out.println("Spinnning the Color Wheel");
        Robot.m_color.DriveCartesian(0, 0, turnspeed);
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
