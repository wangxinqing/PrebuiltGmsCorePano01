package defpackage;

import java.security.interfaces.ECPrivateKey;

/* renamed from: aozt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aozt extends aouh {
    public aozt(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aoyb aoyb = (aoyb) obj;
        aoyc aoyc = aoyb.b;
        if (aoyc == null) {
            aoyc = aoyc.e;
        }
        aoya aoya = aoyc.b;
        if (aoya == null) {
            aoya = aoya.d;
        }
        int b = aoyn.b(aoya.b);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        ECPrivateKey a = apcd.a(apar.b(b), aoyb.c.k());
        aoyc aoyc2 = aoyb.b;
        if (aoyc2 == null) {
            aoyc2 = aoyc.e;
        }
        aoya aoya2 = aoyc2.b;
        if (aoya2 == null) {
            aoya2 = aoya.d;
        }
        int b2 = aoyp.b(aoya2.a);
        if (b2 == 0) {
            b2 = 1;
        }
        int a2 = apar.a(b2);
        aoyc aoyc3 = aoyb.b;
        if (aoyc3 == null) {
            aoyc3 = aoyc.e;
        }
        aoya aoya3 = aoyc3.b;
        if (aoya3 == null) {
            aoya3 = aoya.d;
        }
        int b3 = aoyd.b(aoya3.c);
        if (b3 != 0) {
            i = b3;
        }
        return new apbm(a, a2, apar.c(i));
    }
}
