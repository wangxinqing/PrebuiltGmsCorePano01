package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: msh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class msh implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ msl a;

    public msh(msl msl) {
        this.a = msl;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.a();
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
