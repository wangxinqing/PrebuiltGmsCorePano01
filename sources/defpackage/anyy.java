package defpackage;

/* renamed from: anyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anyy extends aucj implements audy {
    public static final anyy h;
    private static volatile auef i;
    public int a;
    public aucs b = aucl.b;
    public aucs c = aucl.b;
    public int d;
    public int e;
    public long f;
    public int g;

    static {
        anyy anyy = new anyy();
        h = anyy;
        aucj.a(anyy.class, (aucj) anyy);
    }

    private anyy() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0016\u0002\u0016\u0003\u0004\u0000\u0004\u0004\u0001\u0005\u0002\u0002\u0006\u0004\u0003", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new anyy();
        } else {
            if (i3 == 4) {
                return new aucd((byte[][]) null, (char[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (anyy.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void b() {
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }

    public final void a() {
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }
}
