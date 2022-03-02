package defpackage;

import android.app.PendingIntent;

/* renamed from: rdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rdr implements igp {
    private final PendingIntent a;

    public rdr(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    public final void a(Object obj, Object obj2) {
        PendingIntent pendingIntent = this.a;
        rgu rgu = (rgu) obj;
        rdt rdt = new rdt((acwd) obj2);
        rgu.w();
        iva.a((Object) pendingIntent, (Object) "PendingIntent must be specified.");
        iva.a((Object) rdt, (Object) "ResultHolder not provided.");
        ((rgk) rgu.x()).a(pendingIntent, (rgh) new rgt(rdt), rgu.c.getPackageName());
    }
}
