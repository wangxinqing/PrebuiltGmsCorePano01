package defpackage;

import java.nio.charset.Charset;

/* renamed from: aqcs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqcs {
    public static final aogc a;
    private static final Charset b = Charset.forName("UTF-8");
    private final aqcw c;
    private final aqcz d;

    static {
        aucd o = aogc.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aogc aogc = (aogc) o.b;
        int i = aogc.a | 1;
        aogc.a = i;
        aogc.b = 0;
        int i2 = i | 2;
        aogc.a = i2;
        aogc.c = 0;
        aogc.a = i2 | 4;
        aogc.d = 0;
        a = (aogc) o.i();
    }

    public aqcs(String str, String str2) {
        aucd o = aqcw.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqcw aqcw = (aqcw) o.b;
        str.getClass();
        int i = aqcw.a | 2;
        aqcw.a = i;
        aqcw.c = str;
        int i2 = i | 1;
        aqcw.a = i2;
        aqcw.b = 201216073;
        str2.getClass();
        aqcw.a = i2 | 4;
        aqcw.d = str2;
        this.c = (aqcw) o.i();
        aucd o2 = aqcz.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqcz aqcz = (aqcz) o2.b;
        aqcz.b = 3;
        aqcz.a |= 1;
        this.d = (aqcz) o2.i();
    }

    public static String a(anir anir) {
        anjd g = anir.g();
        if (g != null) {
            return g.b;
        }
        Object i = anir.i();
        if (i instanceof String) {
            return (String) i;
        }
        return i != null ? i.getClass().getName() : "null";
    }

    public static int b(anir anir) {
        return anln.a().a(a(anir), b).c();
    }

    public final aucd a(aoiq aoiq, Object... objArr) {
        aucd o = aqcx.f.o();
        aucd o2 = aqcv.d.o();
        aqcw aqcw = this.c;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqcv aqcv = (aqcv) o2.b;
        aqcw.getClass();
        aqcv.b = aqcw;
        int i = aqcv.a | 1;
        aqcv.a = i;
        aqcz aqcz = this.d;
        aqcz.getClass();
        aqcv.c = aqcz;
        aqcv.a = i | 2;
        aqcv aqcv2 = (aqcv) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqcx aqcx = (aqcx) o.b;
        aqcv2.getClass();
        aqcx.b = aqcv2;
        int i2 = aqcx.a | 1;
        aqcx.a = i2;
        aoiq.getClass();
        aqcx.c = aoiq;
        aqcx.a = i2 | 2;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            aqcr aqcr = objArr[i3];
            if (aqcr instanceof aqcr) {
                aqcr aqcr2 = aqcr;
                int i4 = aqcr2.a;
                aucd o3 = aqdb.d.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aqdb aqdb = (aqdb) o3.b;
                aqdb.a |= 1;
                aqdb.b = i3;
                String aqcr3 = aqcr2.toString();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aqdb aqdb2 = (aqdb) o3.b;
                aqcr3.getClass();
                aqdb2.a |= 2;
                aqdb2.c = aqcr3;
                aqdb aqdb3 = (aqdb) o3.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aqcx aqcx2 = (aqcx) o.b;
                aqdb3.getClass();
                if (!aqcx2.e.a()) {
                    aqcx2.e = aucj.a(aqcx2.e);
                }
                aqcx2.e.add(aqdb3);
            }
        }
        return o;
    }
}
