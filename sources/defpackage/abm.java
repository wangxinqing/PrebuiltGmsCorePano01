package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: abm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abm implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ abs a;

    public abm(abs abs) {
        this.a = abs;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        aan aan;
        if (i != -1 && (aan = this.a.e) != null) {
            aan.a = false;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
