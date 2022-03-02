package defpackage;

/* renamed from: aufd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aufd extends aucj implements audy {
    public static final aufd b;
    private static volatile auef c;
    public long a;

    static {
        aufd aufd = new aufd();
        b = aufd;
        aucj.a(aufd.class, (aucj) aufd);
    }

    private aufd() {
    }

    public static aufd a(long j) {
        aucd o = b.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aufd) o.b).a = j;
        return (aufd) o.i();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"a"});
        } else if (i2 == 3) {
            return new aufd();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (aufd.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
