package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2014.commands.StartRetractCatapult;

/**
 * Lucas Wyland, Dustin, and Ian
 */
public class CatapultRetractor extends Subsystem
    {

    private SpeedController catapultVictor = RobotMap.CatapultVictor;
    public DigitalInput checkRetractorSwitch = RobotMap.limitSwitch;

    public void initDefaultCommand()
        {
        // Set the default command for a subsystem here.
        setDefaultCommand(new StartRetractCatapult());
        }

    public void retract()
        {
        catapultVictor.set(0.7);
        }

    public void stop()
        {
        catapultVictor.set(0);
        }

    public boolean CheckRetractorSwitch()
        {
        return checkRetractorSwitch.get();
        }
    }
