package defpackage;

import android.app.PendingIntent;

/* renamed from: akya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akya extends akhl {
    final /* synthetic */ njy b;
    final /* synthetic */ PendingIntent c;
    final /* synthetic */ akyn d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akya(akyn akyn, icc icc, njy njy, PendingIntent pendingIntent) {
        super(icc);
        this.d = akyn;
        this.b = njy;
        this.c = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final icf a() {
        amky b2 = this.b.b("ConnectionCallbacks");
        try {
            rgb.a(this.d.k, this.c);
            akyn akyn = this.d;
            icf a = rgb.a(akyn.k, akyn.j);
            if (b2 != null) {
                b2.close();
            }
            return a;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
