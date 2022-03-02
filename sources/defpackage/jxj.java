package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;

/* renamed from: jxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jxj extends jws {
    final /* synthetic */ InterestUpdateBatchImpl a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jxj(InterestUpdateBatchImpl interestUpdateBatchImpl, icc icc) {
        super(icc);
        this.a = interestUpdateBatchImpl;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        jwu jwu = (jwu) ibf;
        InterestUpdateBatchImpl interestUpdateBatchImpl = this.a;
        jwu.w();
        jwz a2 = jwz.a((idg) this, (jwt) null);
        ContextManagerClientInfo contextManagerClientInfo = jwu.v;
        ((jxi) jwu.x()).a((jxf) a2, contextManagerClientInfo.b, contextManagerClientInfo.a, contextManagerClientInfo.d, interestUpdateBatchImpl);
    }
}
