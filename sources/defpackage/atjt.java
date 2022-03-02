package defpackage;

/* renamed from: atjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atjt extends aucj implements audy {
    private static volatile auef A;
    public static final auct v = new atjp();
    public static final atjt z;
    public int a;
    public int b;
    public aucx c = auei.b;
    public atme d;
    public atku e;
    public atlj f;
    public atjb g;
    public atlu h;
    public atln i;
    public atlf j;
    public atje k;
    public atji l;
    public atkz m;
    public atmh n;
    public atjz o;
    public atlc p;
    public atlr q;
    public atly r;
    public atme s;
    public atmk t;
    public aucs u = aucl.b;
    public atlo w;
    public atlv x;
    public atmn y;

    static {
        atjt atjt = new atjt();
        z = atjt;
        aucj.a(atjt.class, (aucj) atjt);
    }

    private atjt() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        Class<atjt> cls = atjt.class;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) z, "\u0001\u0017\u0000\u0001\u0001\u0019\u0017\u0000\u0002\u0000\u0001\f\u0000\u0002\u001b\u0003\t\u0001\u0004\t\u0002\u0005\t\u0003\u0006\t\u0004\u0007\t\u0005\b\t\u0006\t\t\u0007\n\t\b\u000b\t\t\f\t\n\u000f\t\r\u0010\t\u000e\u0011\t\u000f\u0012\t\u0010\u0013\t\u0011\u0014\t\u0012\u0015\t\u0013\u0016\u001e\u0017\t\u0014\u0018\t\u0015\u0019\t\u0016", new Object[]{"a", "b", atjs.b(), "c", cls, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", atjv.b(), "w", "x", "y"});
        } else if (i3 == 3) {
            return new atjt();
        } else {
            if (i3 == 4) {
                return new atjq();
            }
            if (i3 == 5) {
                return z;
            }
            auef auef = A;
            if (auef == null) {
                synchronized (cls) {
                    auef = A;
                    if (auef == null) {
                        auef = new auce(z);
                        A = auef;
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
