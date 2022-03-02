package defpackage;

/* renamed from: avqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avqg extends aucj implements audy {
    public static final avqg i;
    private static volatile auef j;
    public int a;
    public String b = "";
    public aucm c = aual.b;
    public aucv d = audl.b;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public auay g = auay.b;
    public aucn h = aubm.b;

    static {
        avqg avqg = new avqg();
        i = avqg;
        aucj.a(avqg.class, (aucj) avqg);
    }

    private avqg() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0005\u0000\u0001\b\u0000\u0002\u0019\u0003\u0014\u0004\u001a\u0005\u001b\u0006\n\u0001\u0007\u0012", new Object[]{"a", "b", "c", "d", "e", "f", avqi.class, "g", "h"});
        } else if (i3 == 3) {
            return new avqg();
        } else {
            if (i3 == 4) {
                return new avqf();
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (avqg.class) {
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

    public final void c() {
        if (!this.c.a()) {
            aucm aucm = this.c;
            int size = aucm.size();
            this.c = aucm.a(size != 0 ? size + size : 10);
        }
    }

    public final void e() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }

    public final void f() {
        if (!this.e.a()) {
            this.e = aucj.a(this.e);
        }
    }

    public final void g() {
        if (!this.h.a()) {
            aucn aucn = this.h;
            int size = aucn.size();
            this.h = aucn.a(size != 0 ? size + size : 10);
        }
    }
}
