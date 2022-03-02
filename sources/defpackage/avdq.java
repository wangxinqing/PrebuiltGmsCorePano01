package defpackage;

/* renamed from: avdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avdq extends aucj implements audy {
    public static final avdq A;
    private static volatile auef C;
    private boolean B = true;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public boolean l;
    public double m;
    public long n;
    public int o;
    public int p;
    public aucx q = auei.b;
    public boolean r;
    public int s;
    public int t;
    public boolean u;
    public long v;
    public String w = "";
    public String x = "";
    public String y = "";
    public int z;

    static {
        avdq avdq = new avdq();
        A = avdq;
        aucj.a(avdq.class, (aucj) avdq);
    }

    private avdq() {
    }

    public static /* synthetic */ void a(avdq avdq) {
        avdq.a |= 32;
        avdq.B = true;
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
            return aucj.a((audx) A, "\u0001\u001a\u0000\u0001\u0001\u001f\u001a\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\u0007\u0007\n\u0002\t\u000b\u0002\n\f\u0002\u000b\r\u0007\f\u000e\u0000\r\u000f\u0002\u0010\u0010\f\u0011\u0012\u0004\u0013\u0015\u001b\u0017\u0007\u0014\u0018\f\u0015\u0019\f\u0016\u001a\u0007\u0017\u001b\u0002\u0018\u001c\b\u0019\u001d\b\u001a\u001e\b\u001b\u001f\f\u001c", new Object[]{"a", "b", "c", "d", "e", "f", "B", "g", "h", "i", "j", "k", "l", "m", "n", "o", avdo.a, "p", "q", avdt.class, "r", "s", avdm.a, "t", avdm.a, "u", "v", "w", "x", "y", "z", avdl.a});
        } else if (i3 == 3) {
            return new avdq();
        } else {
            if (i3 == 4) {
                return new avdk();
            }
            if (i3 == 5) {
                return A;
            }
            auef auef = C;
            if (auef == null) {
                synchronized (avdq.class) {
                    auef = C;
                    if (auef == null) {
                        auef = new auce(A);
                        C = auef;
                    }
                }
            }
            return auef;
        }
    }
}
