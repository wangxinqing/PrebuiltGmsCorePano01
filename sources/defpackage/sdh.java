package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupRequest;

/* renamed from: sdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sdh extends scf {
    public final ifu i;
    private final boolean j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sdh(afqn afqn, FileGroupRequest fileGroupRequest, String str, int i2, scg scg, afsb afsb, ifu ifu, boolean z) {
        super("SetFileGroupActivationOperation", afqn, fileGroupRequest, str, i2, scg, afsb);
        this.i = ifu;
        this.j = z;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return this.j ? 5 : 6;
    }

    /* access modifiers changed from: protected */
    public final void a(aucd aucd, aucd aucd2) {
        if (!axsv.f() || !axsv.e()) {
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aoju aoju = (aoju) aucd2.b;
            aoju aoju2 = aoju.g;
            aoju.d = aomg.a(4);
            aoju.a |= 8;
            throw new nja(17, "SetFileGroupActivationOperation : Api Disabled");
        } else if (!this.d.equals(this.c.b)) {
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aoju aoju3 = (aoju) aucd2.b;
            aoju aoju4 = aoju.g;
            aoju3.d = aomg.a(6);
            aoju3.a |= 8;
            throw new nja(10, "SetFileGroupActivationOperation : Caller not the owner");
        } else {
            FileGroupRequest fileGroupRequest = this.c;
            aflf a = afsq.a(fileGroupRequest.a, fileGroupRequest.b);
            afqn afqn = this.b;
            boolean z = this.j;
            Object[] objArr = {"MDDManager", a.b, a.c};
            aorl.a(aopr.a(afqn.a(), (aoqb) new afpm(afqn, a, z), afqn.n), new sdg(this, aucd2), aoqm.a);
        }
    }

    public final void a(Status status) {
        this.i.a(status);
    }
}
