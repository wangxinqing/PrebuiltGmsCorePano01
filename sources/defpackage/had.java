package defpackage;

/* renamed from: had  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class had extends aucj implements audy {
    public static final had o;
    private static volatile auef q;
    public int a;
    public hac b;
    public long c;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public String f = "";
    public String g = "";
    public String h = "";
    public boolean i;
    public int j;
    public int k = 1;
    public hag l;
    public aucx m = auei.b;
    public String n = "";
    private byte p = 2;

    static {
        had had = new had();
        o = had;
        aucj.a(had.class, (aucj) had);
    }

    private had() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.p);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.p = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) o, "\u0001\r\u0000\u0001\u0001\u0013\r\u0000\u0003\u0001\u0001\t\u0000\u0002\u0002\u0003\u0003Л\u0005\u001a\u0006\b\u0004\u0007\b\u0005\b\b\u0006\t\u0004\b\u000e\f\n\u000f\t\u000b\u0010\u001b\u0012\u0007\u0007\u0013\b\f", new Object[]{"a", "b", "c", "e", hah.class, "d", "f", "g", "h", "j", "k", hal.b(), "l", "m", har.class, "i", "n"});
        } else if (i3 == 3) {
            return new had();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) o);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = q;
            if (auef == null) {
                synchronized (had.class) {
                    auef = q;
                    if (auef == null) {
                        auef = new auce(o);
                        q = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.m.a()) {
            this.m = aucj.a(this.m);
        }
    }
}
