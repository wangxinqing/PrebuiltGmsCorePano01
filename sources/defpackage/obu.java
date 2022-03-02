package defpackage;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;

/* renamed from: obu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class obu extends DialogFragment {
    public String a;
    public obt b;
    private String c;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.b = (obt) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement OnDatePickListener"));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.a = arguments.getString("tag");
        this.c = arguments.getString("current_date");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(DateFormat.getDateInstance().parse(this.c));
        } catch (ParseException e) {
        }
        return new DatePickerDialog(getActivity(), new obs(this), instance.get(1), instance.get(2), instance.get(5));
    }
}
