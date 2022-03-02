package defpackage;

/* renamed from: tgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tgj {
    public final hol a;
    public final hph b;
    public ttr c;
    private final tgi d;
    private final int e;

    public tgj(int i, tgi tgi) {
        this(i, tgi, (String) null);
    }

    private final hoi b(String str, audx audx) {
        int i;
        aucd o = asky.h.o();
        int i2 = this.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asky asky = (asky) o.b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            asky.d = i3;
            asky.a |= 4;
            ttr ttr = this.c;
            if (ttr == null || !ttr.a.b()) {
                i = tgl.a();
            } else {
                i = 6;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            asky asky2 = (asky) o.b;
            asky2.c = i - 1;
            int i4 = asky2.a | 2;
            asky2.a = i4;
            if (str == null) {
                str = "NULL";
            }
            str.getClass();
            asky2.a = i4 | 1;
            asky2.b = str;
            this.d.a(o, audx);
            return this.a.a(((asky) o.i()).k());
        }
        throw null;
    }

    public final void a(audx audx, int i, int i2) {
        hoi b2 = b((String) null, audx);
        b2.b(i);
        b2.a((long) i2);
        b2.b();
    }

    public tgj(int i, tgi tgi, String str) {
        this.e = i;
        this.d = tgi;
        this.a = new hol(ihs.b(), "NEARBY", str);
        hph hph = new hph(this.a, "NEARBY_COUNTERS", 1024);
        this.b = hph;
        hph.a();
    }

    public final void a(String str, audx audx) {
        b(str, audx).b();
    }
}
