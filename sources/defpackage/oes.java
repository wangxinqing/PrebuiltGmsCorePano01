package defpackage;

import com.android.volley.Response;

/* renamed from: oes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class oes implements Runnable {
    private final oeu a;
    private final long b;

    public oes(oeu oeu, long j) {
        this.a = oeu;
        this.b = j;
    }

    public final void run() {
        long j;
        oeu oeu = this.a;
        long j2 = this.b;
        if (oeu.d.k()) {
            if (ofq.b(axms.a.a().c())) {
                j = oeu.b();
            } else {
                j = j2;
            }
            oez.a(oeu.a, oeu.c, oeu.b, j, (Response.Listener) oeu, (Response.ErrorListener) oeu, oeu.h);
        }
    }
}
