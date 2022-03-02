package defpackage;

import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: jwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jwr extends idf {
    public jwr(icc icc) {
        super(juc.a, icc);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        jwu jwu = (jwu) ibf;
        SnapshotRequest snapshotRequest = new SnapshotRequest();
        jwu.w();
        jwz a = jwz.a((idg) this);
        ContextManagerClientInfo contextManagerClientInfo = jwu.v;
        ((jxi) jwu.x()).a((jxf) a, contextManagerClientInfo.b, contextManagerClientInfo.a, contextManagerClientInfo.d, snapshotRequest);
    }

    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new jwq(status);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.a((icl) obj);
    }
}
