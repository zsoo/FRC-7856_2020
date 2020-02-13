/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.subsystems.Packet;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.*;
import frc.robot.subsystems.PixyException;

/**
 * Add your docs here.
 */
public class PixyI2C extends Subsystem{
    Port port;
    I2C i2c;
    PixyException excep;
    Packet [] infoPacket;


    public PixyI2C(Port port, I2C i2c, PixyException excep){
        this.port = port;
        this.i2c = i2c;
        this.excep = excep;
    }

    public Packet readPacket(int signature){



        return this.infoPacket[signature - 1];
    }
    @Override
    public void initDefaultCommand(){
        
    }
}
