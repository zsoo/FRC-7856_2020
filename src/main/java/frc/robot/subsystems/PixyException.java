/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

// 2-11-20 import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class PixyException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PixyException(String message) {
        super(message);
    }
}
