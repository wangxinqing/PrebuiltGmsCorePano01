package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: hza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hza implements AdapterView.OnItemClickListener {
    final /* synthetic */ hzc a;

    public hza(hzc hzc) {
        this.a = hzc;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        hzc.a.b("Account selected: %d", Integer.valueOf(i));
        if (i >= this.a.h.getHeaderViewsCount()) {
            hzc hzc = this.a;
            hzc.b.c = i;
            hzc.d = i - hzc.h.getHeaderViewsCount();
            hzc hzc2 = this.a;
            hzc2.c = 3;
            hzc2.k();
        }
    }
}
