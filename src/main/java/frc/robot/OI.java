/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


// 2-18-20 import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;
import frc.robot.commands.Rotate90Deg;
import frc.robot.commands.RotateColorWheel;
import edu.wpi.first.wpilibj.Joystick;
// 2-11-20 import edu.wpi.first.wpilibj.*;
//import edu.wpi.first.wpilibj.buttons.*;
//import frc.robot.commands.*;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);
  public Joystick driveController = new Joystick(RobotMap.OI_DRIVER_CONTROLLER);
  public Joystick driverController1 = new Joystick(RobotMap.OI_DRIVER_CONTROLLER_1);
  public JoystickButton Rotate90Button = new JoystickButton(driveController, RobotMap.Rotate90Button);
  public JoystickButton ColorWheelButton = new JoystickButton(driveController, RobotMap.ColorWheelButton);
  //public JoystickButton CylinderRetractButton = new JoystickButton(driveController, RobotMap.CylinderRetractButton);
  //public JoystickButton SuctionOnButton = new JoystickButton(driveController, RobotMap.SuctionCupsON);
  //public JoystickButton SuctionOffButton = new JoystickButton(driveController, RobotMap.SuctionCupOff);
  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());
  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
  public OI(){
    Rotate90Button.whileHeld(new Rotate90Deg());
    ColorWheelButton.whileHeld(new RotateColorWheel());
  }

}
