package defpackage;

/* renamed from: jjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjd {
    public static boolean a(apgb apgb) {
        apga apga;
        jix.g(ihs.b());
        jix.h(ihs.b());
        if ((apgb.a & 4) == 0) {
            jix.i(ihs.b());
            apga = apgb.b;
            if (apga == null) {
                apga = apga.c;
            }
        } else {
            apga = apgb.c;
            if (apga == null) {
                apga = apga.c;
            }
        }
        if (apga.a == 1) {
            return ((Boolean) apga.b).booleanValue();
        }
        return false;
    }
}
