package defpackage;

/* renamed from: avdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avdi extends aucj implements audy {
    public static final avdi h;
    private static volatile auef k;
    public int a;
    public aucx b = auei.b;
    public String c = "";
    public aucv d = audl.b;
    public long e;
    public avdq f;
    public long g;
    private boolean i;
    private audr j = audr.b;

    static {
        avdi avdi = new avdi();
        h = avdi;
        aucj.a(avdi.class, (aucj) avdi);
    }

    private avdi() {
    }

    public static /* synthetic */ void a(avdi avdi) {
        avdi.a |= 2;
        avdi.i = true;
    }

    public final void c() {
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
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
            return aucj.a((audx) h, "\u0001\b\u0000\u0001\u0001\n\b\u0001\u0002\u0000\u0001\u001b\u0002\b\u0000\u0003\u0014\u0004\u0007\u0001\u00072\b\u0002\u0003\t\t\u0004\n\u0002\u0005", new Object[]{"a", "b", avdf.class, "c", "d", "i", "j", avdh.a, "e", "f", "g"});
        } else if (i3 == 3) {
            return new avdi();
        } else {
            if (i3 == 4) {
                return new avdg();
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (avdi.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(h);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
