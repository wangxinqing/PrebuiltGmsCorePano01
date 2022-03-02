package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: arws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arws extends aci {
    final /* synthetic */ RecyclerView a;
    final /* synthetic */ acg b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ aryi e;

    public arws(aryi aryi, RecyclerView recyclerView, acg acg, String str, String str2) {
        this.e = aryi;
        this.a = recyclerView;
        this.b = acg;
        this.c = str;
        this.d = str2;
    }

    public final void a() {
        this.e.a.post(new arwr(this, this.a, this.b, this.c, this.d));
    }
}
