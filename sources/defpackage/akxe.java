package defpackage;

import android.app.PendingIntent;

/* renamed from: akxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxe {
    public final adut a;

    public akxe(adut adut) {
        this.a = adut;
    }

    public final acwa a(PendingIntent pendingIntent) {
        adut adut = this.a;
        return adut.b((ihb) new aduo(adut, pendingIntent));
    }

    public final acwa b(PendingIntent pendingIntent) {
        adut adut = this.a;
        iha b = ihb.b();
        b.a = new aduk(adut, pendingIntent);
        return adut.b(b.a());
    }
}
