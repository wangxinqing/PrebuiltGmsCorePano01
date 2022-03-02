package defpackage;

import android.app.PendingIntent;

/* renamed from: aira  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aira implements Runnable {
    private final aire a;
    private final aiph b;
    private final PendingIntent c;
    private final Object d;
    private final boolean e;
    private final ajrb f;
    private final String g;
    private final ifu h;

    public aira(aire aire, aiph aiph, PendingIntent pendingIntent, Object obj, boolean z, ajrb ajrb, String str, ifu ifu) {
        this.a = aire;
        this.b = aiph;
        this.c = pendingIntent;
        this.d = obj;
        this.e = z;
        this.f = ajrb;
        this.g = str;
        this.h = ifu;
    }

    public final void run() {
        aire aire = this.a;
        this.b.a(aire.a, aire.d(), this.c, this.d, this.e, this.f, this.g, this.h, aire.j);
    }
}
