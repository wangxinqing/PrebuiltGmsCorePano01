package defpackage;

/* renamed from: ioc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ioc extends imt {
    public ioc() {
        super("LogRecentFixes", 0);
    }

    /* access modifiers changed from: protected */
    public final boolean a(inb inb) {
        return !inb.c.a();
    }

    /* access modifiers changed from: protected */
    public final inb b(inb inb) {
        Throwable th;
        ilw ilw = new ilw();
        try {
            for (imb imb : ilw.b()) {
                inx inx = inb.c;
                aogo aogo = (aogo) aogx.e.o();
                aogr aogr = imb.h;
                if (aogo.c) {
                    aogo.c();
                    aogo.c = false;
                }
                aogx aogx = (aogx) aogo.b;
                aogx.b = aogr.j;
                aogx.a |= 1;
                aucd o = aogp.c.o();
                String str = imb.b;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aogp aogp = (aogp) o.b;
                str.getClass();
                aogp.a |= 1;
                aogp.b = str;
                if (aogo.c) {
                    aogo.c();
                    aogo.c = false;
                }
                aogx aogx2 = (aogx) aogo.b;
                aogp aogp2 = (aogp) o.i();
                aogp2.getClass();
                aogx2.c = aogp2;
                aogx2.a |= 2;
                aucd o2 = aogw.e.o();
                String str2 = imb.c;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aogw aogw = (aogw) o2.b;
                str2.getClass();
                aogw.a |= 1;
                aogw.b = str2;
                int a = aogv.a((int) imb.g);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aogw aogw2 = (aogw) o2.b;
                int i = a - 1;
                if (a != 0) {
                    aogw2.c = i;
                    int i2 = aogw2.a | 2;
                    aogw2.a = i2;
                    if ((i2 & 2) == 0) {
                        aogw2.c = 0;
                        aogw2.a = i2 | 2;
                    }
                    if (aogo.c) {
                        aogo.c();
                        aogo.c = false;
                    }
                    aogx aogx3 = (aogx) aogo.b;
                    aogw aogw3 = (aogw) o2.i();
                    aogw3.getClass();
                    aogx3.a();
                    aogx3.d.add(aogw3);
                    inx.a((aogx) aogo.i());
                    ilw.a(new imb(imb.a, imb.b, imb.c, imb.d, imb.e, imb.g, imb.h, false, imb.f));
                } else {
                    throw null;
                }
            }
            inb inb2 = inb;
            ilw.close();
            ina d = inb.d();
            d.a(this, 3);
            return d.a();
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }
}
