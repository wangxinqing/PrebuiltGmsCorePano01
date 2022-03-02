package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: wug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wug implements wuj {
    final xon a;
    final List b;
    private final String c;

    public wug(String str, xon xon, List list) {
        this.c = str;
        this.a = xon;
        this.b = list;
    }

    public final int a() {
        aucd o = xom.d.o();
        xon xon = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        xom xom = (xom) o.b;
        xon.getClass();
        xom.b = xon;
        xom.a |= 1;
        o.ae(this.b);
        xom xom2 = (xom) o.i();
        int i = xom2.U;
        if (i != -1) {
            return i;
        }
        int b2 = aueh.a.a((Object) xom2).b(xom2);
        xom2.U = b2;
        return b2;
    }

    public final String b() {
        return this.c;
    }

    public final Map c() {
        return anfu.b;
    }

    public final byte[] a(int i) {
        aucd o = xom.d.o();
        xon xon = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        xom xom = (xom) o.b;
        xon.getClass();
        xom.b = xon;
        xom.a |= 1;
        xom xom2 = (xom) o.i();
        int i2 = xom2.U;
        if (i2 == -1) {
            i2 = aueh.a.a((Object) xom2).b(xom2);
            xom2.U = i2;
        }
        int i3 = 0;
        while (i3 < this.b.size()) {
            xoo xoo = (xoo) this.b.get(i3);
            int i4 = xoo.U;
            if (i4 == -1) {
                i4 = aueh.a.a((Object) xoo).b(xoo);
                xoo.U = i4;
            }
            i2 += i4;
            if (i2 > i) {
                break;
            }
            i3++;
        }
        o.ae(this.b.subList(0, i3));
        return ((xom) o.i()).k();
    }
}
