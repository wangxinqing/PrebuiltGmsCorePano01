package defpackage;

/* renamed from: bpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bpd extends aucj implements audy {
    public static final bpd j;
    private static volatile auef k;
    public int a;
    public String b = "";
    public long c;
    public boolean d;
    public aucx e = auei.b;
    public int f;
    public int g;
    public String h = "";
    public boolean i;

    static {
        bpd bpd = new bpd();
        j = bpd;
        aucj.a(bpd.class, (aucj) bpd);
    }

    private bpd() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0007\u0002\u0004\u001b\u0005\u0004\u0003\u0006\f\u0004\u0007\b\u0005\b\u0007\u0006", new Object[]{"a", "b", "c", "d", "e", bpf.class, "f", "g", bpb.a, "h", "i"});
        } else if (i3 == 3) {
            return new bpd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (bpd.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.e.a()) {
            this.e = aucj.a(this.e);
        }
    }
}
