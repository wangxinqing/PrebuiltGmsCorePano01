package defpackage;

/* renamed from: apfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apfd extends aucj implements audy {
    public static final apfd h;
    private static volatile auef j;
    public int a;
    public long b;
    public avrf c;
    public String d = "";
    public auay e = auay.b;
    public boolean f;
    public apfz g;
    private byte i = 2;

    static {
        apfd apfd = new apfd();
        h = apfd;
        aucj.a(apfd.class, (aucj) apfd);
    }

    private apfd() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.i);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.i = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0001\u0002\u0002\u0001\u0004Љ\u0003\u0005\b\u0004\u0006\n\u0005\u0007\u0007\u0006\b\t\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new apfd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (apfd.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(h);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
