package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.google.android.gms.family.widget.DateSpinner;

/* renamed from: mqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mqy implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Spinner a;
    final /* synthetic */ DateSpinner b;

    public mqy(DateSpinner dateSpinner, Spinner spinner) {
        this.b = dateSpinner;
        this.a = spinner;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        DateSpinner.a(this.a, this.b.b);
        DateSpinner dateSpinner = this.b;
        mhu mhu = dateSpinner.d;
        if (mhu != null) {
            mhu.a(dateSpinner.b());
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
