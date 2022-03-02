package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: auyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyy extends aucg implements audy {
    public static final auyy v;
    private static volatile auef x;
    public int a;
    public boolean b = true;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public boolean f = true;
    public boolean g;
    public boolean h;
    public int i = 3;
    public long j = 1000;
    public long k = 5000;
    public String l = "";
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r = 86400000;
    public int s;
    public boolean t = true;
    public int u;
    private byte w = 2;

    static {
        auyy auyy = new auyy();
        v = auyy;
        aucj.a(auyy.class, (aucj) auyy);
    }

    private auyy() {
    }

    public static /* synthetic */ void a(auyy auyy) {
        auyy.a |= 128;
        auyy.i = 3;
    }

    public static /* synthetic */ void b(auyy auyy) {
        auyy.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        auyy.j = 1000;
    }

    public static /* synthetic */ void c(auyy auyy) {
        auyy.a |= 512;
        auyy.k = 5000;
    }

    public static /* synthetic */ void d(auyy auyy) {
        auyy.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        auyy.n = false;
    }

    public static /* synthetic */ void e(auyy auyy) {
        auyy.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        auyy.o = false;
    }

    public static /* synthetic */ void f(auyy auyy) {
        auyy.a |= 131072;
        auyy.r = 86400000;
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
            return aucj.a((audx) v, "\u0001\u0013\u0000\u0001\u0001&\u0013\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\u0007\u0006\u0012\u0004\u0007\u0013\u0002\b\u0015\u0002\t\u0017\b\n\u0019\u0007\f\u001a\u0007\r\u001b\u0007\u000e\u001c\u0007\u000f!\u0002\u0011#\u0004\u0012%\u0007\u0013&\u0004\u0014", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "o", "p", "q", "r", "s", "t", "u"});
        } else if (i3 == 3) {
            return new auyy();
        } else {
            if (i3 == 4) {
                return new aucf(v);
            }
            if (i3 == 5) {
                return v;
            }
            auef auef = x;
            if (auef == null) {
                synchronized (auyy.class) {
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
}
