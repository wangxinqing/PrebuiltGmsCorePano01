package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: ywb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ywb extends irq {
    public final ConnectionResult a;
    public final ysy b;

    public ywb(ywg ywg, yut yut, ConnectionResult connectionResult, ysy ysy) {
        super(ywg, yut);
        this.a = connectionResult;
        this.b = ysy;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((yut) obj).a(this.a, this.b);
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
