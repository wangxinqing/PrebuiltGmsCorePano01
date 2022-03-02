package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

/* renamed from: dql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dql implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ dqm a;

    public dql(dqm dqm) {
        this.a = dqm;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ((TextView) adapterView.getChildAt(0)).setTextColor(-1);
        this.a.a.c.b(i);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
