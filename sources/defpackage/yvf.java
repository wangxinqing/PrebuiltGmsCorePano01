package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: yvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvf extends irq {
    private final ConnectionResult a;
    private final DataHolder b;
    private final String c;

    public yvf(ywg ywg, yum yum, ConnectionResult connectionResult, DataHolder dataHolder, String str) {
        super(ywg, yum);
        this.a = connectionResult;
        this.b = dataHolder;
        this.c = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        yxj yxj;
        yum yum = (yum) obj;
        ConnectionResult connectionResult = this.a;
        DataHolder dataHolder = this.b;
        if (dataHolder != null) {
            yxj = new yxj(dataHolder);
        } else {
            yxj = null;
        }
        yum.a(connectionResult, yxj, this.c);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        DataHolder dataHolder = this.b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
