package defpackage;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: dqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqb extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    private dqa a;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (dqa) activity;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Bundle arguments = getArguments();
        int i7 = 0;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d,yyyy h:mm a");
            if (arguments.getCharArray("dateString") != null) {
                Date parse = simpleDateFormat.parse(String.valueOf(arguments.getCharArray("dateString")));
                i5 = parse.getYear() + 1900;
                try {
                    i4 = parse.getMonth();
                    try {
                        i6 = parse.getDate();
                        i7 = i4;
                    } catch (ParseException e) {
                        e = e;
                        Log.e("DatePickerFragment", "Failed to parse text when creating date picker dialog", e);
                        i3 = i5;
                        i2 = i4;
                        i = 0;
                        return new DatePickerDialog(getActivity(), this, i3, i2, i);
                    }
                } catch (ParseException e2) {
                    e = e2;
                    i4 = 0;
                    Log.e("DatePickerFragment", "Failed to parse text when creating date picker dialog", e);
                    i3 = i5;
                    i2 = i4;
                    i = 0;
                    return new DatePickerDialog(getActivity(), this, i3, i2, i);
                }
            } else {
                i6 = 0;
                i5 = 0;
            }
            i = i6;
            i3 = i5;
            i2 = i7;
        } catch (ParseException e3) {
            e = e3;
            i5 = 0;
            i4 = 0;
            Log.e("DatePickerFragment", "Failed to parse text when creating date picker dialog", e);
            i3 = i5;
            i2 = i4;
            i = 0;
            return new DatePickerDialog(getActivity(), this, i3, i2, i);
        }
        return new DatePickerDialog(getActivity(), this, i3, i2, i);
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.a.a(getArguments().getInt("buttonId"), i, i2, i3);
    }
}
