//package com.sepapps.mikesshiftcalendar;
//
//import android.app.DialogFragment;
//import android.app.TimePickerDialog;
//import android.os.Bundle;
//import android.app.Dialog;
//import android.os.Message;
//import android.os.Handler;
//import android.text.format.DateFormat;
//import android.widget.TimePicker;
//
//import java.util.Calendar;
//
//        /*Created by ragebunny on 4/5/17.
//         */
//
//public class TimePickerFragmentOld extends DialogFragment
//implements TimePickerDialog.OnTimeSetListener {
//    int mHour;
//    int mMinute;
//    Handler mHandler;
//
//    @Override
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        /** Creating a bundle object to pass currently set time to the fragment */
//        Bundle b = getArguments();
//
//        /** Getting the hour of day from bundle */
//        mHour = b.getInt("set_hour");
//
//        /** Getting the minute of hour from bundle */
//        mMinute = b.getInt("set_minute");
//
//        TimePickerDialog.OnTimeSetListener listener = new TimePickerDialog.OnTimeSetListener() {
//            @Override
//            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//                // Do something with the time chosen by the user
//                mHour = hourOfDay;
//                mMinute = minute;
//
//                /** Creating a bundle object to pass currently set time to the fragment */
//                Bundle b = new Bundle();
//
//                /** Adding currently set hour to bundle object */
//                b.putInt("set_hour", mHour);
//
//                /** Adding currently set minute to bundle object */
//                b.putInt("set_minute", mMinute);
//
//                /** Adding Current time in a string to bundle object */
//                b.putString("set_time", "Set Time : " + Integer.toString(mHour) + " : " + Integer.toString(mMinute));
//
//                /** Creating an instance of Message */
//                Message m = new Message();
//
//                /** Setting bundle object on the message object m */
//                m.setData(b);
//
//                /** Message m is sending using the message handler instantiated in MainActivity class */
//                mHandler.sendMessage(m);
//            }
//        };
//        // Create a new instance of TimePickerDialog and return it
//        return new TimePickerDialog(getActivity(), listener, mHour, mMinute, false);
//
//    }
//
//
//}
//
//
//
//
//
//
//
