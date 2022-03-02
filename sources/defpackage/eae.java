package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: eae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eae extends acy {
    final /* synthetic */ eaf a;

    public eae(eaf eaf) {
        this.a = eaf;
    }

    public final void a(RecyclerView recyclerView, int i) {
        this.a.a(i);
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        eaf eaf = this.a;
        int max = Math.max(0, eaf.getChildPosition(eaf.getChildAt(0)));
        eaf eaf2 = this.a;
        eaf2.a(max, eaf2.getChildCount(), this.a.getAdapter().a());
        this.a.a.a();
        acy acy = this.a.b;
        if (acy != null) {
            acy.a(recyclerView, i, i2);
        }
    }
}
