//----------------------------------------------------------------------------
// Copyright (c) FIRST 2008. All Rights Reserved.
// Open Source Software - may be modified and shared by FRC teams. The code
// must be accompanied by the FIRST BSD license file in the root directory of
// the project.
//
// File: Kicker.java
//
// Description: Primary task logic for the kicking mechanism
//
// Lead: TBD
//
// Revision Log:
// 12/1  - First design of kicker task (Mark)
// 12/10 - Fixed bug so kicker will turn off after turning on (Kyle)
// ----------------------------------------------------------------------------

package tasks;

import edu.wpi.first.wpilibj.Jaguar;


public class Kicker {

    private Jaguar Kicker;
    private boolean Slow_Kick_On = false;


    public Kicker(){

        Kicker = new Jaguar(Constants.DIO_SLOT, Constants.KICKER_CHNL);

    }

    public void Perform_Teleop(boolean Fast_Kick_Button,
                               boolean Slow_Kick_Button,
                               boolean Reverse_Kick_Button){


//        if(Slow_Kick_On){
//
//            if(Fast_Kick_Button){
//                Kicker.set(0.9);
//                Slow_Kick_On = false;
//            }
//            else if(Slow_Kick_Button){
//                Kicker.set(0);
//                Slow_Kick_On = false;
//            }
//            else if(Reverse_Kick_Button){
//                Kicker.set(-0.2);
//            }else{
//                Kicker.set(0.5);
//            }
//
//        } else{

        if(Fast_Kick_Button){
            Kicker.set(-0.9);
        }
        else if(Slow_Kick_Button){
            Kicker.set(-0.5);
            //Slow_Kick_On = true;
        }
        else if(Reverse_Kick_Button){
            Kicker.set(0.2);
        }
        else {
            Kicker.set(0);
        }

        //}
    }

}
