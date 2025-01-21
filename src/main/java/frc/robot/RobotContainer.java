package frc.robot;

import frc.robot.commands.intakeCmd;
import frc.robot.subsystems.intake;
import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {
  // Robot's subsystems and commands:
  private final PS5Controller ps5Controller = new PS5Controller(0);
  intake intake = new intake();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(ps5Controller, 1).whileTrue(new intakeCmd(intake, 0.5));
    new JoystickButton(ps5Controller, 2).whileTrue(new intakeCmd(intake, -0.5));
  }
}