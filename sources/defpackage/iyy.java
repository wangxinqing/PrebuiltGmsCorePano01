package defpackage;

import com.android.volley.Response;

/* renamed from: iyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iyy implements Response.Listener {
    final /* synthetic */ String a;
    final /* synthetic */ Response.Listener b;
    final /* synthetic */ izb c;

    public iyy(izb izb, String str, Response.Listener listener) {
        this.c = izb;
        this.a = str;
        this.b = listener;
    }

    public final void onResponse(Object obj) {
        this.c.l.a(this.a, 0);
        this.c.l.a();
        this.b.onResponse(obj);
    }
}
