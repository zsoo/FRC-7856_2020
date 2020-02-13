package frc.robot;

// 2-11-20 import com.ctre.phoenix.motorcontrol.can.TalonSRX;
// 2-11-20 import com.ctre.phoenix.sensors.PigeonIMU;

import edu.wpi.first.cameraserver.CameraServer;
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
// 2-11-20 import edu.wpi.first.networktables.NetworkTableEntry;
// 2-11-20 import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.ExampleSubsystem;
// 2-11-20 import frc.robot.subsystems.*;
// 2-11-20 import frc.robot.commands.*;
// 2-11-20 import frc.robot.subsystems.ExampleSubsystem;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static ExampleSubsystem m_subsystem = new ExampleSubsystem();
  public static Drivetrain  m_train = null;
  //public static Shooter m_shooter = null;
  //public static Suctioncups m_suction;
  public static OI m_oi;
  public static CameraServer server;
  

  // 2-11-20 TalonSRX _pigeonTalon = new TalonSRX(7);
  // 2-11-20 PigeonIMU _pigeon = new PigeonIMU(_pigeonTalon);
  // 2-11-20 int _loopCount = 0;
  // 2-11-20 edu.wpi.first.networktables.NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
 





  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    m_train = new Drivetrain();
    //m_shooter = new Shooter();
    //m_suction = new Suctioncups();
    m_oi = new OI();
    server = CameraServer.getInstance();
    server.startAutomaticCapture();
    m_chooser.setDefaultOption("Default Auto", new ExampleCommand());
    // chooser.addOption("My Auto", new MyAutoCommand());
    SmartDashboard.putData("Auto mode", m_chooser);
  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This function is called once each time the robot enters Disabled mode.
   * You can use it to reset any subsystem information you want to clear when
   * the robot is disabled.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the
   * chooser code above (like the commented example) or additional comparisons
   * to the switch structure below with additional strings & commands.
   */
  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_chooser.getSelected();

    /*
     * String autoSelected = SmartDashboard.getString("Auto Selector",
     * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
     * = new MyAutoCommand(); break; case "Default Auto": default:
     * autonomousCommand = new ExampleCommand(); break; }
     */

    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.start();
    }
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }

    
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
    // 2-11-20 final PigeonIMU.GeneralStatus genStatus = new PigeonIMU.GeneralStatus();
    // 2-11-20 _pigeon.getGeneralStatus(genStatus);
    /**
     * if(_loopCount++ > 10) { _loopCount = 0; double[] ypr = new double[3];
     * _pigeon.getYawPitchRoll(ypr); System.out.println("Pigeon Yaw is: " + ypr[0]);
     * }
     **/
    
      // 2-11-20 final NetworkTableEntry tx = table.getEntry("tx");
      // 2-11-20 final NetworkTableEntry ty = table.getEntry("ty");
      // 2-11-20 final NetworkTableEntry ta = table.getEntry("ta");

      // 2-11-20 final double x = tx.getDouble(0);
      // 2-11-20 final double y = ty.getDouble(0);
      // 2-11-20 final double area = ta.getDouble(0);
      //System.out.println(y);
      //System.out.println(x);
      //System.out.println(area);
      //System.out.println("test");
      //System.out.print(RobotMap.OI_DRIVER_CONTROLLER);
     
  }


  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
}
