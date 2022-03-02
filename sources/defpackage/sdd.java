package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.FileGroupResponse;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: sdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sdd extends scf {
    public final rwy i;
    private final sbw j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sdd(afqn afqn, sbw sbw, FileGroupRequest fileGroupRequest, String str, int i2, scg scg, afsb afsb, rwy rwy) {
        super("GetFileGroupOperation", afqn, fileGroupRequest, str, i2, scg, afsb);
        this.j = sbw;
        this.i = rwy;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public final void a(aucd aucd, aucd aucd2) {
        if (!axsv.f()) {
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aoju aoju = (aoju) aucd2.b;
            aoju aoju2 = aoju.g;
            aoju.d = aomg.a(4);
            aoju.a |= 8;
            throw new nja(17, "GetFileGroupOp : Api Disabled");
        }
        if (this.j != null) {
            FileGroupRequest fileGroupRequest = this.c;
            FileGroupResponse fileGroupResponse = (FileGroupResponse) sbw.a.get(sbw.a(fileGroupRequest.a, fileGroupRequest.b, fileGroupRequest.c));
            if (fileGroupResponse != null) {
                this.i.a(Status.a, fileGroupResponse);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        FileGroupRequest fileGroupRequest2 = this.c;
        aflf a = afsq.a(fileGroupRequest2.a, fileGroupRequest2.b);
        afqn afqn = this.b;
        Object[] objArr = {"MDDManager", a.b, a.c};
        aorl.a(aopr.a(aopr.a(afqn.a(), (aoqb) new afqj(afqn, a), afqn.n), (aoqb) new scz(this, aucd, aucd2, arrayList), (Executor) aoqm.a), new sdc(this, aucd2, arrayList), aoqm.a);
    }

    public final void a(Status status) {
        this.i.a(status, (FileGroupResponse) null);
    }
}
