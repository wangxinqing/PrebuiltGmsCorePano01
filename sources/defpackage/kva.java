package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.query.Query;

/* renamed from: kva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kva extends kuz {
    final /* synthetic */ Query a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kva(icc icc, Query query) {
        super(icc);
        this.a = query;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((kvf) ibf).A().b(new QueryRequest(this.a), new kvd(this));
    }

    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new kve(status);
    }
}
