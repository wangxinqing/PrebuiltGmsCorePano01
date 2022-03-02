package defpackage;

/* renamed from: avtk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avtk extends aucj implements audy {
    public static final avtk k;
    private static volatile auef l;
    public int a;
    public int b;
    public avst c;
    public aucx d = auei.b;
    public avti e;
    public avtl f;
    public avtd g;
    public avth h;
    public avtf i;
    public aucx j = auei.b;

    static {
        avtk avtk = new avtk();
        k = avtk;
        aucj.a(avtk.class, (aucj) avtk);
    }

    private avtk() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0000\u0001\t\u0001\u0004\u001b\u0006\t\u0004\u0007\t\u0003\b\t\u0005\t\t\u0006\n\u0004\u0000\u000b\t\u0007\f\u001b", new Object[]{"a", "c", "d", avst.class, "f", "e", "g", "h", "b", "i", "j", avsu.class});
        } else if (i3 == 3) {
            return new avtk();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[][]) null, (float[][][]) null);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (avtk.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void c() {
        if (!this.j.a()) {
            this.j = aucj.a(this.j);
        }
    }
}
