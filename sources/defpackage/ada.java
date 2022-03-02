package defpackage;

import android.util.SparseArray;

/* renamed from: ada  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ada {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    static final long a(long j, long j2) {
        return j != 0 ? ((j / 4) * 3) + (j2 / 4) : j2;
    }

    public final void a() {
        this.b++;
    }

    public final void b() {
        this.b--;
    }

    public final acz a(int i) {
        acz acz = (acz) this.a.get(i);
        if (acz != null) {
            return acz;
        }
        acz acz2 = new acz();
        this.a.put(i, acz2);
        return acz2;
    }
}
