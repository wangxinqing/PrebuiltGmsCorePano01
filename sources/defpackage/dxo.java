package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: dxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dxo extends acy {
    final /* synthetic */ dxx a;

    public dxo(dxx dxx) {
        this.a = dxx;
    }

    public final void a(RecyclerView recyclerView, int i) {
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        dzv dzv;
        if (i2 > 0 && (dzv = this.a.s.d) != null && dzv.getVisibility() == 0 && recyclerView.getScrollState() == 1) {
            this.a.a(false);
        }
    }
}
