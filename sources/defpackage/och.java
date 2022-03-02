package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: och  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class och implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ ocj a;

    public och(ocj ocj) {
        this.a = ocj;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        oct oct = this.a.a;
        if (oct != null) {
            oct.a();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
