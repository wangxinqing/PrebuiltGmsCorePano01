package defpackage;

/* renamed from: avwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avwc extends aucj implements audy {
    public static final avwc v;
    private static volatile auef x;
    public int a;
    public int b = 0;
    public Object c;
    public long d;
    public long e;
    public avvy f;
    public String g = "";
    public aucx h = auei.b;
    public aucx i = auei.b;
    public int j;
    public int k;
    public anuv l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public aucs q = aucl.b;
    public boolean r;
    public anuu s;
    public auay t = auay.b;
    public boolean u;
    private byte w = 2;

    static {
        avwc avwc = new avwc();
        v = avwc;
        aucj.a(avwc.class, (aucj) avwc);
    }

    private avwc() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.w);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.w = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) v, "\u0001\u001b\u0001\u0001\u0001\u001f\u001b\u0000\u0003\u0001\u0001\u0002\u0000\u0002\u0002\u0001\u0003\b\u0003\u0006\u001b\u0007\u001b\b\u0004\u0005\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010\t\u0011\u0011\u0007\u0012\u0012\t\u0002\u0013\u0007\u0013\u0014\u0007\u0014\u0015\u0007\u0015\u0016\u0004\u0006\u0017\u0016\u0018\u0007\u0016\u0019\t\u0017\u001a\n\u0018\u001b<\u0000\u001eм\u0000\u001f\u0007\u001a", new Object[]{"c", "b", "a", "d", "e", "g", "h", avwb.class, "i", avwa.class, "j", avwe.class, avvu.class, avvv.class, antg.class, avvx.class, avwd.class, anst.class, "l", "m", "f", "n", "o", "p", "k", "q", "r", "s", "t", avvw.class, auhm.class, "u"});
        } else if (i3 == 3) {
            return new avwc();
        } else {
            if (i3 == 4) {
                return new avvz();
            }
            if (i3 == 5) {
                return v;
            }
            auef auef = x;
            if (auef == null) {
                synchronized (avwc.class) {
                    auef = x;
                    if (auef == null) {
                        auef = new auce(v);
                        x = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void c() {
        if (!this.i.a()) {
            this.i = aucj.a(this.i);
        }
    }
}
