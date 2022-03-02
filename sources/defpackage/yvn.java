package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;

/* renamed from: yvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvn extends irq {
    private final ConnectionResult a;
    private final MomentsFeed b;

    public yvn(ywg ywg, ynp ynp, ConnectionResult connectionResult, MomentsFeed momentsFeed) {
        super(ywg, ynp);
        this.a = connectionResult;
        this.b = momentsFeed;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ynp ynp = (ynp) obj;
        ConnectionResult connectionResult = this.a;
        MomentsFeed momentsFeed = this.b;
        ynp.a = connectionResult;
        ynp.b = momentsFeed;
        ynp.deliverResult(momentsFeed);
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
