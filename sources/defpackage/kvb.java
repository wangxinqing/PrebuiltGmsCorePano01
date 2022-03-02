package defpackage;

import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.query.Query;

/* renamed from: kvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kvb extends kuy {
    final /* synthetic */ Query a;
    final /* synthetic */ kwj b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kvb(icc icc, Query query, kwj kwj) {
        super(icc);
        this.a = query;
        this.b = kwj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((kvf) ibf).A().a(new QueryRequest(this.a), this.b, (kwg) new kxn(this));
    }
}
