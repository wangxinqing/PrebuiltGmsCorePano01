package defpackage;

/* renamed from: afgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afgu {
    private static aumm a(aeso aeso, boolean z) {
        aucd o = aumm.e.o();
        aucd o2 = auml.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auml auml = (auml) o2.b;
        auml.a = 1;
        auml.b = Boolean.valueOf(z);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aumm aumm = (aumm) o.b;
        auml auml2 = (auml) o2.i();
        auml2.getClass();
        if (!aumm.b.a()) {
            aumm.b = aucj.a(aumm.b);
        }
        aumm.b.add(auml2);
        boolean a = aeso.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aumm aumm2 = (aumm) o.b;
        aumm2.a |= 1;
        aumm2.c = a;
        int b = aeso.b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aumm aumm3 = (aumm) o.b;
        aumm3.a |= 2;
        aumm3.d = b;
        return (aumm) o.i();
    }

    public static boolean a(aump aump) {
        return aump.e != -1;
    }

    public static aump a(aesl aesl) {
        int a = aesl.a();
        if (a == 1) {
            aumk aumk = (aumk) aump.h.o();
            if (aumk.c) {
                aumk.c();
                aumk.c = false;
            }
            aump aump = (aump) aumk.b;
            aump.b = 1;
            aump.a = 1 | aump.a;
            return (aump) aumk.i();
        } else if (a != 2) {
            aumk aumk2 = (aumk) aump.h.o();
            if (aumk2.c) {
                aumk2.c();
                aumk2.c = false;
            }
            aump aump2 = (aump) aumk2.b;
            aump2.b = 0;
            aump2.a = 1 | aump2.a;
            return (aump) aumk2.i();
        } else {
            aumk aumk3 = (aumk) aump.h.o();
            if (aumk3.c) {
                aumk3.c();
                aumk3.c = false;
            }
            aump aump3 = (aump) aumk3.b;
            aump3.b = 2;
            aump3.a |= 1;
            aumk3.a(a(aesl.d(), false));
            aumk3.a(a(aesl.e(), true));
            aumk3.b(a(aesl.b(), false));
            aumk3.b(a(aesl.c(), true));
            if (aesl.f() != null) {
                int intValue = aesl.f().intValue();
                if (aumk3.c) {
                    aumk3.c();
                    aumk3.c = false;
                }
                aump aump4 = (aump) aumk3.b;
                aump4.a = 2 | aump4.a;
                aump4.e = intValue;
            }
            boolean g = aesl.g();
            if (aumk3.c) {
                aumk3.c();
                aumk3.c = false;
            }
            aump aump5 = (aump) aumk3.b;
            aump5.a |= 4;
            aump5.f = g;
            boolean h = aesl.h();
            if (aumk3.c) {
                aumk3.c();
                aumk3.c = false;
            }
            aump aump6 = (aump) aumk3.b;
            aump6.a |= 8;
            aump6.g = h;
            return (aump) aumk3.i();
        }
    }
}
