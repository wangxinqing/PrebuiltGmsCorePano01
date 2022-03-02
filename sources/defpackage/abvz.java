package defpackage;

import android.util.SparseArray;

/* renamed from: abvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abvz {
    public byte[] a;
    public int b = -1;
    public int c = 0;
    public final SparseArray d = new SparseArray();

    public final void a(acci acci) {
        System.arraycopy(acci.e.k(), 0, this.a, this.c, acci.e.a());
        this.b = acci.c;
        this.c += acci.e.a();
        acci acci2 = (acci) this.d.get(this.b + 1);
        if (acci2 != null) {
            a(acci2);
        }
    }
}
