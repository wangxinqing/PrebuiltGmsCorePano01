package defpackage;

import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;

/* renamed from: jux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jux extends jws {
    final /* synthetic */ FenceUpdateRequestImpl a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jux(icc icc, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        super(icc);
        this.a = fenceUpdateRequestImpl;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        grc grc;
        jwu jwu = (jwu) ibf;
        FenceUpdateRequestImpl fenceUpdateRequestImpl = this.a;
        jwu.w();
        if (jwu.w == null) {
            jwu.w = new clc(jwu.u, jvb.a);
        }
        clc clc = jwu.w;
        ArrayList arrayList = fenceUpdateRequestImpl.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i);
            if (updateFenceOperation.c == null && (grc = updateFenceOperation.d) != null) {
                updateFenceOperation.c = (jvm) clc.a(grc);
            }
        }
        jwz a2 = jwz.a((idg) this, (jwt) null);
        ContextManagerClientInfo contextManagerClientInfo = jwu.v;
        ((jxi) jwu.x()).a((jxf) a2, contextManagerClientInfo.b, contextManagerClientInfo.a, contextManagerClientInfo.d, fenceUpdateRequestImpl);
    }
}
