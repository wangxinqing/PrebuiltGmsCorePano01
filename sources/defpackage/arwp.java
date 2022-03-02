package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;

/* renamed from: arwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class arwp implements Runnable {
    private final RecyclerView a;
    private final String b;
    private final String c;
    private final acg d;
    private final aryi e;

    public arwp(aryi aryi, RecyclerView recyclerView, String str, String str2, acg acg) {
        this.e = aryi;
        this.a = recyclerView;
        this.b = str;
        this.c = str2;
        this.d = acg;
    }

    public final void run() {
        aryi aryi = this.e;
        RecyclerView recyclerView = this.a;
        String str = this.b;
        String str2 = this.c;
        acg acg = this.d;
        if (aryi.a(recyclerView)) {
            aryi.a(recyclerView, str, str2);
            return;
        }
        Log.w("AutoTestUiInjector", "ListView content is not ready, wait...");
        acg.a((aci) new arws(aryi, recyclerView, acg, str, str2));
    }
}
