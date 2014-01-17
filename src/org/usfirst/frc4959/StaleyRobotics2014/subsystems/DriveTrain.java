// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2014.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem
    {
        private double sensitivity = 1.0;
    
        SpeedController rightVictor = RobotMap.driveTrainRightVictor;
        SpeedController leftVictor = RobotMap.driveTrainLeftVictor;
        RobotDrive robotDrive = RobotMap.robotDriveTrain;
          


    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand()
        {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DriveWithJoysticks());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        }

    public void falconDrive(double left, double right)
        {
            double leftPower = changeSpeed(left, sensitivity);
            double rightPower = changeSpeed(right, sensitivity);
            robotDrive.tankDrive(leftPower, rightPower);
        }

    public void takeJoystickInputs(double left, double right)
        {
            falconDrive(left, right);
        }

    public void stop()
        {
        robotDrive.drive(0, 0);
        }

    public void decreaseSensitivity()
        {
            if(sensitivity == 1.0)
            {
                sensitivity = 0.5;
                System.out.println(sensitivity);
            }  
            
        }

    public void increaseSensitivity()
        {
            if(sensitivity == 0.5)
            {
                sensitivity = 1.0;
                System.out.println(sensitivity);
            }  
            
        }

    public static double changeSpeed(double input, double sensitivity)
        {
            System.out.println(input);
            return (sensitivity * input);
        }
    }