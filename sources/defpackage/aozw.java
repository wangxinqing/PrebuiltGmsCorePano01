package defpackage;

import java.security.interfaces.ECPublicKey;

/* renamed from: aozw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aozw extends aouh {
    public aozw(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aoyc aoyc = (aoyc) obj;
        aoya aoya = aoyc.b;
        if (aoya == null) {
            aoya = aoya.d;
        }
        int b = aoyn.b(aoya.b);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        ECPublicKey a = apcd.a(apar.b(b), aoyc.c.k(), aoyc.d.k());
        aoya aoya2 = aoyc.b;
        if (aoya2 == null) {
            aoya2 = aoya.d;
        }
        int b2 = aoyp.b(aoya2.a);
        if (b2 == 0) {
            b2 = 1;
        }
        int a2 = apar.a(b2);
        aoya aoya3 = aoyc.b;
        if (aoya3 == null) {
            aoya3 = aoya.d;
        }
        int b3 = aoyd.b(aoya3.c);
        if (b3 != 0) {
            i = b3;
        }
        apar.c(i);
        return new apbn(a, a2);
    }
}
