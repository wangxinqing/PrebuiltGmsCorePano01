package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;

/* renamed from: ajvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajvo extends ajvv {
    private DateSelector a;
    private CalendarConstraints b;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.a = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.b = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        DateSelector dateSelector = this.a;
        new ajvn(this);
        return dateSelector.g();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("DATE_SELECTOR_KEY", this.a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b);
    }
}
