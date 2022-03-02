package defpackage;

import android.app.PendingIntent;

/* renamed from: rke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rke extends rin {
    final /* synthetic */ PendingIntent a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rke(ibq ibq, icc icc, PendingIntent pendingIntent) {
        super(ibq, icc);
        this.a = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        rki rki = (rki) ibf;
        rio rio = new rio((rin) this);
        PendingIntent pendingIntent = this.a;
        iva.a((Object) rio, (Object) "callback == null");
        ((rjr) rki.x()).a(rki.a, pendingIntent, (rka) rio);
    }
}
