package defpackage;

import java.util.List;

/* renamed from: vvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vvt implements acvv {
    private final vvx a;
    private final ck b;
    private final cj c;

    public vvt(vvx vvx, ck ckVar, cj cjVar) {
        this.a = vvx;
        this.b = ckVar;
        this.c = cjVar;
    }

    public final void a(Object obj) {
        vvx vvx = this.a;
        ck ckVar = this.b;
        cj cjVar = this.c;
        List list = (List) obj;
        vvx.g.a(list, true);
        int max = Math.max(0, ckVar.a - list.size());
        vvx.f.a(0, max, vvx.h).a((acvv) new vvu(vvx, list, cjVar, max));
    }
}
