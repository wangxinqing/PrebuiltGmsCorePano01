package defpackage;

/* renamed from: ambk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ambk extends aucj implements audy {
    public static final ambk K;
    private static volatile auef L;
    public amap A;
    public int B;
    public amay C;
    public aman D;
    public ambj E;
    public amau F;
    public amaq G;
    public amas H;
    public ambh I;
    public ambf J;
    public int a;
    public int b;
    public amcu c;
    public amao d;
    public amar e;
    public int f;
    public amat g;
    public int h;
    public int i;
    public boolean j;
    public amax k;
    public int l;
    public amaz m;
    public ambd n;
    public ambe o;
    public int p;
    public amba q;
    public ambc r;
    public int s;
    public boolean t;
    public amam u;
    public int v;
    public ambb w;
    public amav x;
    public amaw y;
    public ambg z;

    static {
        ambk ambk = new ambk();
        K = ambk;
        aucj.a(ambk.class, (aucj) ambk);
    }

    private ambk() {
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
            return aucj.a((audx) K, "\u0001\"\u0000\u0002\u0001\"\"\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\f\u0003\u0005\t\u0004\u0006\f\u0005\u0007\f\u0006\b\u0007\u0007\t\t\b\n\f\t\u000b\t\n\f\t\u000b\r\t\f\u000e\f\r\u000f\t\u000e\u0010\t\u000f\u0011\f\u0010\u0012\u0007\u0011\u0013\t\u0012\u0014\f\u0013\u0015\t\u0014\u0016\t\u0015\u0017\t\u0016\u0018\t\u0017\u0019\t\u0018\u001a\u000b\u0019\u001b\t\u001a\u001c\t\u001b\u001d\t\u001c\u001e\t\u001d\u001f\t\u001e \t\u001f!\t \"\t!", new Object[]{"a", "b", "c", "d", "e", "f", amak.a, "g", "h", amal.a, "i", ambl.a, "j", "k", "l", amcd.a, "m", "n", "o", "p", amcs.a, "q", "r", "s", alzz.a, "t", "u", "v", alzy.b(), "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"});
        } else if (i3 == 3) {
            return new ambk();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) K);
            }
            if (i3 == 5) {
                return K;
            }
            auef auef = L;
            if (auef == null) {
                synchronized (ambk.class) {
                    auef = L;
                    if (auef == null) {
                        auef = new auce(K);
                        L = auef;
                    }
                }
            }
            return auef;
        }
    }
}
