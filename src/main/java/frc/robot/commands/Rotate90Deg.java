/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.subsystems.*;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Gryo;
import edu.wpi.first.wpilibj.command.Command;
/**
 * Add your docs here.
 */
public class Rotate90Deg extends Command {
    public Rotate90Deg() {
        requires(Drivetrain);
        requires(Gryo);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.m_train.Drivetrain
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
