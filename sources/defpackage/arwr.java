package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: arwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class arwr implements Runnable {
    private final arws a;
    private final RecyclerView b;
    private final acg c;
    private final String d;
    private final String e;

    public arwr(arws arws, RecyclerView recyclerView, acg acg, String str, String str2) {
        this.a = arws;
        this.b = recyclerView;
        this.c = acg;
        this.d = str;
        this.e = str2;
    }

    public final void run() {
        arws arws = this.a;
        RecyclerView recyclerView = this.b;
        acg acg = this.c;
        String str = this.d;
        String str2 = this.e;
        if (aryi.a(recyclerView)) {
            acg.b((aci) arws);
            arws.e.a(recyclerView, str, str2);
        }
    }
}
