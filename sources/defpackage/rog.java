package defpackage;

import android.app.PendingIntent;

/* renamed from: rog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rog extends rol {
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ rom b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rog(rom rom, PendingIntent pendingIntent) {
        super(false);
        this.b = rom;
        this.a = pendingIntent;
    }

    public final icf a() {
        icc icc = this.b.b;
        return icc.b((idf) new rfu(icc, this.a));
    }
}
