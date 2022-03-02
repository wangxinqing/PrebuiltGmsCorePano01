package defpackage;

import com.google.android.gms.mdh.SyncStatus;

/* renamed from: pgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pgh {
    public final String a;
    public final pgg b;
    public aeta c = aeta.a;
    public aeta d;
    public SyncStatus e;
    public int f = 1;

    public pgh(pgj pgj, String str, aeta aeta, sah sah) {
        this.a = str;
        this.b = new pgg(pgj, this, sah);
        this.d = aeta;
    }

    public final void a() {
        this.f = 1;
        this.b.a();
    }
}
