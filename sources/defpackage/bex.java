package defpackage;

import com.android.volley.Request;

/* renamed from: bex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bex implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ Request c;

    public bex(Request request, String str, long j) {
        this.c = request;
        this.a = str;
        this.b = j;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
        Request request = this.c;
        request.a.a(request.toString());
    }
}
