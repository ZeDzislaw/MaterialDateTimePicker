package com.wdullaer.materialdatetimepicker.time;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class TimePickerDialogTest {
    @Test
    public void getPickerResolutionShouldReturnSecondIfSecondsAreEnabled() {
        TimePickerDialog tpd = TimePickerDialog.newInstance(null, false, Locale.getDefault());
        tpd.enableSeconds(true);
        Assert.assertEquals(tpd.getPickerResolution(), Timepoint.TYPE.SECOND);
    }

    @Test
    public void getPickerResolutionShouldReturnMinuteIfMinutesAreEnabled() {
        TimePickerDialog tpd = TimePickerDialog.newInstance(null, false, Locale.getDefault());
        tpd.enableSeconds(false);
        tpd.enableMinutes(true);
        Assert.assertEquals(tpd.getPickerResolution(), Timepoint.TYPE.MINUTE);
    }

    @Test
    public void getPickerResolutionShouldReturnHourIfMinutesAndSecondsAreDisabled() {
        TimePickerDialog tpd = TimePickerDialog.newInstance(null, false, Locale.getDefault());
        tpd.enableMinutes(false);
        Assert.assertEquals(tpd.getPickerResolution(), Timepoint.TYPE.HOUR);
    }
}
