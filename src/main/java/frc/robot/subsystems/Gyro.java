/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.hal.can.CANMessageNotAllowedException;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


/**
 * Add your docs here.
 */
public class Gyro extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  double kP = 0.0;
  double kI = 0.0;
  double kD = 0.0;
  double targetAngle = 0;
  double currentAngle = 0;
  double currentAngle360 = 0;
  double turnSpeed = 0;
  double diffAngle = 0;
  PigeonIMU _pigeon;
  double [] ypr = new double[3];
  boolean TargetAngleReached = false; 
  boolean Rotating = false;
  
  public Gyro(TalonSRX talon){
    _pigeon = new PigeonIMU(talon);
  }

  public double getYaw(){
    _pigeon.getYawPitchRoll(ypr);
        currentAngle = ypr[0];
        System.out.println("Yaw:" + ypr[0]);
        return currentAngle;
    }

    public double getYawIn360() {
        _pigeon.getYawPitchRoll(ypr);
    currentAngle360 = ypr[0]%360;
    System.out.println("Yaw in 360:" + ypr[0]);
    return currentAngle360;
  }

  public double setYaw(double newAngle){
    _pigeon.setYaw(newAngle);
        return getYawIn360();
  }

  public double rotateToSpecificAngle(double targetAngle){
    getYawIn360();
    diffAngle = targetAngle-currentAngle360;
    turnSpeed = diffAngle * kP + diffAngle;
    turnSpeed = (diffAngle/360);
    if(turnSpeed >=1 ){
      turnSpeed = 1;
    }else{
      turnSpeed = turnSpeed;
    }
    if(diffAngle < 1){
      TargetAngleReached = true;
      return 0;
    }else{
      return turnSpeed;
    }

  }

  public double rotateSpecificAngle(double targetAngle){
    if(Rotating = false){
      getYaw();
      targetAngle = currentAngle + targetAngle;
      Rotating = true;
      return 0;
    }else{
      getYaw();
      diffAngle = targetAngle - currentAngle;
      diffAngle = diffAngle%360;
      turnSpeed = diffAngle * kP + diffAngle;
      turnSpeed = (diffAngle/360);
      if(diffAngle < 1){
        TargetAngleReached = true;
        Rotating = false;
        return turnSpeed;
      }else{
        return turnSpeed;
      }
    }

  }

  public double driveStaight(){
    getYaw();
    if(currentAngle%360 > 1){
      rotateSpecificAngle(currentAngle%360)
    }else{
      return 0;
    }
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}