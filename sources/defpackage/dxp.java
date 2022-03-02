package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: dxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxp implements AdapterView.OnItemClickListener {
    final /* synthetic */ dxx a;

    public dxp(dxx dxx) {
        this.a = dxx;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.a(i);
    }
}
