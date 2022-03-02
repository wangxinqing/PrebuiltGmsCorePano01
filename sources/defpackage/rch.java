package defpackage;

import android.app.PendingIntent;

/* renamed from: rch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rch implements igp {
    private final PendingIntent a;

    public rch(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    public final void a(Object obj, Object obj2) {
        PendingIntent pendingIntent = this.a;
        rgu rgu = (rgu) obj;
        rcj rcj = new rcj((acwd) obj2);
        rgu.w();
        iva.a((Object) rcj, (Object) "ResultHolder not provided.");
        ((rgk) rgu.x()).a(pendingIntent, (ifu) new igt(rcj));
    }
}
