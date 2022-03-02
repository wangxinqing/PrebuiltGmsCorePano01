package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: jwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jwp extends idf {
    final /* synthetic */ jtn a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jwp(icc icc, jtn jtn) {
        super(juc.a, icc);
        this.a = jtn;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        jwu jwu = (jwu) ibf;
        jtn jtn = this.a;
        jwu.w();
        jwz jwz = new jwz((idg) null, this, (idg) null, (idg) null, (jwt) null);
        ContextManagerClientInfo contextManagerClientInfo = jwu.v;
        ((jxi) jwu.x()).b(jwz, contextManagerClientInfo.b, contextManagerClientInfo.a, contextManagerClientInfo.d, (ContextDataFilterImpl) jtn);
    }

    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new jwo(status);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.a((icl) obj);
    }
}
