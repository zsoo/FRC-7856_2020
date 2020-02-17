/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  //Joystick Button Section
  public static final int Rotate90Button = 1;
  public static final int ColorWheelButton = 2;

//Axis number
  public static final int DRIVER_CONTROLLER_X_AXIS = 2;
  public static final int DRIVER_CONTROLLER_Y_AXIS = 1;
  public static final int DRIVER_CONTROLLER_ROTATE_AXIS = 4;



  //CAN Bus ID Section
  public static final int DRIVETRAIN_LEFT_FRONT_TALON = 2;
  public static final int DRIVETRAIN_LEFT_REAR_TALON = 7;
  public static final int DRIVETRAIN_RIGHT_FRONT_TALON = 4;
  public static final int DRIVETRAIN_RIGHT_REAR_TALON = 5;
  public static final int COLOR_WHEEL = 14;



  //Others 
  public static final int ROTATE_90 = 90;
  public static final int ROTATE_180 = 180;
  public static final int ROTATE_270 =270;
  public static final int ROTATE_360 = 0;
  public static final int COMPRESSOR = 0;


  //Controller Section
public static final int OI_DRIVER_CONTROLLER_1 = 1;
public static final int OI_DRIVER_CONTROLLER = 0;
}
