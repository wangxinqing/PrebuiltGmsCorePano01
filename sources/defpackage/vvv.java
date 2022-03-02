package defpackage;

import java.util.List;

/* renamed from: vvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vvv implements acvv {
    private final vvx a;
    private final ci b;
    private final cl c;

    public vvv(vvx vvx, ci ciVar, cl clVar) {
        this.a = vvx;
        this.b = ciVar;
        this.c = clVar;
    }

    public final void a(Object obj) {
        vvx vvx = this.a;
        ci ciVar = this.b;
        cl clVar = this.c;
        List list = (List) obj;
        vvx.g.a(list, false);
        Integer valueOf = Integer.valueOf(((Integer) clVar.a).intValue() + 5);
        if (!ciVar.a.a()) {
            if (ciVar.a.a != 1) {
                cm cmVar = ciVar.b;
                synchronized (cmVar.b) {
                    cmVar.d = valueOf;
                }
            } else {
                cm cmVar2 = ciVar.b;
                synchronized (cmVar2.b) {
                    cmVar2.c = valueOf;
                }
            }
            ciVar.a.a(new co(list, (byte[]) null));
        }
    }
}
