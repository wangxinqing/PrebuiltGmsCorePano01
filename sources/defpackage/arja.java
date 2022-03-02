package defpackage;

/* renamed from: arja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arja extends aucj implements audy {
    public static final arja D;
    private static volatile auef E;
    public boolean A;
    public int B;
    public boolean C;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public long s;
    public long t;
    public boolean u;
    public boolean v;
    public long w;
    public float x;
    public float y;
    public boolean z;

    static {
        arja arja = new arja();
        D = arja;
        aucj.a(arja.class, (aucj) arja);
    }

    private arja() {
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
            return aucj.a((audx) D, "\u0001\u001c\u0000\u0001\u0001\u001c\u001c\u0000\u0000\u0000\u0001\u000b\u0000\u0002\u000b\u0001\u0003\u000b\u0002\u0004\u000b\u0004\u0005\u0001\t\u0006\u0001\n\u0007\u0001\f\b\u0001\r\t\u0007\u0013\n\u0007\u0014\u000b\u0001\u000b\f\u000b\u0003\r\u000b\u0005\u000e\u000b\u0006\u000f\u000b\u0007\u0010\u0003\u0015\u0011\u0001\u0016\u0012\u0001\u0017\u0013\u0003\u000f\u0014\u0003\u0010\u0015\u0003\u0011\u0016\u0003\u0012\u0017\u0007\u0018\u0018\u000b\b\u0019\u0001\u000e\u001a\u0007\u0019\u001b\u000b\u001a\u001c\u0007\u001b", new Object[]{"a", "b", "c", "d", "f", "k", "l", "n", "o", "u", "v", "m", "e", "g", "h", "i", "w", "x", "y", "q", "r", "s", "t", "z", "j", "p", "A", "B", "C"});
        } else if (i3 == 3) {
            return new arja();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) D);
            }
            if (i3 == 5) {
                return D;
            }
            auef auef = E;
            if (auef == null) {
                synchronized (arja.class) {
                    auef = E;
                    if (auef == null) {
                        auef = new auce(D);
                        E = auef;
                    }
                }
            }
            return auef;
        }
    }
}
