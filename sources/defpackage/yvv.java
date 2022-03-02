package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: yvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvv extends irq {
    private final ConnectionResult a;
    private final ysw b;

    public yvv(ywg ywg, yuq yuq, ConnectionResult connectionResult, ysw ysw) {
        super(ywg, yuq);
        this.a = connectionResult;
        this.b = ysw;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((yuq) obj).a(this.a, this.b);
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
