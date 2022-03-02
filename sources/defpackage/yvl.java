package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: yvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvl extends irq {
    private final ConnectionResult a;
    private final String b;

    public yvl(ywg ywg, ymu ymu, ConnectionResult connectionResult, String str) {
        super(ywg, ymu);
        this.a = connectionResult;
        this.b = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ymt ymt;
        ymu ymu = (ymu) obj;
        ConnectionResult connectionResult = this.a;
        String str = this.b;
        if (ymu.e && (ymt = ymu.d) != null) {
            ymt.a(str, !connectionResult.b());
        }
        ymu.e = false;
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
