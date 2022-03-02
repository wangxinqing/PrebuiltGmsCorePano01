package defpackage;

import java.util.Comparator;

/* renamed from: cip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cip extends cim {
    private long b = 0;

    public cip(int i, Comparator comparator, boolean z) {
        super(i, comparator, z);
    }

    public final void a(cij cij) {
        super.a(cij);
        this.b = cbi.i().a();
    }

    public final boolean a(long j) {
        boolean z;
        long a = cbi.i().a();
        if (a - this.b <= j) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {Boolean.valueOf(z), Long.valueOf(a), Long.valueOf(this.b), Long.valueOf(j)};
        return z;
    }
}
