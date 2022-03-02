package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: ee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ee implements dg, df {
    static final TreeMap h = new TreeMap();
    public final long[] a;
    final double[] b;
    final String[] c;
    public final byte[][] d;
    public final int[] e;
    final int f;
    int g;
    private volatile String i;

    private ee(int i2) {
        this.f = i2;
        int i3 = i2 + 1;
        this.e = new int[i3];
        this.a = new long[i3];
        this.b = new double[i3];
        this.c = new String[i3];
        this.d = new byte[i3][];
    }

    public static ee a(String str, int i2) {
        synchronized (h) {
            Map.Entry ceilingEntry = h.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                h.remove(ceilingEntry.getKey());
                ee eeVar = (ee) ceilingEntry.getValue();
                eeVar.b(str, i2);
                return eeVar;
            }
            ee eeVar2 = new ee(i2);
            eeVar2.b(str, i2);
            return eeVar2;
        }
    }

    public final String a() {
        return this.i;
    }

    public final void a(int i2, long j) {
        throw null;
    }

    public final void a(int i2, byte[] bArr) {
        throw null;
    }

    public final void b() {
        synchronized (h) {
            h.put(Integer.valueOf(this.f), this);
            if (h.size() > 15) {
                int size = h.size() - 10;
                Iterator it = h.descendingKeySet().iterator();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, int i2) {
        this.i = str;
        this.g = i2;
    }

    public final void close() {
    }

    public final void a(int i2) {
        this.e[i2] = 1;
    }

    public final void a(int i2, String str) {
        this.e[i2] = 4;
        this.c[i2] = str;
    }

    public final void a(df dfVar) {
        for (int i2 = 1; i2 <= this.g; i2++) {
            int i3 = this.e[i2];
            if (i3 == 1) {
                dfVar.a(i2);
            } else if (i3 == 2) {
                dfVar.a(i2, this.a[i2]);
            } else if (i3 == 3) {
                ((dn) dfVar).a.bindDouble(i2, this.b[i2]);
            } else if (i3 == 4) {
                dfVar.a(i2, this.c[i2]);
            } else if (i3 == 5) {
                dfVar.a(i2, this.d[i2]);
            }
        }
    }
}
