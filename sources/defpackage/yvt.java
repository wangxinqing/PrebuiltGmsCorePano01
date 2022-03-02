package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: yvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvt extends irq {
    public final ConnectionResult a;
    public final ysx b;

    public yvt(ywg ywg, yup yup, ConnectionResult connectionResult, ysx ysx) {
        super(ywg, yup);
        this.a = connectionResult;
        this.b = ysx;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((yup) obj).a(this.a, this.b);
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
