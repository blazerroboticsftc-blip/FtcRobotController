package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        // runs 50x* a second
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double diffXJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("left x", gamepad1.left_stick_x);
        telemetry.addData("left y", speedForward);
        telemetry.addData("right y", gamepad1.right_stick_y);
        telemetry.addData("right x", gamepad1.right_stick_x);
        telemetry.addData("difference", diffXJoysticks);

        telemetry.addData("B", gamepad1.b);
        telemetry.addData("a", gamepad1.a);

        telemetry.addData("sum triggers",sumTriggers);
    }

    /*
    1. add telemetry for the right joystick
    2. add telemetry for the B button
    3. add telemetry data to report the DIFFERENCE between X left joystick and X right joystick.
    4. add telemetry data to report the sum of both rear triggers.
     */
}
