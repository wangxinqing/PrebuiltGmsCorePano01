package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.leanback.widget.VerticalGridView;

/* renamed from: all  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class all extends akj {
    final /* synthetic */ alo a;

    public all(alo alo) {
        this.a = alo;
    }

    public final void a(RecyclerView recyclerView, adl adl, int i) {
        int indexOf = this.a.i.indexOf((VerticalGridView) recyclerView);
        this.a.b(indexOf);
        if (adl != null) {
            this.a.a(indexOf, ((alp) this.a.j.get(indexOf)).b + i);
        }
    }
}
