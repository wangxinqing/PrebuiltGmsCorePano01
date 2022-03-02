package defpackage;

import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.query.Query;

/* renamed from: kun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kun extends kuz {
    final /* synthetic */ Query a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kun(icc icc, Query query) {
        super(icc);
        this.a = query;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((kvf) ibf).A().a(new QueryRequest(this.a), (kwg) new kut(this));
    }
}
