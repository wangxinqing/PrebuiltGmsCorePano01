package defpackage;

import java.util.Comparator;

/* renamed from: anhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anhg {
    public final int a;
    public final Comparator b;
    public final Object[] c;
    public int d;
    public Object e;

    public anhg(Comparator comparator, int i) {
        boolean z;
        amrl.a((Object) comparator, (Object) "comparator");
        this.b = comparator;
        this.a = i;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, "k (%s) must be >= 0", i);
        amrl.a(true, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        long j = (long) i;
        long j2 = j + j;
        int i2 = (int) j2;
        aonu.a(j2 != ((long) i2) ? false : z2, "checkedMultiply", i, 2);
        this.c = new Object[i2];
        this.d = 0;
        this.e = null;
    }
}
