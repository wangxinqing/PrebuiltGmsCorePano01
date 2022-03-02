package defpackage;

import java.security.interfaces.ECPublicKey;

/* renamed from: aowj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aowj extends aouh {
    public aowj(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aoyi aoyi = (aoyi) obj;
        aoyg aoyg = aoyi.b;
        if (aoyg == null) {
            aoyg = aoyg.d;
        }
        aoyj aoyj = aoyg.a;
        if (aoyj == null) {
            aoyj = aoyj.d;
        }
        int b = aoyn.b(aoyj.a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        ECPublicKey a = apcd.a(aows.b(b), aoyi.c.k(), aoyi.d.k());
        aoye aoye = aoyg.b;
        if (aoye == null) {
            aoye = aoye.b;
        }
        aoyw aoyw = aoye.a;
        if (aoyw == null) {
            aoyw = aoyw.d;
        }
        aowt aowt = new aowt(aoyw);
        byte[] k = aoyj.c.k();
        int b2 = aoyp.b(aoyj.b);
        if (b2 == 0) {
            b2 = 1;
        }
        String a2 = aows.a(b2);
        int b3 = aoxy.b(aoyg.c);
        if (b3 != 0) {
            i = b3;
        }
        return new apbq(a, k, a2, aows.c(i), aowt);
    }
}
