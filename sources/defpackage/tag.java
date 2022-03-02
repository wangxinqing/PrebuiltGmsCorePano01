package defpackage;

/* renamed from: tag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tag extends aucj implements audy {
    public static final tag d;
    private static volatile auef e;
    public int a;
    public int b;
    public aucv c = audl.b;

    static {
        tag tag = new tag();
        d = tag;
        aucj.a(tag.class, (aucj) tag);
    }

    private tag() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0014", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new tag();
        } else {
            if (i2 == 4) {
                return new aucd((int[][][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (tag.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }
}
