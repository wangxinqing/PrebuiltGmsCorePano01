package defpackage;

/* renamed from: bpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bpf extends aucj implements audy {
    public static final bpf i;
    private static volatile auef j;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public boolean e;
    public int f;
    public String g = "";
    public String h = "";

    static {
        bpf bpf = new bpf();
        i = bpf;
        aucj.a(bpf.class, (aucj) bpf);
    }

    private bpf() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u0007\u0003\u0005\u0004\u0004\u0006\b\u0005\u0007\b\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new bpf();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (bpf.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(i);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
